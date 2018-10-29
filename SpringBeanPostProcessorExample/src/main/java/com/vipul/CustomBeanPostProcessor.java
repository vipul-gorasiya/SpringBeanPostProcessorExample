/**
 * 
 */
package com.vipul;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * This is custom bean post processor
 * 
 * @author Vipulkumar
 *
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Custom processing after initialization can be added here !");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Custom processing before initialization can be added here !");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
}
