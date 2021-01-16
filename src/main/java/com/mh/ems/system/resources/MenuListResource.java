/**
 *  
 * Education Management System (EMS)
 * 2020
 */
package com.mh.ems.system.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mh.ems.system.services.user.UserServiceImpl;

@RestController
@RequestMapping("/menulist")
public class MenuListResource {

	@Autowired
	private UserServiceImpl menuListService;
	
	
	
}
