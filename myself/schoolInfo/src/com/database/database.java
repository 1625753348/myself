package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.bean.people;
import com.bean.teacher;



public class database{
	 
    public static void DBinsert(String sql,String Name,int Age,String Sex,String Adression,String PhoneNumber,String A_ID) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
			System.out.println("����jdbc����ʧ��");
		}
		Connection conn = null;
		PreparedStatement pre = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ѧУ��Ϣ","root","123456");
			System.out.println("���ݿ����ӳɹ�");			
			pre = conn.prepareStatement(sql);
			
			 //"insert into teachingAssistant (name,age,sex,adression,phoneNumber,A_ID) value(?,?,?,?,?,?);";
			pre.setString(1,Name);
			pre.setInt(2,Age);
			pre.setString(3,Sex);
			pre.setString(4,Adression);
			pre.setString(5,PhoneNumber);
			pre.setString(6,A_ID);
			
			int res = pre.executeUpdate();
			if(res == 1)
			System.out.println("һ����¼�������ݿ�");
			//
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��������ʧ��");
		}finally
		{
			if(pre != null) {
				try {
					pre.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
    public static void DBSelect(String sql,String ID)
    {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
			System.out.println("����jdbc����ʧ��");
		}
		Connection conn = null;
		PreparedStatement pre = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ѧУ��Ϣ","root","123456");
			System.out.println("���ݿ����ӳɹ�");			
			pre = conn.prepareStatement(sql);
			
			 //"insert into teachingAssistant (name,age,sex,adression,phoneNumber,A_ID) value(?,?,?,?,?,?);";
		//select name,age,sex,adression,phoneNumber,A_ID from teachingAssistant where A_ID=?;
		//	select name,age,sex,adression,phoneNumber,T_ID from teacher where T_ID=?;
		//	select name,age,sex,adression,phoneNumber,S_ID from student where S_ID=?;
			pre.setString(1, ID);
			ResultSet res = pre.executeQuery();
			while(res.next())
			{
				//System.out.println(res.getString(1)+" "+res.getInt(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getString(5)+" "+res.getString(6));	
				
				System.out.println("��ţ�"+ID.substring(9));
				System.out.println("������"+res.getString(1));
				
				if(ID.substring(0, 1).equals("A"))
					System.out.println("���ͣ��̸�");
				else if(ID.substring(0, 1).equals("T"))
					System.out.println("���ͣ���Ա");
				else
					System.out.println("���ͣ�ѧ��");
				
				System.out.println("�̹���ţ�"+res.getString(6));
				System.out.println("���䣺"+res.getInt(2));
				System.out.println("�Ա�"+res.getString(3));
				System.out.println("סַ��"+res.getString(4));
				System.out.println("��ϵ��ʽ��"+res.getString(5));
				System.out.println("��������������������������������������������������������������������������������������������������������������������������������");
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��������ʧ��");
		}finally
		{
			if(pre != null) {
				try {
					pre.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}


}
