package laba2;

import java.awt.List;

public class States{
private String shtat="   ";
private String shir;
private String dolg;

public String getShtat(){
	return shtat;
}

public String getShir(){
return shir;
}

public String getDolg(){
return dolg;
}

public void setShtat( String shtat ){
this.shtat=shtat;
}
public void setShir( String shir ){
this.shir=shir;
}

public void setDolg( String dolg ){
this.dolg=dolg;
}
public String toString(){
	System.out.println(shtat+shir+","+dolg);
	return null;
	}
}