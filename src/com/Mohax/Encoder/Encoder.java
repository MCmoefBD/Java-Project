package com.Mohax.Encoder;
import com.Mohax.Utils.*;
public class Encoder {
public static String[] cutter(String g){
	String[] array = new String[g.length()+1];
	for(int i=0; i<g.length(); i++){
		array[i+1]=g.substring(i, i+1);
	}
	return array;
}
}
