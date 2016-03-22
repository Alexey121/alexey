package laba2;

import java.util.ArrayList;

public class Coordinate {
    private ArrayList<Double> x=new ArrayList<Double>();
    private ArrayList<Double> y=new ArrayList<Double>();

    public ArrayList<Double> getX(){
        return  x;
    }

    public ArrayList<Double> getY(){
        return  y;
    }

    public void setX(Double x){
        this.x.add(x);
    }

    public void setY(Double y){
        this.y.add(y);
    }
}