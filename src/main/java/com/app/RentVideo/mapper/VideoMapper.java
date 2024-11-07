package com.app.RentVideo.mapper;

import com.app.RentVideo.dto.VideoDto;
import com.app.RentVideo.entity.VideoEntity;

public class VideoMapper {

    public static VideoDto convertTDto(VideoEntity videoEntity){
        VideoDto videoDto = new VideoDto();

        videoDto.setId(videoEntity.getId());
        videoDto.setTitle(videoEntity.getTitle());
        videoDto.setDirector(videoEntity.getDirector());
        videoDto.setGenre(videoEntity.getGenre());
        videoDto.setAvailable(videoEntity.getAvailable());
        return videoDto;
    }

    public static VideoEntity convertToEntity(VideoDto videoDto){

        VideoEntity videoEntity = new VideoEntity();

        videoEntity.setId(videoDto.getId());
        videoEntity.setTitle(videoDto.getTitle());
        videoEntity.setDirector(videoDto.getDirector());
        videoEntity.setGenre(videoDto.getGenre());
        videoEntity.setAvailable(videoDto.getAvailable());
        return videoEntity;

    }


    
}
