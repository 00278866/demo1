package com.iflytek.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.context.embedded.*;

@Controller
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Demo1Application {

	@RequestMapping(value="/")
	public String abc() {
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Bean
	public EmbeddedServletContainerFactory servletContainer(){

	}
}
