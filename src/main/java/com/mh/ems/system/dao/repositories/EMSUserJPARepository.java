/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mh.ems.system.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mh.ems.system.dao.entities.EmsUser;


/**
 * @author Muzaffar Mohammed, 
 * 		   +91 9951204368
 */

@Repository(value = "EMSUserJPARepository")
public interface EMSUserJPARepository extends JpaRepository<EmsUser, Long>{

	
   
}
