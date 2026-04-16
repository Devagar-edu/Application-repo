package com.demo.service;

import com.thoughtworks.xstream.XStream;

public class XmlService {

    public Object parseXml(String xml) {
        XStream xstream = new XStream();
        return xstream.fromXML(xml); // unsafe
    }
}
