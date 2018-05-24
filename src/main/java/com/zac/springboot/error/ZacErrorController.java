package com.zac.springboot.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ZacErrorController {
	private static final String VIEW_FOLDER = "zac/error";

	@GetMapping(path = "/403")
	String error403() throws Exception {
		return VIEW_FOLDER + "/403";
	}

	@GetMapping(path = "/404")
	String error404() throws Exception {
		return VIEW_FOLDER + "/404";
	}

	@GetMapping(path = "/405")
	String error405() throws Exception {
		return VIEW_FOLDER + "/405";
	}

	@GetMapping(path = "/500")
	String error500() throws Exception {
		return VIEW_FOLDER + "/500";
	}

	@GetMapping(path = "/503")
	String error503() throws Exception {
		return VIEW_FOLDER + "/503";
	}
}
