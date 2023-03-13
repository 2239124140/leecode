package com.founder.leecode.pay;

import org.springframework.util.StringUtils;

public enum PaySourceEnum {
    ALI("ali","阿里"),
    JD("jd","京东");

    private String code;
    private String name;

    private PaySourceEnum (String code,String name){
        this.code = code;
        this.name = name;
    }
    public static PaySourceEnum get(String code){
        if(StringUtils.isEmpty(code)){
            return null;
        }
        PaySourceEnum[] values = PaySourceEnum.values();
        for (PaySourceEnum value : values) {

            if(code.equals(value.code)){
                return value;
            }
        }
        return null;
    }

}
