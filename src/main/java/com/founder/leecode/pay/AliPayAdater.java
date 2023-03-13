package com.founder.leecode.pay;

import org.springframework.beans.factory.InitializingBean;

public class AliPayAdater extends BasePay implements InitializingBean {
    @Override
    public void pay() {
        System.out.println("阿里支付");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        payMap.put(PaySourceEnum.ALI,this);
    }
}
