package laba2;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class laba2 {
	
public static void main(String[] args) throws IOException
{
	 BufferedReader br = new BufferedReader(new FileReader(args[0]));
	 Sentiments sentiments=new Sentiments();
	 States states=new States();
	 String mas = br.readLine();
	 String[] mas2 = mas.split("(\\,\\s\\[)|(\\,\\s\")");
	 String str;
	 int i=0;
	while((str = mas2[i] ) != null){
		states = statesParser.Parser(str);
		states.toString();
		i++;
	}
	 br.close();
	 System.out.println(i);
}
}
