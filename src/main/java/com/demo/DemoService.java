package com.demo.web;

import javax.annotation.PostConstruct;

public class DemoService {

    @PostConstruct
    public void init() {
        System.out.println("Init");
    }
}