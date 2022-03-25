package org.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String3 {

	public List<String> getStrings(String input1, char input2){
		ArrayList<String> a =new ArrayList<String>();
		String m="";
		for(int i=0;i<input1.length();i++)
		{	
			if(input1.charAt(i)==input2)
			{
				a.add(m);
				m="";
			}
			else
			{
				m=m+ Character.toString( input1.charAt(i));
				
			}
			
			
		}
		if(!(m.equals("")))
			a.add(m);
		Collections.sort(a);

		return a;
	}
	
	public static void main(String[] args) {

		String input1="raja/pavan/anju";
		char input2 = '/';
		String3 s1=new String3();
		System.out.println(s1.getStrings(input1, input2));

	}

}
