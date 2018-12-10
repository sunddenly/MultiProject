package com.elong.design.pattern.ch09prototype;

public class Resume implements Cloneable{
	
	private String name;
	private String sex;
	private String age;
	//private String timeArea;
	//private String company;
	private WorkExperience work;
	
	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}
	
	private Resume (WorkExperience work) {
		this.work = work.Clone();
	}
	
	public void setPersonalInfo(String sex,String age) {
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String workDate,String company) {
		work.setWorkDate(workDate);
		work.setCompany(company);
	}
	
	public void Display() {
		System.out.println(name + " " + sex + " " + age);
		System.out.println("Work experience: " + work.getWorkDate() + " " + work.getCompany());
	}
	
	public Resume Clone() {
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}
	

}
