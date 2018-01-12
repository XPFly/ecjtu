package com.ecjtu.bbm.service;

import com.ecjtu.bbm.orm.domain.Test;

/**
 * @description: 测试：Service接口
 * @author: xu_pf@suixingpay.com
 * @date: 2018/1/12
 */
public interface TestService {
    /**
     * 根据UUID查询
     *
     * @param uuid  UUID
     * @return      Test
     */
    Test findById(String uuid);
}
