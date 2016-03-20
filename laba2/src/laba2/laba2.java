package laba2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class laba2 {
	
public static void main(String[] args) throws IOException
{
	 BufferedReader br = new BufferedReader(new FileReader(args[0]));
	 Sentiments sentiments=new Sentiments();
	 String str;
	while((str = br.readLine() ) != null){
		sentiments = sentimentsParser.Parser(str);
		sentiments.toString();
	}
	 br.close();
}
}
