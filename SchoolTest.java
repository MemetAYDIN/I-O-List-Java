package com.aydin.io_List;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;


public class SchoolTest {
	
	public static void main(String[] args) {
		School schl=new School(1,"Special Things Universty");
		schl.setSchllClssList(new ArrayList<Class>());
		
		Class clssTchr=new Class(2,"3/A Teacher List");
		clssTchr.setClssTchrList(new ArrayList<Teacher>());
		
		Class clssStdnt=new Class(2,"3/A Student List");
		clssStdnt.setClssStdntList(new ArrayList<Student>());
		
		Teacher tchr=new Teacher(100,"Albert Einstien",5001);
		tchr.setTchrClss(clssTchr);
		clssTchr.getClssTchrList().add(tchr);
		
		Teacher tchr2=new Teacher(101,"İbn-i Sina",5002);
		tchr2.setTchrClss(clssTchr);
		clssTchr.getClssTchrList().add(tchr2);
		
		Teacher tchr3=new Teacher(102,"Mimar Sinan",5003);
		tchr3.setTchrClss(clssTchr);
		clssTchr.getClssTchrList().add(tchr3);
		
		Student stdnt=new Student(25,"Mehmet Aydin",6001);
		stdnt.setStdClss(clssStdnt);
		clssStdnt.getClssStdntList().add(stdnt);
		
		System.out.println(schl.getSchId()+" "+schl.getSchName());
		System.out.println("\t"+clssTchr.getClsId()+" "+clssTchr.getClsName());
		
		String path1="/home/nemo/Desktop/Works/Java/Godoro/test2.txt";
		
		
	
			try(BufferedWriter bw=new BufferedWriter(new FileWriter(path1))) {
				
				bw.write(schl.getSchId()+" "+schl.getSchName()+"\r\n");
				
				bw.write("\t"+clssTchr.getClsId()+" "+clssTchr.getClsName()+"\r\n");
				
				for(Teacher tchr0:clssTchr.getClssTchrList())
				{
				
					System.out.println("\t"+"\t"+tchr0.getTchrId()+" "+tchr0.getTchrName()
				
					+" "+tchr0.getTchrNo());
					
					bw.write("\t"+"\t"+tchr0.getTchrId()+" "+tchr0.getTchrName()
				
					+" "+tchr0.getTchrNo()+"\r\n");
				}
				
				bw.write("\t"+clssStdnt.getClsId()+" "+clssStdnt.getClsName()+"\r\n");
				for(Student stdnt0:clssStdnt.getClssStdntList())
				{
					
					bw.write("\t"+"\t"+stdnt0.getStdntId()+" "+stdnt.getStdntName()
					+" "+stdnt0.getStdntNo()+"\r\n");
				}
				
				
				bw.close();
				
			} catch (Exception e) {
				
				System.out.println("Yazma Yanlışı....");
				e.printStackTrace();
				
			}
		
			
		System.out.println("\t"+clssStdnt.getClsId()+" "+clssStdnt.getClsName());
		for(Student stdnt0:clssStdnt.getClssStdntList())
		{
			System.out.println("\t"+"\t"+stdnt0.getStdntId()+" "+stdnt.getStdntName()
			+" "+stdnt0.getStdntNo());
		}
		
		
	}

}
