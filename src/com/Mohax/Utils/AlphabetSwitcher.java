package com.Mohax.Utils;

public class AlphabetSwitcher {
public static String[] alphabet= {" ",
	                              "a",
	                              "b",
	                              "c",
	                              "d",
	                              "e",
	                              "f",
	                              "g",
	                              "h",
	                              "i",
	                              "j",
	                              "k",
	                              "l",
	                              "m",
	                              "n",
	                              "o",
	                              "p",
	                              "q",
	                              "r",
	                              "s",
	                              "t",
	                              "u",
	                              "v",
	                              "w",
	                              "x",
	                              "y",
	                              "z"};
public static String AlphaSwitch(int q){
	String e= null;
	try{
	e= alphabet[q-1];
	}
	catch(ArrayIndexOutOfBoundsException w){
	System.out.println("That was not a letter, returning 'a'");
	e="a";
	}
	return e;
}
public static String[] ArrayN = null;
public static void AlphaS(String[] q){
	ArrayN=null;
	String[] array= new String[q.length];
	for(int i=1; i<q.length; i++){
		for(int w=0; w<alphabet.length; w++){
			if(q[i].toLowerCase().equals(alphabet[w])){
			
			array[i]=""+(w);
			
			}
		}
	}
	ArrayN=array;
}

}
