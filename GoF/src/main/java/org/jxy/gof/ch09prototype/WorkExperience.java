package com.elong.design.pattern.ch09prototype;

public class WorkExperience implements Cloneable{
	
	private String workDate;
	private String Company;
	
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	
	public WorkExperience Clone() {
		try {
			return (WorkExperience) super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("Clone has error!!!");
			e.printStackTrace();
		}
		return null;
	}

}
