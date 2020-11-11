/**
 *  
 * Education Management System (EMS)
 * 2020
 */
package com.mh.ems.system.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mh.ems.system.dao.entities.EmsUser;
import com.mh.ems.system.services.EmsUserServiceImpl;

@RestController
@RequestMapping("/menulist")
public class MenuListResource {

	@Autowired
	private EmsUserServiceImpl menuListService;
	
	
	@RequestMapping("/get-menus")
	public List<EmsUser> getMenuList() {
		return menuListService.getAllMenuList();
	}
}
