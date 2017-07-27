package com.example;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

import javax.servlet.annotation.WebInitParam;

import com.starzplay.StarzplayLoadJsonFactory;
import com.starzplay.implementation.StarplayzAction;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.starzplay.implementation.StarplayzAction.class)
@ContextConfiguration(classes=com.starzplay.StarzplayLoadJsonFactory.class)
//@WebMvcTest
public class StarzplayApplicationTests {

	@Autowired
	StarplayzAction action;
	
//	@Autowired
//	StarzplayLoadJsonFactory starzplayLoadJsonFactory;
//	
//	@Before
//	public void loadFactory()
//	{
//		try {
//			starzplayLoadJsonFactory.loadJsonContentOnStartup();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	@Test
	public void contextLoads() {
		
		action.getStarplazMediaContent("uncensored", "Censored");
		assertThat("abc").contains("a");
		
	}

}
