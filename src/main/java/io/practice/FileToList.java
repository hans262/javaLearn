package io.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * ���ļ��е�����װ��list
 */
public class FileToList {
	public static void main(String[] args) throws IOException {
		List<String> list=new ArrayList<String>();
		BufferedReader br=new BufferedReader(new FileReader("list.txt"));
		String line; 
		while((line=br.readLine())!=null){
			list.add(line);
		}
		br.close();
		System.out.println(list);
	}
}
