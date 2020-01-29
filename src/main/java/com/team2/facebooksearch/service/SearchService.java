package com.team2.facebooksearch.service;

import com.team2.facebooksearch.document.SearchProfile;

import java.util.List;

public interface SearchService {
    String save(SearchProfile searchProfile);
    List<SearchProfile> findByString(String name);
}
