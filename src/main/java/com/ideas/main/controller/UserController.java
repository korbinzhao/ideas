package com.ideas.main.controller;

import com.ideas.main.model.Result;
import com.ideas.main.model.User;
import com.ideas.main.service.UserService;
import com.ideas.main.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/user", method = RequestMethod.POST)
    public Result<User> addUser(@RequestBody User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUtil.error(-1, bindingResult.getFieldError().getDefaultMessage());
        }

        return ResultUtil.success(userService.save(user));
    }

    @RequestMapping(value="/users")
    public Result<List> getUsers(){
        return ResultUtil.success(userService.findAll());
    }
}
