package com.lee.fairy.banish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class JenkinsController {
	
	@RequestMapping("/data")
	@ResponseBody
	public String data() {
		return "你好,这是一条 Jenkins数据！";
	}

}
