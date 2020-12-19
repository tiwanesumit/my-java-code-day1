package com.visionit;

public class Myfirstclass {

	public static void main(String[] args) {
		//Subtraction
		Subtraction obj = new Subtraction();
		int result;
		obj.var1 = 40;
		obj.var2 = 25;
		obj.subbnumber();
		// Addition
		Addition obj1 = new Addition();
		int result1;
		obj1.var3 = 50;
		obj1.var4 = 25;
		obj1.Caladdition();
		//multiplication
		multiplication obj2 = new multiplication();
		int result2;
		obj2.var5 = 25;
		obj2.var6 = 4;
		obj2.multplicationofnumber();
		//Division
		Division obj3 = new Division();
		int result3;
		obj3.var7 = 100;
		obj3.var8 = 4;
		obj3.divisionofnumber();
		//ifelse condition
		
		
		
		
		System.out.println("the result of subtraction:" +obj.result);
		System.out.println("the result of addition:" +obj1.result1);
		System.out.println("the result of multiplication:" +obj2.result2);
		System.out.println("the result of Division:" +obj3.result3);
	}

}
