package com.starzplay.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.starzplay.json.content.RootObject;
import com.starzplay.service.StarzplayService;
import com.starzplay.utility.AppConstant;

@Service("starzplayService")
public class StarzplayServiceImpl implements StarzplayService{
	
	@Autowired
	StarplayzAction action;
	
	AppConstant appCostant;
		
	@Override
	public RootObject getStarplayzMediaContent(String level) {
		
		RootObject rootObject = action.getStarplazMediaContent(level,appCostant.CONT_CLASSIFICATION_C); 
		
		return rootObject;
	}
	
	
}

