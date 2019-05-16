package com.student.model;

public class StudentModel {
	private int id;//id
	private String name;//姓名
	private int sex;//性别
	private int age;//年龄

	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

	public StudentModel() {
		// TODO Auto-generated constructor stub
	}

}
