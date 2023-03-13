package com.founder.leecode.pay;

import org.springframework.beans.factory.InitializingBean;

public class JdPayAdater extends BasePay implements InitializingBean {
    @Override
    public void pay() {
        System.out.println("京东支付");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        payMap.put(PaySourceEnum.JD,this);
    }
}
