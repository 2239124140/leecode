package com.founder.leecode.pay;

import java.util.HashMap;
import java.util.Map;

public class BasePay implements PayTemlate{
    public static Map<PaySourceEnum,PayTemlate> payMap= new HashMap<>();
    @Override
    public void pay() {
        System.out.println("基础支付");
    }
}
