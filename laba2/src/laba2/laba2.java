package laba2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class laba2 {
    public static void main(String[] args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String getStr = br.readLine();
        //String[] mas = getStr.split(", \"");
        //String str;
       /* States state;
       Interface<States> statesParser = new statesParser();
        ArrayList<States> masOfState=new ArrayList<States>();
        for(int i=0;i<mas.length;i++){
            str=mas[i];
            state = statesParser.parse(str);
            masOfState.add(state);
        }
        br.close();
        System.out.println();
       for(States a:masOfState) {
            System.out.println(a.getState());
            System.out.println(a.getX());
            System.out.println(a.getY());
        }*/
        
        Interface<Tweet> tweetParser = new TweetParser();
        
        ArrayList<Tweet> tweet= new ArrayList<Tweet>();
        Tweet bla;
        Generetic1 generetic1=new Generetic1();
        Scanner in = new Scanner(System.in);

        int a=Integer.parseInt(args[1]);
        int b=Integer.parseInt(args[2]);
        int k=0;
       String stroka = in.nextLine();
        while ( (getStr = br.readLine() ) != null )  {
        	if(k>=a && k<=a+b) {
                bla = tweetParser.parse(getStr);
                tweet.add(bla);
            }
            k++;
            if(k==a+b) break;
        }
        generetic1.Generetic(tweet,stroka);
        br.close();
    	
    	/*sentimentsParser sentimentsParser = new sentimentsParser();
        Sentiments sentiments;
        String getStr;
        while ( (getStr = br.readLine() ) != null) {
        	sentiments = sentimentsParser.parse(getStr);
        	sentiments.toString();
        }
        br.close();*/
    }
}