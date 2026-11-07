package org.example.crm.controller;

import org.example.crm.service.CustomerServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CustomerController {

    CustomerServiceImpl service = new CustomerServiceImpl();

    public String getName(){
        String name = service.getName();
        return name;
    }
}
