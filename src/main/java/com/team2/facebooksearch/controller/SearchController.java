package com.team2.facebooksearch.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team2.facebooksearch.document.SearchProfile;
import com.team2.facebooksearch.dto.SearchProfileDto;
import com.team2.facebooksearch.service.SearchService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("search")
public class SearchController {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    String TOPIC="CRM";

    @Autowired
    SearchService searchService;

    @KafkaListener(topics = "facebook",groupId = "group_id")
    public void addKafka(String kafkaProduct) throws JsonProcessingException {
        System.out.println(kafkaProduct);
        SearchProfile searchProfile=new SearchProfile();
        ObjectMapper objectMapper = new ObjectMapper();
        SearchProfileDto searchProfileDto = objectMapper.readValue(kafkaProduct, SearchProfileDto.class);
        searchService.send(searchProfileDto);
        BeanUtils.copyProperties(searchProfileDto,searchProfile);
        SearchProfile searchProfileCreated = searchService.save(searchProfile);
    }

    @PostMapping("/save")
    public String save(@RequestBody SearchProfile searchProfile) {
        searchService.save(searchProfile);
        return "OK";
    }

    @GetMapping("/getAll/{name}")
    private List<SearchProfile> getByName(@PathVariable(value = "name") String name) {
        return searchService.findByString(name);
    }

}
