package com.team2.facebooksearch.dto;

import lombok.Data;

import java.util.Date;
@Data
public class SearchProfileDto {
    private long userId;
    private long personalId;
    private String userName;
    private String imageUrl;
    private String gender;
    private String email;
    private Date dob;
    private String mobileNumber;
}
