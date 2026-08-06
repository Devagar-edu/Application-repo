package com.demo.controller;

import com.demo.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class VulnController {

    private XmlService xmlService = new XmlService(); // SECURITY-FIX: CVE-2015-7501


    @PostMapping("/xml")
    public Object parseXml(@RequestBody String xml) {
        return xmlService.parseXml(xml);
    }
}