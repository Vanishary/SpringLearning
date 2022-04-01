package com.ssm.controller;

import com.ssm.po.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {
    @RequestMapping("/testJson")
    @ResponseBody
    public Customer testJson(@RequestBody Customer customer) {
        System.out.println(customer.toString());
        return customer;
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Customer selectCustomer(@PathVariable("id") Integer id) {
        System.out.println(id);
        Customer customer = new Customer();
        if(id==10){
            customer.setLoginname("wujit");
        }
        return customer;
    }
}
