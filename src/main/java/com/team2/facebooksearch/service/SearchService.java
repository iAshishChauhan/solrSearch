package com.team2.facebooksearch.service;

import com.team2.facebooksearch.document.SearchProfile;
import com.team2.facebooksearch.dto.SearchProfileDto;

import java.util.List;

public interface SearchService {
    SearchProfile save(SearchProfile searchProfile);
    List<SearchProfile> findByString(String name);
    SearchProfileDto send(SearchProfileDto searchProfileDto);
}
