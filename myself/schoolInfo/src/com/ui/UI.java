package com.ui;

import java.util.Scanner;

import com.main.Demo;

public class UI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(true)
		{
			
		System.out.println("                    ѧУ��Ϣ����ϵͳ                                               ");
		System.out.println("------------------------------------------------");
		System.out.println("                   �ֶ�¼�밴  1");
		System.out.println("                   �ļ�¼�밴  4");
		System.out.println("                   ��ѯ��  2");
		System.out.println("                    exit 3");
		System.out.println("------------------------------------------------");
		int num = scan.nextInt();
		switch(num)
		{
		case 1:	Demo.Info();break;
		case 4:	Demo.Info2();break;
		case 2:	Demo.Select();break;
		case 3: flag = false;
		
		}
			
		}
	}
}
