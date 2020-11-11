package com.mh.ems.system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mh.ems.system.dao.entities.EmsUser;
import com.mh.ems.system.dao.repositories.EMSUserJPARepository;

@Service(value = "EmsUserServiceImpl")
public class EmsUserServiceImpl {

	@Autowired
	EMSUserJPARepository userRepo;
	
	public List<EmsUser> getAllMenuList(){
		try {
			return userRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
