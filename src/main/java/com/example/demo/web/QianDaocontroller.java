package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.ChaXunService;
import com.example.demo.service.QianDaoService;
import com.example.demo.service.TongJiService;


@SpringBootApplication
public class QianDaocontroller {
	@Bean
	public String qiandao() {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		
		list.add("孔娟");
		list.add("轶材");
		list.add("胜山");
		list.add("老王");
		Scanner scanner=new Scanner(System.in);
		List<String> names=new ArrayList<>();
		while(true) {
			System.out.println("请输入签到姓名：");
			String qname=scanner.next();
			QianDaoService qianDao=new QianDaoService();
			String nameq=qianDao.qiandao(qname, list,names);
			if(nameq!=null) {
				names.add(nameq);
			}
			System.out.println("是否继续签到? y/n");
			String what=scanner.next();
			if(what.equals("n")) {
				break;
			}
		}
		while(true) {
			System.out.println("请输入要查询的学生姓名：");
			String cname=scanner.next();
			ChaXunService chaXun=new ChaXunService();
//			for (String string : names) {
//				System.out.print("name: "+string);
//			}
//			System.out.println();
			if(chaXun.chaxun(cname, names,list)==null) {
				System.out.println("是否继续查询? y/n");
			}else{
				break;
			}
			String what=scanner.next();
			if(what.equals("n")) {
				break;
			}
			
		}
		
		TongJiService tongJi=new TongJiService();
		tongJi.tongji(list, names);
		return null;
	}

}
