package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.teachingAssistant;

public class Io {
	
	private static String s;
	public static void inputFile(List list,String filename) {
		File file = new File(filename);
		try(Writer  fo = new FileWriter(file);
		BufferedWriter bo = new BufferedWriter(fo)){
			for(Iterator iterator = list.iterator();iterator.hasNext();) {
				//System.out.println(iterator.next().toString());
				bo.write(iterator.next().toString());
				bo.newLine();
				bo.flush();
			}				
		}catch(Exception e){
			e.printStackTrace();
		}		
		
	}
	public static ArrayList<String> Fileinto(String filename) {
			String s = null;
			
			ArrayList<String> ww = new ArrayList<>();
			String[] sw =null;
		File file = new File(filename);
		try(Reader  fo = new FileReader(file);
		BufferedReader bo = new BufferedReader(fo)){
	
	       int i= 0;
			while((s =bo.readLine()) != null) {
				ww.add(s);
				
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	return ww;
		
		
	}
	
	
}
