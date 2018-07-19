package com.study.secrity.controller;

import com.study.secrity.entity.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by  lpw'ASUS on 2018/7/17.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("login")
    public String loadLoginHtml(){
        return "login";
    }

    @RequestMapping("index")
    public String loadLoginRefHtml(){

        System.out.print("ss");
        return "index";
    }

//    @RequestMapping("/")
//    public String index(Model model) {
//        Msg msg = new Msg("标题", "内容", "额外信息，只对管理员显示");
//        model.addAttribute("msg", msg);
//        System.out.print("走了----------");
//        return "index";
//    }

}
