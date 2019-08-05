package com.spring.Controller;

import com.spring.Mapper.UserMapper;
import com.spring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: springbboot_exceperience
 * @description: test Mapper
 * @author: 荒城
 * @create: 2019-08-05 19:13
 */
@Controller
public class MapperController {
    @Autowired
    private UserMapper userMapper;
@RequestMapping("/queryUser")
@ResponseBody
    public List<User> queryUser() {
       List<User> users=userMapper.queryUserList();

    return users;
    }
}









