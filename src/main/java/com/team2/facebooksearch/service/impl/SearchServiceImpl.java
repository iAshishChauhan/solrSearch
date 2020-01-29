package com.team2.facebooksearch.service.impl;

import com.team2.facebooksearch.document.SearchProfile;
import com.team2.facebooksearch.repository.SearchRepository;
import com.team2.facebooksearch.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SearchServiceImpl implements SearchService {

    @Autowired
    SearchRepository searchRepository;

    @Override
    public String save(SearchProfile searchProfile) {
        searchRepository.save(searchProfile);
        return "OK";
    }

    @Override
    public List<SearchProfile> findByString(String name) {
        return searchRepository.findByString(name);
    }
}
