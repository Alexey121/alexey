package laba2;

import java.util.ArrayList;

public class States {
    private String state;
    Coordinate coordinate=new Coordinate();

    public String getState(){
        return state;
    }

    public ArrayList<Double> getX(){
        return coordinate.getX();
    }

    public ArrayList<Double> getY(){
        return coordinate.getY();
    }

    public void setState( String state ){
        this.state=state;
    }

    public void setX( Double x ){
        coordinate.setX(x);
    }

    public void setY( Double y ){
        coordinate.setY(y);
    }

    public String toString(){
        System.out.println(state+ ": ");
        for(Double x:coordinate.getX()) System.out.print(x+" ");
        System.out.println();
        for(Double y:coordinate.getY()) System.out.print(y+" ");
        System.out.println();
        return null;
    }
}