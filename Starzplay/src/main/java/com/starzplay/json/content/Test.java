package com.starzplay.json.content;


//import java.io.File;
//import java.io.IOException;
//import java.io.StringWriter;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;
//import com.fasterxml.jackson.databind.node.ObjectNode;
//import com.starzplay.json.content.RootObject;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import java.net.URL;
//import java.nio.charset.Charset;
//
//import org.json.JSONException;
//import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

public class Test {
	
	
	private static RootObject starzplayEntiry = null;
	static InputStream is = null;
	static JSONObject jObj = null;
	static String json = "";
	
/*	public static void main(String[] args) {
		System.out.println("dfd");
		
		
	
		try {
	
		
		byte[] meidajsonData = Files.readAllBytes(Paths.get("http://bit.ly/javaassignmentsrc"));
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
		
	}*/
	
	
//	 private static String readAll(Reader rd) throws IOException {
//		    StringBuilder sb = new StringBuilder();
//		    int cp;
//		    while ((cp = rd.read()) != -1) {
//		      sb.append((char) cp);
//		    }
//		    return sb.toString();
//		  }

	 public static JSONObject getJSONFromUrl(String url) {

		    // Making HTTP request
		    try {
		        // defaultHttpClient
		        DefaultHttpClient httpClient = new DefaultHttpClient();
		        HttpPost httpPost = new HttpPost(url);

		        HttpResponse httpResponse = httpClient.execute(httpPost);
		        HttpEntity httpEntity = httpResponse.getEntity();
		        is = httpEntity.getContent();

		    } catch (UnsupportedEncodingException e) {
		        e.printStackTrace();
		    } catch (ClientProtocolException e) {
		        e.printStackTrace();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }

		    try {
		        BufferedReader reader = new BufferedReader(new InputStreamReader(
		                is, "iso-8859-1"), 8);
		        StringBuilder sb = new StringBuilder();
		        String line = null;
		        while ((line = reader.readLine()) != null) {
		            sb.append(line + "\n");
		            System.out.println(line);
		        }
		        is.close();
		        json = sb.toString();

		    } catch (Exception e) {
		        System.out.println("Buffer Error Error converting result ");
		    }

		    // try parse the string to a JSON object
		    try {
		        jObj = new JSONObject(json);
		    } catch (JSONException e) {
		    	//System.out.println("JSON Parser", "Error parsing data " + e.toString());
		        System.out.println("error on parse data in jsonparser.java");
		    }

		    // return JSON String
		    return jObj;

		}

		  public static void main(String[] args) throws IOException, JSONException {
		    //JSONObject json = getJSONFromUrl("http://bit.ly/javaassignmentsrc");
		    String url = "http://freegeoip.net/json/";
		    Test jsonParser = new Test();
		    JSONObject object = jsonParser.getJSONFromUrl(url);
		    String content=object.getString("ip");
		    
		    System.out.println(content);
		    //System.out.println(json.get("id"));
		  }
	

}
