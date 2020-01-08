package com.example.Demo2.config;


import com.example.Demo2.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import javax.annotation.Resource;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Resource
	private TokenInterceptor tokenInterceptor ;

	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(tokenInterceptor).addPathPatterns("/**");

	}

	private static final ThreadLocal<String> context = new ThreadLocal<>();
	public static void addUserContext(String value) {
		context.set(value);
	}
	public static String getUser() {
		return context.get();
	}
}