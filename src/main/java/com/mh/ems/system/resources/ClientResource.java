/**
 *  
 * Education Management System (EMS)
 * 2020
 */
package com.mh.ems.system.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mh.ems.system.dao.config.DBConfigProperties;

@RestController
@RequestMapping("/system")
public class ClientResource {

	Logger log = LoggerFactory.getLogger(ClientResource.class);
	//@Autowired
	//private ClientServiceImpl clientService;
	

	 /* Below code snippet will help to retrieve desired application properties.
	  * localhost - this is the default value if there is no property assigned in prop file.
	  */	
	 //	@Value("${server.address: localhost}")
	 //	private String serverAddr;
	
	 /*
	 * This will get you list of values.
	 */
	//	@Value("${my.list.values}")
	//	private List<String> listValues;
	
	 /*
	 * This will get you values in the form of json.
	 */
	//	@Value("#{${my.list.values}}")
	//	private Map<String,String> listMap;
	
	/*
	 * This will help to retreive prop values in the form of object.
	 * */
	@Autowired
	private DBConfigProperties dbConfig;
	

}
