package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.web.QianDaocontroller;

@SpringBootApplication     //用在程序的入口
public class QianDaoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QianDaocontroller.class, args);
	}
}
