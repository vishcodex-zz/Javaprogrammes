package org.demo.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Datastructures {

	public static void main(String[] args)
	{
		
		Map<String, List<String>> makeModel = new HashMap<String,List<String>>();
		
		List<String> hondaList = new ArrayList<String>();
		hondaList.add("civic");
		hondaList.add("prelude");
		
		List<String> toyotaList = new ArrayList<String>();
		toyotaList.add("Corolla");
		toyotaList.add("Rav 4");
		
		makeModel.put("Honda", hondaList);
		makeModel.put("toyota", toyotaList);
		
		System.out.println(makeModel.get("Honda"));
		System.out.println(makeModel.get("toyota"));
		
	}
	
	public void Listmethod()
	{
		// TODO Auto-generated method stub
		List<String> arraylist = new ArrayList<String>();
		
		arraylist.add("H");
		arraylist.add("E");
		arraylist.add("L");
		arraylist.add("L");
		arraylist.add("O");
		
		for (String s: arraylist)
		{
			System.out.print(s);
		}
		
	}
	
	public void arrayMethod ()
	{
	char[] chararray = new char[5];
		
		chararray[0] = 'H';
		chararray[1] = 'E';
		chararray[2] = 'L';
		chararray[3] = 'L';
		chararray[4] = 'O';
		
		//for each loop
		//for (int i=0; i<chararray.length;i++)
		
		for(char c : chararray) 
		{
			System.out.print(c);
		}
	}

}
