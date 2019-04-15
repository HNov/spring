package com.nov.spring.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class IndexServiceImpl implements IndexService {

//    private  String name="nnn";

    public void query() {
        System.out.println("**********  query ********");
    }
}
