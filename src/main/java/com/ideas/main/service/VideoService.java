package com.ideas.main.service;

import com.ideas.main.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoService extends JpaRepository<Video, Integer>  {
}
