package com.springBoot.project.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.project.bo.UserBO;

@Repository
public interface UserRepo extends CrudRepository<UserBO, Integer>{
	
	public List<UserBO> findAll();

}
