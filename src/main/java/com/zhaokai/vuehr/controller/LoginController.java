package com.zhaokai.vuehr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Created by ZhaoKai on 2019/10/8 23:11
 */
@RestController
public class LoginController {
    @RequestMapping("/login")
    public void login(HttpServletResponse resp) throws IOException {
        resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        resp.setContentType("application/json;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.write("{\"status\":\"error\",\"msg\":\"尚未登录，请登录!\"}");
        out.flush();
        out.close();
        //        return new RespBean("error", "尚未登录，请登录!");
    }
}
