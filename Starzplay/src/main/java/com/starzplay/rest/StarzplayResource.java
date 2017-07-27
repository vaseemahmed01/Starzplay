package com.starzplay.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.starzplay.json.content.RootObject;
import com.starzplay.service.StarzplayService;
import com.starzplay.utility.AppConstant;

@RestController
public class StarzplayResource {
	
	@Autowired
	StarzplayService starzplayService;
	
    @RequestMapping("/media")
    public RootObject getMediaContent(@RequestParam(value="filter", defaultValue="censoring") String filter,
    								  @RequestParam(value="level", defaultValue="uncensored") String level) {
    	
    
    	if(filter.equalsIgnoreCase(AppConstant.DEFAULT_FILTER_VALUE))
    	{
    		return starzplayService.getStarplayzMediaContent(level);
    	}else{
    		System.out.println("Implement logic for the future new filter...");
    		return new RootObject();
    	}
    	
    }
	
}
