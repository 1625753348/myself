package com.ui;

import java.util.Scanner;

import com.main.Demo;

public class UI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(true)
		{
			
		System.out.println("                    学校信息管理系统                                               ");
		System.out.println("------------------------------------------------");
		System.out.println("                   手动录入按  1");
		System.out.println("                   文件录入按  4");
		System.out.println("                   查询按  2");
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
