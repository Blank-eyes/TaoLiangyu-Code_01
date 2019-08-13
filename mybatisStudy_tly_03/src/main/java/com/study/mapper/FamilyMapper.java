package com.study.mapper;

import java.util.List;

import com.study.bean.FamilyBean;

public interface FamilyMapper {
	public List<FamilyBean> findFamiliesByStudentId(Integer studentId);

}
