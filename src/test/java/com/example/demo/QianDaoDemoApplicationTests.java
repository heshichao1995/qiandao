package com.example.demo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.ChaXunService;
import com.example.demo.service.QianDaoService;
import com.example.demo.service.TongJiService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QianDaoDemoApplicationTests {
	@Autowired
	private QianDaoService qianDaoService;
	@Autowired
	private ChaXunService chaXunService;
	@Autowired
	private TongJiService tongJiService;
	

	@Test
	public void contextLoads() {
	}

	@Test
	public void testQian() {
		List<String> list=new ArrayList<>();		
		list.add("孔娟");
		list.add("轶材");
		list.add("胜山");
		list.add("老王");
		List<String> nameq=new ArrayList<>();	
		nameq.add("老王");
		nameq.add("孔娟");
		assertEquals("胜山", qianDaoService.qiandao("胜山", list,nameq));
	}
	@Test
	public void testCha() {
		List<String> namez=new ArrayList<>();		
		namez.add("孔娟");
		namez.add("轶材");
		namez.add("胜山");
		namez.add("老王");
		List<String> nameq=new ArrayList<>();	
		nameq.add("老王");
		nameq.add("孔娟");
		assertEquals("老王", chaXunService.chaxun("老王", nameq,namez));
	}
	@Test
	public void testTong() {
		List<String> listz=new ArrayList<>();		
		listz.add("孔娟");
		listz.add("轶材");
		listz.add("胜山");
		listz.add("老王");
		List<String> listq=new ArrayList<>();		
		listq.add("老王");
		assertEquals(3, tongJiService.tongji(listz, listq));
	}
}
