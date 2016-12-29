package cn.javass.chapter7.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuccessController {

    @RequestMapping("/success")
    public String success() {
        return "success";
    }

}
