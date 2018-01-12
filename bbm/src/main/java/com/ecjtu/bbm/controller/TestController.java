package com.ecjtu.bbm.controller;

import com.ecjtu.bbm.orm.domain.Test;
import com.ecjtu.bbm.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 测试：controller
 * @author: xu_pf@suixingpay.com
 * @date: 2018/1/12
 */
@Controller
public class TestController {

    @Autowired
    private TestServiceImpl testService;

    /**
     * 根据UUID查询
     *
     * @param uuid  UUID
     * @return      String
     */
    @RequestMapping("/findById/{uuid}")
    @ResponseBody
    public String findById(@PathVariable("uuid") String uuid){

        Test test = testService.findById(uuid);

        return test.toString();
    }
}
