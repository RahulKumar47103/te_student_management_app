package com.te.student_management_app.dao;

import com.te.student_management_app.bean.Student;

public interface IStudentDao {
	public boolean insertStudent(Student bean);
	public Student searchStudent(int userid);
	public boolean removeStudent(int userid);
	public boolean updateStudentEmail(Student bean);
}
