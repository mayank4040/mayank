package org.string;

import java.util.ArrayList;

class Product {
	int productId;
	String productName;
	double productCost;
	public Product(int productId, String productName, double productCost) {
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductCost() {
		return productCost;
	}
	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	
	
	//setters, getters and constructors
}


public class String2 {
	
	public Product getProduct(String input) {
		//build the product object and return
		ArrayList<String> a =new ArrayList<String>();
		String m="";
		for(int i=0;i<input.length();i++)
		{	
			if(input.charAt(i)=='#')
			{
				a.add(m);
				m="";
			}
			else
			{
				m=m+ Character.toString( input.charAt(i));
				
			}
			
			
		}
		if(!(m.equals("")))
			a.add(m);
		System.out.println(a);
		Product p1=new Product(Integer.parseInt(a.get(0)),a.get(1),Double.parseDouble(a.get(2)));
		
		return p1;
	}

	public String getDeliveryDetails(Product product) {
		
		/*if the product cost is >= 50000 display out out as "order will be delivered in 1 day"
		if the product cost is > 25000 and < 50000 display out out as "order will be delivered in 2 days"
		if the product cost is < 25000 display out out as "order will be delivered in 7 days"
		if the product cost is zero display out out as "invalid cost"
		*/
		if(product.getProductCost()>=50000)
			return "order will be delivered in 1 day";
		else if(product.getProductCost()>25000 && product.getProductCost()<50000)
			return "order will be delivered in 2 day";
		else if(product.getProductCost()<25000)
			return "order will be delivered in 7 day";
		else if(product.getProductCost()==0)
			return "Invalid cost";
		else
			return "wrong cost";
	}
	public static void main(String[] args) {
		String input = "3453#laptop#54000";
		String2 s1=new String2();
		Product p1=s1.getProduct(input);
		System.out.println(s1.getDeliveryDetails(p1));
		
		
	}
}

