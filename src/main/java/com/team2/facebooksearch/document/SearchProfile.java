package com.team2.facebooksearch.document;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.Date;

@Data
@SolrDocument(collection = "fbsearch")
public class SearchProfile {
    @Id
    @Field
    private long userId;
    @Field
    private long personalId;
    @Field
    private String userName;
    @Field
    private String imageUrl;
    @Field
    private String gender;
    @Field
    private String email;
    @Field
    private Date dob;
    @Field
    private String mobileNumber;
}
