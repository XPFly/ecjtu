package com.ecjtu.bbm.orm.mapper;

import com.ecjtu.bbm.orm.domain.Test;

/**
 * @description: 测试：mapper
 * @author: xu_pf@suixingpay.com
 * @date: 2018/1/12
 */
public interface TestMapper {
    /**
     * 根据UUID查询
     *
     * @param uuid  UUID
     * @return      Test
     */
    Test findById(String uuid);
}
