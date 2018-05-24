package com.zac.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  private static final String VIEW_FOLDER = "zac";

  @GetMapping(path = "/login")
  String login(LoginForm loginForm) throws Exception {
    loginForm.setErrHiddenFlg(true);
    return VIEW_FOLDER + "/login";
  }
}
