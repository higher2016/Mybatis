package com.jm.dao;

import org.apache.ibatis.annotations.Param;

import com.jm.model.Bug;

public interface BugMapper {
	public Bug loadById(@Param("id")long id);
}