package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bean.people;
import com.bean.student;
import com.bean.teacher;
import com.bean.teachingAssistant;
import com.database.database;
import com.io.Io;

public class Demo {
	

		

		
	
	public static void Info() {
		List<teachingAssistant> Asss = new ArrayList<>();
		List<teacher> Tes = new ArrayList<>();
		List<student> Sts = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("输入录入人数，（教辅/教员/学生=1/5/50）");
		int n = scan.nextInt();
		System.out.println("教辅信息录入------------》");
		for (int i = 0; i < n; i++) {
			String Name = scan.next();
			int Age = scan.nextInt();
			String Sex = scan.next();
			String Adression = scan.next();
			String PhoneNumber = scan.next();
			String A_ID = scan.next();
			
			teachingAssistant Ass = new teachingAssistant(Name,Age,Sex,Adression,PhoneNumber,A_ID);	
			Asss.add(Ass);
			String sql ="insert into teachingAssistant (name,age,sex,adression,phoneNumber,A_ID) value(?,?,?,?,?,?);";
			database.DBinsert(sql, Name,Age,Sex,Adression,PhoneNumber,A_ID);
		}
		
		Io.inputFile(Asss,"teachingAssistant.txt");
		System.out.println("教员信息录入-----------》");
		for (int i = 0; i < 5*n; i++) {
			String Name = scan.next();
			int Age = scan.nextInt();
			String Sex = scan.next();
			String Adression = scan.next();
			String PhoneNumber = scan.next();
			String T_ID = scan.next();
			
			teacher Te = new teacher(Name,Age,Sex,Adression,PhoneNumber,T_ID);	
			Tes.add(Te);
			String sql2 ="insert into teacher (name,age,sex,adression,phoneNumber,T_ID) value(?,?,?,?,?,?);";
			database.DBinsert(sql2, Name,Age,Sex,Adression,PhoneNumber,T_ID);
		}
		Io.inputFile(Tes,"teacher.txt");
		System.out.println("学生信息录入------------》");
		for (int i = 0; i < 50*n; i++) {
			String Name = scan.next();
			int Age = scan.nextInt();
			String Sex = scan.next();
			String Adression = scan.next();
			String PhoneNumber = scan.next();
			String S_ID = scan.next();
			
			student St = new student(Name,Age,Sex,Adression,PhoneNumber,S_ID);	
			Sts.add(St);
			String sql3 ="insert into student (name,age,sex,adression,phoneNumber,S_ID) value(?,?,?,?,?,?);";
			database.DBinsert(sql3, Name,Age,Sex,Adression,PhoneNumber,S_ID);
		}
		Io.inputFile(Sts,"stedunt.txt");
		
		
		
		
		
		
		
		
	}
	public static void Select() {
		Scanner scan = new Scanner(System.in);
		System.out.println("查询教辅按  1");
		System.out.println("查询教员按  2");
		System.out.println("查询学生按  3");
		int num = scan.nextInt();
		switch(num) {
		case 1:System.out.println("输入查询教辅ID");
		String sql5 = "select name,age,sex,adression,phoneNumber,A_ID from teachingAssistant where A_ID=?;";
        String ID = scan.next();
		database.DBSelect(sql5,ID);
		break;
		case 2:System.out.println("输入查询教员ID");
		String sql6 = "select name,age,sex,adression,phoneNumber,T_ID from teacher where T_ID=?;";
        String T_ID = scan.next();
		database.DBSelect(sql6,T_ID);
		break;
		case 3:System.out.println("输入查询学生ID");
		String sql7 = "select name,age,sex,adression,phoneNumber,S_ID from student where S_ID=?;";
        String S_ID = scan.next();
		database.DBSelect(sql7,S_ID);
			
		}
		
		
	}
	
	public static void Info2() {
		List<teachingAssistant> Asss = new ArrayList<>();
		List<teacher> Tes = new ArrayList<>();
		List<student> Sts = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("输入个数，（教辅/教员/学生=1/5/50）");
		int n = scan.nextInt();
		System.out.println("教辅信息录入------------》");
		
		for (int i = 0; i < n; i++) {
			String d=(String)Io.Fileinto("112.txt").toArray()[i];
			System.out.println(d);
			String[] c = d.split(" ");
			
			teachingAssistant Ass = new teachingAssistant(c[0],Integer.parseInt(c[1]),c[2],c[3],c[4],c[5]);	
            Asss.add(Ass);
            
			String sql1 ="insert into teachingAssistant (name,age,sex,adression,phoneNumber,A_ID) value(?,?,?,?,?,?);";
			database.DBinsert(sql1, c[0],Integer.parseInt(c[1]),c[2],c[3],c[4],c[5]);

		}
		Io.inputFile(Asss,"teachingAssistant.txt");
		
		
		System.out.println("教员信息录入-----------》");
		for (int i = 0; i < 5*n; i++) {
			String d=(String) Io.Fileinto("113.txt").toArray()[i];
			String[] c = d.split(" ");
			teacher Te= new teacher(c[0],Integer.parseInt(c[1]),c[2],c[3],c[4],c[5]);	
     		Tes.add(Te);
			String sql2 ="insert into teacher (name,age,sex,adression,phoneNumber,T_ID) value(?,?,?,?,?,?);";
			database.DBinsert(sql2, c[0],Integer.parseInt(c[1]),c[2],c[3],c[4],c[5]);
		}
		Io.inputFile(Tes,"teacher.txt");
		System.out.println("学生信息录入------------》");
		for (int i = 0; i < 50*n; i++) {
			String d= (String)Io.Fileinto("114.txt").toArray()[i];
			String[] c = d.split(" ");
			student St = new student(c[0],Integer.parseInt(c[1]),c[2],c[3],c[4],c[5]);	
			Sts.add(St);
			String sql3 ="insert into student (name,age,sex,adression,phoneNumber,S_ID) value(?,?,?,?,?,?);";
			database.DBinsert(sql3, c[0],Integer.parseInt(c[1]),c[2],c[3],c[4],c[5]);
			
			
		}
		Io.inputFile(Sts,"stedunt.txt");
		
		
		
		
		
		
		
		
	}

}
