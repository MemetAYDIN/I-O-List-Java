package com.aydin.io_List;

public class Student {
	
	private int StdntId;
	private String StdntName;
	private double StdntNo;
	private Class StdClss;
	public Student(int stdntId, String stdntName, double stdntNo) {
		StdntId = stdntId;
		StdntName = stdntName;
		StdntNo = stdntNo;
		
	}
	public Student() {
	}
	public int getStdntId() {
		return StdntId;
	}
	public void setStdntId(int stdntId) {
		StdntId = stdntId;
	}
	public String getStdntName() {
		return StdntName;
	}
	public void setStdntName(String stdntName) {
		StdntName = stdntName;
	}
	public double getStdntNo() {
		return StdntNo;
	}
	public void setStdntNo(double stdntNo) {
		StdntNo = stdntNo;
	}
	public Class getStdClss() {
		return StdClss;
	}
	public void setStdClss(Class stdClss) {
		StdClss = stdClss;
	}
	

}
