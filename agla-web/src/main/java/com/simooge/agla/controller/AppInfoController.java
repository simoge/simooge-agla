package com.simooge.agla.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * App info. This is just a test controller.
 * Created by sikaijian on 16/11/25.
 */
@RestController
@RequestMapping("/appInfo")
public class AppInfoController {
    @RequestMapping(method = RequestMethod.GET)
    public String showAppInfo() {
        return "Hello World!";
    }
}
