package com.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringUtil1 implements ApplicationContextAware {

	private static ApplicationContext applicationContext; // Spring应用上下文环境

	static {
		if(applicationContext == null){
			applicationContext = new FileSystemXmlApplicationContext("classpath:spring.xml");
		}
	}

	/**
	 * 实现ApplicationContextAware接口的回调方法，设置上下文环境
	 * 
	 * @param applicationContext
	 * @throws BeansException
	 */
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringUtil1.applicationContext = applicationContext;
	}

	/**
	 * @return ApplicationContext
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * 获取对象
	 * 
	 * @param name
	 * @return Object 一个以所给名字注册的bean的实例
	 * @throws BeansException
	 */
	public static <T>T getBean(String name, Class<T> clazz) throws BeansException {
		return applicationContext.getBean(name, clazz);
	}

}
