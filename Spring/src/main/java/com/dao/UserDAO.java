package com.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDAO {

	public void save(){
		System.out.println("dao save");
	}
}
