package com.example.yamlconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class YamlConfigApplication {
	@Bean
	MyBean myBean() {
		return new MyBean();
	}

	public static void main(String[] args) throws InterruptedException {
		SpringApplication bootApp = new SpringApplication(YamlConfigApplication.class);
		ConfigurableApplicationContext context = bootApp.run(args);
		MyBean myBean = context.getBean(MyBean.class);
		myBean.doSomething();
	}

	private static class MyBean {

		@Value("${app.project.name}")
		private String appProjectName;

		public void doSomething() {
			System.out.printf("App title : %s%n", appProjectName);
		}
	}
}