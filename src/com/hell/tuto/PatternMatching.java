package com.hell.tuto;

public class PatternMatching {

    public static void main(String[] args) {

        Object obj = new Object();

        if(obj instanceof String s && s.length() >5){
            int lg = s.length();
        }

    }

    public boolean equals(Object obj){
        int x = 0;
        int y = 0;
        return (obj instanceof Point param) && x == param.x && y == param.y;
    }

}


class Point{
    int x;
    int y;
}