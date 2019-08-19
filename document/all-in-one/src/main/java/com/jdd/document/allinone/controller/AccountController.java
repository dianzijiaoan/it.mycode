package com.jdd.document.allinone.controller;

import com.jdd.document.allinone.model.HttpResp;
import com.jdd.document.allinone.model.resp.account.LoginResp;
import com.jdd.document.allinone.util.HttpRespUtil;
import com.jdd.document.allinone.util.StringUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 账号体系
 * </p>
 *
 * @author: keller.ji
 * @since: 2019/8/19 10:40
 */
@RequestMapping(value = "/account")
@Controller
public class AccountController {

    @RequestMapping(value = "/login")
    @ResponseBody
    public HttpResp<LoginResp> login() {

        LoginResp loginResp = new LoginResp();
        loginResp.setIdentity("abc");
        return HttpRespUtil.success(loginResp);
    }

    public static void main(String[] args) {
        System.out.println(1+'1'+1);
        if (args.length != 1 || StringUtil.isTrimEmpty(args[0])) {
            System.out.println("please input parameter: password");
            return;
        }

        try {
            //生成password
            String salt = StringUtil.random(6);
            String passwd = StringUtil.passwd(args[0], salt);

            System.out.println("明文：" + args[0]);
            System.out.println("salt：" + salt);
            System.out.println("密文：" + passwd);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}