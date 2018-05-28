package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.CxService;
import com.example.demo.service.QdService;
import com.example.demo.service.TjService;


@SpringBootApplication   
public class QianDaocontroller {
	@Bean
	public String qiandao() {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		Scanner scanner=new Scanner(System.in);
		List<String> names=new ArrayList<>();
		while(true) {
			System.out.println("请输入姓名：");
			String qdname=scanner.next();
			QdService qianDao=new QdService();
			String nameqd=qianDao.qiandao(qdname, list,names);
			if(nameqd!=null) {
				names.add(nameqd);
			}
			System.out.println("是否继续签到? 通过键盘键入y/n来判定");
			String what=scanner.next();
			if(what.equals("n")) {
				break;
			}
		}
		while(true) {
			System.out.println("请输入要查询学生姓名：");
			String cname=scanner.next();
			CxService chaXun=new CxService();
//			for (String string : names) {
//				System.out.print("name: "+string);
//			}
//			System.out.println();
			if(chaXun.chaxun(cname, names,list)==null) {
				System.out.println("是否继续查询? 通过键盘键入y/n来判定");
			}else{
				break;
			}
			String what=scanner.next();
			if(what.equals("n")) {
				break;
			}
			
		}
		
		TjService tongJi=new TjService();
		tongJi.tongji(list, names);
		return null;
	}

}
