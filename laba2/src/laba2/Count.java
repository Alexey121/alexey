package laba2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count {
	public static int Parsers(String[] mas){
		String str;
		int i=0;
		int k=-1;
		while(i<mas.length &&(str = mas[i] ) != null ){
		String findShtat1="[A-Z][A-Z]";
		 Pattern patternShtat1=Pattern.compile(findShtat1);
	     Matcher matcherShtat1=patternShtat1.matcher(str);
	     if (matcherShtat1.find()){
	    	 k++;
	     }
	     i++;
		}
		return k;
}
}
