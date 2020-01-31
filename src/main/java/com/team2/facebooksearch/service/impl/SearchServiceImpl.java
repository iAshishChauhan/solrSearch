package com.team2.facebooksearch.service.impl;

import com.team2.facebooksearch.document.SearchProfile;
import com.team2.facebooksearch.repository.SearchRepository;
import com.team2.facebooksearch.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    SearchRepository searchRepository;

    @Override
    public SearchProfile save(SearchProfile searchProfile) {
        return searchRepository.save(searchProfile);
    }

    @Override
    public List<SearchProfile> findByString(String name) {
        return searchRepository.findByString(name);
    }
}
