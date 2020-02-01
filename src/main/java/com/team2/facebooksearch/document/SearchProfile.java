package com.team2.facebooksearch.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.Date;
import java.util.List;

@Data
@SolrDocument(collection = "searchfb")
@AllArgsConstructor
@NoArgsConstructor
public class SearchProfile {
    @Id
    @Field
    private String userId;
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
