package laba2;

import java.util.ArrayList;

public class Generetic1 {

	public ArrayList<Tweet> Generetic(ArrayList<Tweet> object,String stroka){

		ArrayList<Tweet> vasya= new ArrayList<Tweet>();
		for(Tweet t :  object){
		if(t.getText().contains(stroka)) {t.toString(); vasya.add(t);}}
		return vasya;
	}
}
