package com.microcare.microservice.microcare_microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {
	
	@Autowired
	TestScan ts;
	
	
	@GetMapping("/api/path/{id}/{name}")
	public String check(@PathVariable int id,@PathVariable String name) {
		return name+"----------"+Math.pow(id, 3);
	}
	
	@GetMapping("/api/param")
	public String checkParam(@RequestParam int id,@RequestParam String name) {
		return name +"============="+Math.pow(id, 2);
	}
	
	
	@GetMapping("/api/body")
	public String checkBody(@RequestBody User user) {
		return "RequestBody Response:"+user.toString();
	}

}
