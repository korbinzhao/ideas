package com.ideas.main.controller;

import com.ideas.main.model.Result;
import com.ideas.main.model.Video;
import com.ideas.main.service.VideoService;
import com.ideas.main.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;

    @RequestMapping(value="/video", method = RequestMethod.POST)
    public Result<Video> addVideo(@RequestBody Video video, BindingResult bindingResult){


        System.out.println(video);

        if(bindingResult.hasErrors()){
            return ResultUtil.error(-1, bindingResult.getFieldError().getDefaultMessage());
        }

        return ResultUtil.success(videoService.save(video));

    }

    @RequestMapping(value="/videos")
    public Result<List> getAllVideos(){

        return ResultUtil.success(videoService.findAll());

    }

}
