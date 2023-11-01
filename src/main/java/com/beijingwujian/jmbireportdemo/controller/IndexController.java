package com.beijingwujian.jmbireportdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(IndexController.class);
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "jimureport");
        logger.info("*******************************willis*****************************************");
        return "jmreport/list"; // 视图重定向 - 跳转
    }
}
