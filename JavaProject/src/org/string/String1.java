package org.string;

public class String1 {
	public static String getChars(String array[], int input) {
		String res="";
		for(String a:array)
		{
			try {
			res+=(a.charAt(input));
			
			}
			catch(Exception e)
			{
				res+="$";
			}
		}
		return res.toUpperCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1[] = { "Akash", "pavan", "ac", "satish", "ram", "go" };
		int input2 = 3;
		System.out.println(getChars(input1, input2-1));
		// Output1=AV$TM$
		
		
	}
}
