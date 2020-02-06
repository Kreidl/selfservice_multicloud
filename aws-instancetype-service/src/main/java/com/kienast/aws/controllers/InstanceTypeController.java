package com.kienast.aws.controllers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kienast.aws.models.AWSInstanceType;
import com.kienast.aws.models.AWSTypeList;
import com.kienast.aws.util.SortByMemory;

@RestController
@RequestMapping("/types")
public class InstanceTypeController {

	@RequestMapping(method = RequestMethod.GET)
	public AWSTypeList getTypes() {
		
        ObjectMapper mapper = new ObjectMapper();
        //Dont fail if there are unknown fields
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String path = "awsinstancetypes.json";
        Path p = Paths.get(path);
        if(!checkIFExistsOnSameDay(p)) {
        	createFile();
        }
    	
		List<AWSInstanceType> types;
		try {
			types = Arrays.asList(mapper.readValue(new File(path), AWSInstanceType[].class));
			Collections.sort(types, new SortByMemory());
			return new AWSTypeList(types);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	private void createFile() {
        try (BufferedInputStream in = new BufferedInputStream(new URL("https://ec2instances.info/instances.json").openStream());
				  FileOutputStream fileOutputStream = new FileOutputStream("awsinstancetypes.json")) {
				    byte dataBuffer[] = new byte[1024];
				    int bytesRead;
				    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
				        fileOutputStream.write(dataBuffer, 0, bytesRead);
				    }
				} catch (IOException e) {
				    // handle exception
				}
	}
	
	
	private boolean checkIFExistsOnSameDay(Path p) {
		if(!Files.exists(p)) return false;
        try {
			DateFormat df = new SimpleDateFormat("MM.dd.yyyy");
			String fileDate = df.format(Files.readAttributes(p, BasicFileAttributes.class).creationTime().toMillis());
			String currentDate = df.format(new Date(System.currentTimeMillis()));
			
			return Files.exists(p) && currentDate.equals(fileDate);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        return false;
        
	}
	
	
	
}
