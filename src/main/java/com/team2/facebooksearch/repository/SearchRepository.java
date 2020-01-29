package com.team2.facebooksearch.repository;
import com.team2.facebooksearch.document.SearchProfile;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SearchRepository extends SolrCrudRepository<SearchProfile, Long> {

    @Query("userName:*?0*")
    List<SearchProfile> findByString(String name);
}
