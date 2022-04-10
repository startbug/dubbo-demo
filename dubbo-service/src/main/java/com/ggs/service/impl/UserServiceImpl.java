package com.ggs.service.impl;

import com.ggs.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author lianghaohui
 * @Date 2022/4/10 21:00
 * @Description
 */
//@Service  //将该类的对象创建出来，放到Spring的IOC容器中，bean定义 org.springframework.stereotype.Service;
@Service    //将这个类提供的方法（服务）对外发布，将访问的地址ip，端口，路径注册到注册中心中 org.apache.dubbo.config.annotation.Service;
public class UserServiceImpl implements UserService {

    public String sayHello() {
        return "hello dubboaaassssssssssss~ !";
    }

}
