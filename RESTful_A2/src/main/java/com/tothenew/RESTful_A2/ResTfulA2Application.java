package com.tothenew.RESTful_A2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class ResTfulA2Application {

	public static void main(String[] args) {
		SpringApplication.run(ResTfulA2Application.class, args);
	}
	//-------------------------------------------------------------------------------------------------------

//Ques 1 Add support for Internationalization in your application allowing messages to be shown in
// English, German and Swedish, keeping English as default.
	@Bean
	public LocaleResolver localeResolver(){
		SessionLocaleResolver localeResolver=new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}
	@Bean
	public ResourceBundleMessageSource bundleMessageSource(){
		ResourceBundleMessageSource resourceBundleMessageSource=new ResourceBundleMessageSource();
		resourceBundleMessageSource.setBasename("messages");
		return resourceBundleMessageSource;
	}

	//-------------------------------------------------------------------------------------------------------
}
