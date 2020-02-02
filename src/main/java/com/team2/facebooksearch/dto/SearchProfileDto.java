package com.team2.facebooksearch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchProfileDto {
    private String userId;
    private String userName;
    private String imageUrl;
    private String gender;
    private String email;
    private Date DOB;
    private Long mobileNumber;
    private List<String> interests;
    private String profileType;
    private String displayType;
    private HashSet<String> friendIds;
    private HashSet<String> pendingFriendIds;
}
