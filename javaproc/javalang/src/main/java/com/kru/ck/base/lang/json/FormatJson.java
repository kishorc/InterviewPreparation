package com.kru.ck.base.lang.json;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FormatJson {

	private final char CONST_OPEN_BRACE = '{';

	private final char CONST_CLOSE_BRACE = '}';

	private final char CONST_OPEN_BRACKET = '[';

	private final char CONST_CLOSE_BRACKET = ']';

	private final char CONST_QUOTE = '"';

	private final char CONST_COMMA = ',';

	public void format(String input, StringBuffer buffer) {
		if (input == null || buffer == null) {
			return;
		}

		char[] array = input.toCharArray();
		int tabCount = 0;
		boolean isPrevComma = false;
		boolean isPrevbrace = false;
		for (char ch : array) {
			switch (ch) {
			case CONST_OPEN_BRACE:
				buffer.append("\n");
				for (int i = 0; i < (tabCount); i++) {
					buffer.append("\t");
				}
				buffer.append(ch);
				buffer.append("\n");
				isPrevComma = false;
				isPrevbrace = true;
				tabCount++;
				break;
			case CONST_CLOSE_BRACE:
				buffer.append("\n");
				for (int i = 0; i < (tabCount - 1); i++) {
					buffer.append("\t");
				}
				buffer.append(ch);
				isPrevComma = false;
				isPrevbrace = true;
				tabCount--;
				break;
			case CONST_OPEN_BRACKET:
				buffer.append("\n");
				for (int i = 0; i < (tabCount); i++) {
					buffer.append("\t");
				}
				buffer.append(ch);
				buffer.append("\n");
				isPrevComma = false;
				isPrevbrace = true;
				tabCount++;
				break;
			case CONST_CLOSE_BRACKET:
				buffer.append("\n");
				for (int i = 0; i < (tabCount - 1); i++) {
					buffer.append("\t");
				}
				buffer.append(ch);
				isPrevComma = false;
				isPrevbrace = true;
				tabCount--;
				break;
			case CONST_COMMA:
				buffer.append(ch);
				buffer.append("\n");
				isPrevComma = true;
				isPrevbrace = false;
				break;
			default:
				if (isPrevbrace || isPrevComma) {
					for (int i = 0; i < tabCount; i++) {
						buffer.append("\t");
					}
				}
				isPrevComma = false;
				isPrevbrace = false;
				buffer.append(ch);
				break;
			}
		}

	}

	public String readFromJsonFile(String fileName) {
		String output = null;

		try {
			File file = new File(fileName);
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			output = br.readLine();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return output;
	}
	
	public String writeToJsonFile(String fileName, String input) {
		String output = null;

		try {
			File file = new File(fileName);
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fileWriter);
			System.out.println(input);
			bw.write(input);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return output;
	}

	public static void main(String[] args) {

		FormatJson formatJson = new FormatJson();
/*
		// case 1
		//formatJson.case1();
		System.out.println();

		// case 2
		//formatJson.case2();
		System.out.println();

		// case 3
		//formatJson.case3();
		System.out.println();

		// case 4
		//formatJson.case4();
		System.out.println();

		// case 5
		//formatJson.case5();
		System.out.println();

		// case 6
		//formatJson.case6();
		System.out.println();
		*/
		// case 7
		formatJson.case7();
		System.out.println();

	}

	private void case7() {

		StringBuffer buffer = new StringBuffer();
		String input = readFromJsonFile("/Users/smanchikalapudi/Documents/input7.json");
		format(input, buffer);
		writeToJsonFile("/Users/smanchikalapudi/Documents/output7.json", buffer.toString());
	}

	private void case1() {

		StringBuffer buffer = new StringBuffer();
		String input = "";
		format(input, buffer);
		System.out.println("output1 ->>");
		System.out.println(buffer.toString());
	}

	private void case2() {
		StringBuffer buffer = new StringBuffer();
		String input = "{}";
		format(input, buffer);
		System.out.println("output2 ->>");
		System.out.println(buffer.toString());

	}

	private void case3() {
		StringBuffer buffer = new StringBuffer();
		String input = "{\"name\":\"raja\", \"id\":\"111\"}";
		format(input, buffer);
		System.out.println("output3 ->>");
		System.out.println(buffer.toString());
	}

	private void case4() {
		StringBuffer buffer = new StringBuffer();
		String input = "{\"name\":\"raja\", \"id\":\"111\", \"address\":{\"street1\":\"4950 Stevenson Blvd\", "
				+ "\"street2\":\"Apt\", \"city\":\"Fremont\", \"state\":\"CA\", \"zip\":\"94538\"}}";
		format(input, buffer);
		System.out.println("output4 ->>");
		System.out.println(buffer.toString());
	}

	private void case5() {
		StringBuffer buffer = new StringBuffer();
		String input = "{\"name\":\"raja\", \"id\":\"111\", \"address\":{\"street1\":\"4950 Stevenson Blvd\", "
				+ "\"street2\":\"Apt\", \"city\":\"Fremont\", \"state\":\"CA\", \"zip\":\"94538\"},"
				+ "[{}]}";
		format(input, buffer);
		System.out.println("output5 ->>");
		System.out.println(buffer.toString());
	}

	private void case6() {
		StringBuffer buffer = new StringBuffer();
		String input = "{\"name\":\"raja\", \"id\":\"111\", \"address\":{\"street1\":\"4950 Stevenson Blvd\", "
				+ "\"street2\":\"Apt\", \"city\":\"Fremont\", \"state\":\"CA\", \"zip\":\"94538\"},"
				+ "\"appoitments\":[{\"id\":123456,\"time\":\"06-12-2017\"},{\"id\":234567,\"time\":\"06-15-2017\"},{\"id\":345678,\"time\":\"06-18-2017\"}]}";
		format(input, buffer);
		System.out.println("output6 ->>");
		System.out.println(buffer.toString());

	}

}
