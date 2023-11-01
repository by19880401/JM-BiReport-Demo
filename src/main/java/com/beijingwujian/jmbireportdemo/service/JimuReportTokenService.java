package com.beijingwujian.jmbireportdemo.service;

import com.beijingwujian.jmbireportdemo.utils.TokenUtils;
import org.jeecg.modules.jmreport.api.JmReportTokenServiceI;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Component
public class JimuReportTokenService implements JmReportTokenServiceI {


    @Override
    public String getToken(HttpServletRequest request) {
//        return TokenUtils.getTokenByRequest(request);
        return "123456";
    }


    @Override
    public String getUsername(String s) {
        return "admin";
    }

    @Override
    public String[] getRoles(String s) {
        return new String[]{"admin"};
    }

    @Override
    public Boolean verifyToken(String s) {
        return true;
    }

    @Override
    public Map<String, Object> getUserInfo(String token) {
        return JmReportTokenServiceI.super.getUserInfo(token);
    }

    @Override
    public HttpHeaders customApiHeader() {
        HttpHeaders header = new HttpHeaders();
        header.add("custom-header1", "Please set a custom value 1");
        header.add("token", "token value 2");
        return header;
    }

    @Override
    public String getTenantId() {
        return "1";
    }
}
