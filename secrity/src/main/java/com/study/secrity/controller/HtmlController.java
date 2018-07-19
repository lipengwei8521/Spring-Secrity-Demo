package com.study.secrity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by  lpw'ASUS on 2018/7/18.
 */
@Controller
@RequestMapping("/webtob")
public class HtmlController {

    @RequestMapping("html1")
    public String loadHtml1(){
        return "html1";
    }

    @RequestMapping("html2")
    public String loadHtml2(){
        return "html2";
    }

    @RequestMapping("html3")
    public String loadHtml3(){
        return "html3";
    }

}
