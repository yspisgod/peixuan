package com.ysp.controller;

import com.ysp.dao.UserAccountMapper;
import com.ysp.entity.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    UserAccountMapper userAccountMapper;
    @RequestMapping("/test")
    public @ResponseBody
    UserAccount test(){
        UserAccount result = userAccountMapper.selectByPrimaryKey(1);
        System.out.println(result);
        return result;
    }
}
