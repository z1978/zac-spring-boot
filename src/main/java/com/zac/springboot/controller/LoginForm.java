package com.zac.springboot.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginForm {
  @NotEmpty
	@Size(max = 20)
	@Pattern(regexp = "[ -~｡-ﾟ]+")
	private String naviId;

  @NotEmpty
	@Size(max = 128)
	@Pattern(regexp = "[ -~｡-ﾟ]+")
	private String password;

	private boolean errHiddenFlg;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getErrHiddenFlg() {
		return errHiddenFlg;
	}

	public void setErrHiddenFlg(boolean errHiddenFlg) {
		this.errHiddenFlg = errHiddenFlg;
	}

	public String getNaviId() {
		return naviId;
	}

	public void setNaviId(String naviId) {
		this.naviId = naviId;
	}

}
