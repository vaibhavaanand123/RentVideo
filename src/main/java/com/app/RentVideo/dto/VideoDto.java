package com.app.RentVideo.dto;

import lombok.Data;

@Data
public class VideoDto {

    private Long id;
    private String title;
    private String director;
    private String genre;
    private Boolean available;
    
}
