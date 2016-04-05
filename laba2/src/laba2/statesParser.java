package laba2;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class statesParser implements Interface<States>{
    

	@Override
	public States parse(String str) {
States object=new States();
        
        String findShtat="[A-Z][A-Z]";
        Pattern patternShtat=Pattern.compile(findShtat);
        Matcher matcherShtat=patternShtat.matcher(str);
        if (matcherShtat.find()){
            String result = matcherShtat.group();
            object.setState(result);
        }

        String findShir="\\-[0-9\\.]+\\,";
        Pattern patternShir=Pattern.compile(findShir);
        Matcher matcherShir=patternShir.matcher(str);
        while (matcherShir.find()){
            String result = matcherShir.group().replaceAll(",","");
            object.setX(Double.parseDouble(result));
        }

        String findDolg="\\s[0-9\\.]+\\]";
        Pattern patternDolg=Pattern.compile(findDolg);
        Matcher matcherDolg=patternDolg.matcher(str);
        while (matcherDolg.find()){
            String result = matcherDolg.group().replaceAll("]","");
            object.setY(Double.parseDouble(result));
        }

        return object;
	}
}