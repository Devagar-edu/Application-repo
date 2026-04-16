package com.demo.controller;

import com.demo.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class VulnController {

    private XmlService xmlService = new XmlService();


    @PostMapping("/xml")
    public Object parseXml(@RequestBody String xml) {
        return xmlService.parseXml(xml);
    }
}

