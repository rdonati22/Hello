package com.company;

public class MathEx {
    public static void main(String[] args) {
        swap(9876);
    }
    public static void swap(int x) {
        int y = (x/10)%10;
        int z = ((x*10)/10)%10;
        int a = x/100;
        System.out.print(a);
        System.out.print(z);
        System.out.print(y);
        /*if (a!=0){
            System.out.print(a);
            System.out.print(z);
            System.out.print(y);
        }
        else{
            System.out.print(z);
            System.out.print(y);
        }*/
    }
}
