package com.team2.facebooksearch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchProfileDto {
    private String userId;
    private String userName;
    private String imageUrl;
    private String gender;
    private String email;
    private Date dob;
    private String mobileNumber;
}
