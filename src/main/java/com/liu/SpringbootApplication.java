package com.liu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class SpringbootApplication {

	@RequestMapping("/index")
	public String index(HttpServletRequest request){
		String serverName = request.getRequestURL().toString();
		serverName = serverName.substring(7);
		int end = serverName.lastIndexOf("/");
		serverName = serverName.substring(0, end);
		final String[] domains = serverName.split("\\.");
		//测试新功能
		//再测试新功能
		return domains[0];
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
