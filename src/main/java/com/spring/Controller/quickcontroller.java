package com.spring.Controller;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springbboot_exceperience
 * @description: idea quick enviroment start
 * @author: 荒城
 * @create: 2019-08-03 20:31
 */
@Controller
@ConfigurationProperties(prefix="person")
public class quickcontroller {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //  @Value("${person.name}")
    private String name;


    @RequestMapping("/quick")
    @ResponseBody//返回字符串形式
    public String quick()
    {
        return "SpringBoot 访问成功"+name;
    }

}
