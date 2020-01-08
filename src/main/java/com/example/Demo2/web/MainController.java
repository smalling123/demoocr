package com.example.Demo2.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Demo2.config.Global;

@RestController
public class MainController{

	@RequestMapping(value = "/helloworld", method = RequestMethod.POST)
	public String helloworld() {
		String result = "HelloWorld!";
		return result;
	}

}
