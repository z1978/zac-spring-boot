package com.zac.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.zac.springboot.db.dao.TestTblDao;
import com.zac.springboot.db.entity.TestTbl;
import com.zac.springboot.util.PasswordUtil;

@Controller
public class ZacController {
	static Logger LOG = LoggerFactory.getLogger(ZacController.class);
	@Autowired
	TestTblDao testTblDao;

	private static final String VIEW_FOLDER = "zac";
	private static final String VIEW_FILE = "index";

	@GetMapping(path = "/zac")
	String zac(LoginForm loginForm) throws Exception {
		String safetyPassword1 = PasswordUtil.getSafetyPassword("password", "USERID0001");
        System.out.println(safetyPassword1);
        String safetyPassword2 = PasswordUtil.getSafetyPassword("password", "USERID0002");
        System.out.println(safetyPassword2);
        
		TestTbl testTbl = testTblDao.selectById(1);
		LOG.info(testTbl.getName());
		loginForm.setErrHiddenFlg(true);
		return VIEW_FOLDER + "/" + VIEW_FILE;
	}
}
