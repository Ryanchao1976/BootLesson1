package com.ryan.boot.learn1.demo.web.HelloWorldController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {
        return "login"; // loign.html
    }


    // TODO: remove get after login is done
    @RequestMapping(value = "/login", method = { RequestMethod.POST, RequestMethod.GET })
    public String doLogin() {
        return "workarea";  //workarea.html
    }

}