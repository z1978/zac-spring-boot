package com.zac.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // (1)
public class HelloController {

  @RequestMapping("/")
  public String index() {
    return "index";
  }

  @RequestMapping("/hello") // (2)
  public String hello() {
    return "hello";
  }

  @RequestMapping("/login")
  public String login() {
    return "login";
  }

}
