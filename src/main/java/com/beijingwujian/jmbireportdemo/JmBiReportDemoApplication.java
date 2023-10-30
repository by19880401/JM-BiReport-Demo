package com.beijingwujian.jmbireportdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.jeecg.modules.jmreport","org.jeecg.modules.jmreport"})
public class JmBiReportDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmBiReportDemoApplication.class, args);
    }

}
