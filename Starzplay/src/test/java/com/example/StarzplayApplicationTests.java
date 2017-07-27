package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import com.starzplay.implementation.StarplayzAction;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.starzplay.implementation.StarplayzAction.class)
@ContextConfiguration(classes=com.starzplay.StarzplayLoadJsonFactory.class)
public class StarzplayApplicationTests {

	@Autowired
	StarplayzAction action;
	
	/*
	 * First test - passing Level = null
	 */
	@Test
	public void getEntriesMediaContent1() {
		
		action.getStarplazMediaContent(null);
		assertThat(true);
		
	}
	
	/*
	 * First test - passing Level = ""
	 */
	@Test
	public void getEntriesMediaContent2() {
		
		action.getStarplazMediaContent("");
		assertThat(true);
				
	}
	
	/*
	 * First test - passing Level = censored
	 */
	@Test
	public void getEntriesMediaContent3() {
		
		action.getStarplazMediaContent("censored");
		assertThat(true);
				
	}
	
	/*
	 * First test - passing Level = uncensored
	 */
	@Test
	public void getEntriesMediaContent4() {
		
		action.getStarplazMediaContent("uncensored");
		assertThat(true);
				
	}

}
