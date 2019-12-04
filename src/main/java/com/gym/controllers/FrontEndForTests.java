package com.gym.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class FrontEndForTests {

    @GetMapping("/front.html")
    public String test(){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <title>Gym</title>\n" +
                "  </head>\n" +
                "  <body>" +
                "<div class=\"login\">\n" +
                "        <div class=\"login-screen\">\n" +
                "          <div class=\"login-icon\">\n" +
                "            <h4>Welcome to <small>Gym</small></h4>\n" +
                "          </div>\n" +
                "\n" +
                "          <div class=\"login-form\">\n" +
                "            <div class=\"form-group\">\n" +
                "              <input type=\"text\" class=\"form-control login-field\" value=\"\" placeholder=\"Enter your name\" id=\"login-name\" />\n" +
                "              <label class=\"login-field-icon fui-user\" for=\"login-name\"></label>\n" +
                "            </div>\n" +
                "\n" +
                "            <div class=\"form-group\">\n" +
                "              <input type=\"password\" class=\"form-control login-field\" value=\"\" placeholder=\"Password\" id=\"login-pass\" />\n" +
                "              <label class=\"login-field-icon fui-lock\" for=\"login-pass\"></label>\n" +
                "            </div>\n" +
                "\n" +
                "            <a class=\"btn btn-primary btn-lg btn-block\" href=\"#\">Log in</a>\n" +
            //    "            <a class=\"login-link\" href=\"#\">Lost your password?</a>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n"+
                " </body>\n" +
                "</html>";
    }
}
