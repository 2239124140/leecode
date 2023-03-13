package com.founder.leecode.controller;

import com.founder.leecode.pay.BasePay;
import com.founder.leecode.pay.PaySourceEnum;
import com.founder.leecode.pay.PayTemlate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PayController {

    @RequestMapping("/pay")
    public void pay(@RequestParam(value = "code") String code){
        PaySourceEnum paySourceEnum = PaySourceEnum.get(code);
        PayTemlate payTemlate = BasePay.payMap.get(paySourceEnum);
        payTemlate.pay();
    }
}
