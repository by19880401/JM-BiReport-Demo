package com.beijingwujian.jmbireportdemo;

import com.beijingwujian.jmbireportdemo.controller.IndexController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(scanBasePackages = {"org.jeecg.modules.jmreport.*","com.beijingwujian.*"})
@CrossOrigin
@EnableAsync
public class JmBiReportDemoApplication {
    private static Logger logger = LoggerFactory.getLogger(JmBiReportDemoApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(JmBiReportDemoApplication.class, args);
        Environment env = application.getEnvironment();
        String port = env.getProperty("server.port");
        String path = env.containsProperty("server.servlet.context-path")?env.getProperty("server.servlet.context-path"):"";
        logger.info("Application JimuReport Demo is running! Access URL:Local: http://localhost:{}{}/jmreport/list",port,path);
    }

}
