package com.team2.facebooksearch.controller;

import com.team2.facebooksearch.document.SearchProfile;
import com.team2.facebooksearch.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("search")
public class SearchController {

    @Autowired
    SearchService searchService;

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
