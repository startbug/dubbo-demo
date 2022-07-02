package com.ggs.controller;

import com.ggs.pojo.User;
import com.ggs.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lianghaohui
 * @Date 2022/4/10 21:50
 * @Description
 */
@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired  //本地注入
    /**
     * 1.从zookeeper注册中心获取UserService的访问url
     * 2.进行远程调用RPC
     * 3.将结果封装为一个代理对象，给变量赋值
     */
    @Reference  //远程注入
    private UserService userService;

    @GetMapping("/sayHello")
    public String sayHello() {
        System.out.println("你好啊啊啊啊啊啊啊啊");
        return userService.sayHello();
    }

    @GetMapping("/find")
    public User find(int id) {
        return userService.findUserById(id);
    }

}
