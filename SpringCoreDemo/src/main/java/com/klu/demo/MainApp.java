package com.klu.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");

        Car car = (Car) context.getBean("exter");
        car.drive();

        Bike bike = (Bike) context.getBean("royalEnfield");
        bike.ride();
    }
}
