package laba2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class statesParser {
	public static States Parser(String str){
	States object=new States();
	String findShtat="[A-Z][A-Z][\"][\\:]";
	 Pattern patternShtat=Pattern.compile(findShtat);
     Matcher matcherShtat=patternShtat.matcher(str);
     
     if (matcherShtat.find()){
     	String result = matcherShtat.group().replaceAll("\"","");
         object.setShtat(result);
     }
     String findShir="\\-[0-9\\.]+\\,";
     Pattern patternShir=Pattern.compile(findShir);
     Matcher matcherShir=patternShir.matcher(str);
     
     if (matcherShir.find()){
     	String result = matcherShir.group().replaceAll(",","");
         object.setShir(result);
         
     }
     
     String findDolg="\\s[0-9\\.]+\\]";
     Pattern patternDolg=Pattern.compile(findDolg);
     Matcher matcherDolg=patternDolg.matcher(str);
     
     if (matcherDolg.find()){
     	String result = matcherDolg.group().replaceAll("]","");
         object.setDolg(result);
         
     }
     
	return object;
	}
}
