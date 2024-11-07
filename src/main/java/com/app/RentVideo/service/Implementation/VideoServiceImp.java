package com.app.RentVideo.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.RentVideo.dto.VideoDto;
import com.app.RentVideo.entity.VideoEntity;
import com.app.RentVideo.mapper.VideoMapper;
import com.app.RentVideo.repository.VideoRepository;
import com.app.RentVideo.service.VideoService;

public class VideoServiceImp implements VideoService{

    @Autowired
    private VideoRepository videoRepository;

    @Override
    public VideoDto creatVideo(VideoDto videoDto) {
        
        VideoEntity videoEntity=VideoMapper.convertToEntity(videoDto);

        VideoEntity savedVideo= videoRepository.save(videoEntity);

        return VideoMapper.convertTDto(savedVideo);
    }
    
}
