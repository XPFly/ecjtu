package com.ecjtu.bbm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: xu_pf@suixingpay.com
 * @date: 2018/1/12
 */
@Controller
@SpringBootApplication
public class StartApp {
    public static void main(String[] args) {
        SpringApplication.run(StartApp.class,args);
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
