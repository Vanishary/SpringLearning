package com.ssm.controller;

import com.ssm.po.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {
    @RequestMapping("/testJson")
    @ResponseBody
    public Customer testJson(@RequestBody Customer customer) {
        System.out.println(customer.toString());
        return customer;
    }
}
