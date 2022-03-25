package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static List<Integer> getZigZagList(List<Integer> l1, List<Integer> l2) {
		//your code
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			if(i%2==0)
			{
				list.add(l1.get(i));
			}
			else
			{
				list.add(l2.get(i));
			}
		}
		return list;
	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		List<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);

		System.out.println(getZigZagList(list1, list2));
		//expected output : [10,200,30,400,50]
		//get even index elements from list 1, odd index elements from list 2 
		//store all in to another list and return   

	}
}
