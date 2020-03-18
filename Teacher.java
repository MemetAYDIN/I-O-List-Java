package com.aydin.io_List;

public class Teacher {
	
	private int TchrId;
	private String TchrName;
	private double TchrNo;
	private Class TchrClss;
	public Teacher(int tchrId, String tchrName, double tchrNo) {
		TchrId = tchrId;
		TchrName = tchrName;
		TchrNo = tchrNo;
		
	}
	public Teacher() {
	}
	public int getTchrId() {
		return TchrId;
	}
	public void setTchrId(int tchrId) {
		TchrId = tchrId;
	}
	public String getTchrName() {
		return TchrName;
	}
	public void setTchrName(String tchrName) {
		TchrName = tchrName;
	}
	public double getTchrNo() {
		return TchrNo;
	}
	public void setTchrNo(double tchrNo) {
		TchrNo = tchrNo;
	}
	public Class getTchrClss() {
		return TchrClss;
	}
	public void setTchrClss(Class tchrClss) {
		TchrClss = tchrClss;
	}
	
	

}
