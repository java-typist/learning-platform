package com.jason.usermodule.controller;

import com.jason.usermodule.dao.UserDao;
import com.jason.usermodule.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2020/3/13 15:14
 * @modify 2020/3/13 15:14
 */
@RestController
public class BaseController {

    @Resource
    UserDao userDao;

    @GetMapping(value = "/test")
    public UserInfo test(@RequestParam(value = "level") String level) {
        System.out.println(level);
        Map map = new HashMap();
        map.put("level", level);
        return userDao.selectByUsername(map);
    }
}
