package com.jm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jm.dao.BugMapper;
import com.jm.dao.TestViewMapper;
import com.jm.model.Bug;
import com.jm.model.TestView;
import com.jm.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI {
	@Autowired
	private BugMapper bugMapper;
	@Autowired
	private TestViewMapper testViewMapper;
//	
//	public BugMapper getBugMapper() {
//		return bugMapper;
//	}
//
//	public void setBugMapper(BugMapper bugMapper) {
//		this.bugMapper = bugMapper;
//	}

	public Bug getBugById(Long id) {
		Bug bug = bugMapper.loadById(id);
		return bug;
	}

	public void test() {
		System.out.println("-------------------");
	}
	
	public List<TestView> getTestView(){
		List<TestView> tv = testViewMapper.loadTestView();
		return tv;
	}
}
