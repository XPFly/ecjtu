package com.ecjtu.bbm.service.impl;

import com.ecjtu.bbm.orm.domain.Test;
import com.ecjtu.bbm.orm.mapper.TestMapper;
import com.ecjtu.bbm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 测试：service实现类
 * @author: xu_pf@suixingpay.com
 * @date: 2018/1/12
 */
@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestMapper testMapper;

    @Override
    public Test findById(String uuid) {
        return testMapper.findById(uuid);
    }
}
