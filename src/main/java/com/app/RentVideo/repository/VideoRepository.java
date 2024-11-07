package com.app.RentVideo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.RentVideo.entity.VideoEntity;

@Repository
public interface VideoRepository extends JpaRepository<VideoEntity,Long> {
    
}
