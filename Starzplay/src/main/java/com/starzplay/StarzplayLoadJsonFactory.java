package com.starzplay;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.starzplay.json.content.RootObject;



@Component
@Scope("singleton")
public class StarzplayLoadJsonFactory implements InitializingBean {

	private RootObject starzplayEntiry = null;

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		loadJsonContentOnStartup();

	}

	public void loadJsonContentOnStartup() throws Exception {

		System.out.println("#################Json loading Started############## ");

		try {
			
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource("content.json").getFile());
			//file.getp		
			
			//byte[] meidajsonData = Files.readAllBytes(Paths.get("C:/Project/content.json"));
			byte[] meidajsonData = Files.readAllBytes(Paths.get(file.getPath()));

			System.out.println("Size-->" + meidajsonData.length);

			// create ObjectMapper instance
			ObjectMapper objectMapper = new ObjectMapper();

			// convert json string to object
			starzplayEntiry = objectMapper.readValue(meidajsonData, RootObject.class);			

			System.out.println("**********starzplayEntiry Object----------->" + starzplayEntiry.getXmlns().getPeg());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("#################Json loading Finished############## ");

		return;
	}

	public RootObject getStarzplayEntiry() {
		return starzplayEntiry;
	}

	public void setStarzplayEntiry(RootObject starzplayEntiry) {
		this.starzplayEntiry = starzplayEntiry;
	}

	

}
