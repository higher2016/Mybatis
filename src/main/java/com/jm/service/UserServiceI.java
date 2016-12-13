package com.jm.service;

import java.util.List;

import com.jm.model.Bug;
import com.jm.model.TestView;

public interface UserServiceI {

	public Bug getBugById(Long id);
	
	public void test();
	
	public List<TestView> getTestView();
}
