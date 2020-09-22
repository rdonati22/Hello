package com.company;

public class Mars {
    public static void main(String[] args){
        System.out.println("Hey");
        planets();
        System.out.println("Until next time");
        stars();
    }
    public static void planets(){
        System.out.println("Planet Mars");
    }
    public static void stars(){
        System.out.println("Moon");
        planets();
        System.out.println("Sun");
    }
}
