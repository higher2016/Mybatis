package com.jm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jm.model.TestView;

@Repository
public interface TestViewMapper {
	public List<TestView> loadTestView();
}