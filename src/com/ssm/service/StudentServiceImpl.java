package com.ssm.service;

import com.ssm.beans.Student;
import com.ssm.dao.IStudentDao;

public class StudentServiceImpl implements IStudentService {
	
	private IStudentDao dao;
	
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}
	
	@Override
	public void addStudent(Student student) {
		dao.inserStudent(student);
	}



}
