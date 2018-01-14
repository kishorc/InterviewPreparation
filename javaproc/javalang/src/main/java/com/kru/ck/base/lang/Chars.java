package com.kru.ck.base.lang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Chars {

	public static void main(String[] args) throws IOException {
		
		File f = new File("/Users/smanchikal/Desktop/XTIME/JIRA/ENG-77679-Issue.txt");
		File f1 = new File("/Users/smanchikal/Documents/test.txt");
		System.out.println(f);
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		char[] charry = br.readLine().toCharArray();
		for(char ch : charry)
		{
			System.out.println(ch);
			System.out.println((int)ch );
		}

	}
}
				