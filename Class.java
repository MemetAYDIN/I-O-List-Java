package com.aydin.io_List;

import java.util.List;

public class Class {
	
	private int ClsId;
	private String ClsName;
	private School ClssSchl;
	private List<Student> clssStdntList;
	private List<Teacher> clssTchrList;
	public Class(int clsId, String clsName) {
		ClsId = clsId;
		ClsName = clsName;
		

	}
	public Class() {
	}
	public int getClsId() {
		return ClsId;
	}
	public void setClsId(int clsId) {
		ClsId = clsId;
	}
	public String getClsName() {
		return ClsName;
	}
	public void setClsName(String clsName) {
		ClsName = clsName;
	}
	public School getClssSchl() {
		return ClssSchl;
	}
	public void setClssSchl(School clssSchl) {
		ClssSchl = clssSchl;
	}
	public List<Student> getClssStdntList() {
		return clssStdntList;
	}
	public void setClssStdntList(List<Student> clssStdntList) {
		this.clssStdntList = clssStdntList;
	}
	public List<Teacher> getClssTchrList() {
		return clssTchrList;
	}
	public void setClssTchrList(List<Teacher> clssTchrList) {
		this.clssTchrList = clssTchrList;
	}
	
	
	

}
