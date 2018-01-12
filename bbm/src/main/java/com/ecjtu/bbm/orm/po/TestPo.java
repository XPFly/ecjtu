package com.ecjtu.bbm.orm.po;

import java.io.Serializable;

/**
 * @description: 测试：实体Po
 * @author: xu_pf@suixingpay.com
 * @date: 2018/1/12
 */
public class TestPo implements Serializable{
    /**
     * UUID
     */
    private String uuid;
    /**
     * NAME
     */
    private String name;
    /**
     * AGE
     */
    private String age;

    public TestPo() {
    }

    public TestPo(String uuid, String name, String age) {
        this.uuid = uuid;
        this.name = name;
        this.age = age;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestPo{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
