package com.aydin.io_List;

import java.util.List;

public class School {
	
	private int SchId;
	private String SchName;
	private List<Class> SchllClssList;
	
	public School(int schId, String schName) {
		SchId = schId;
		SchName = schName;
	}
	public School() {
	}
	public int getSchId() {
		return SchId;
	}
	public void setSchId(int schId) {
		SchId = schId;
	}
	public String getSchName() {
		return SchName;
	}
	public void setSchName(String schName) {
		SchName = schName;
	}
	public List<Class> getSchllClssList() {
		return SchllClssList;
	}
	public void setSchllClssList(List<Class> schllClssList) {
		SchllClssList = schllClssList;
	}
	

	
}
