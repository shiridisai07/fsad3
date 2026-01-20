package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.config.AppConfig;
import com.klu.model.ProductOrder;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ProductOrder order =
                (ProductOrder) context.getBean("order");

        order.display();
        ApplicationContext context1 =new AnnotationConfigApplicationContext(AppConfig.class);
        ProductOrder pr1=context1.getBean(ProductOrder.class);
        pr1.display();
    }
}
