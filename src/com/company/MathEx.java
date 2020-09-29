package com.company;

public class MathEx {
    public static void main(String[] args) {
        int num = swap(9876);
        System.out.println(num);
        //timeLeft(2,35,6,38);
    }
    public static int swap(int x) {
        int y = (x/10)%10;
        int z = ((x*10)/10)%10;
        int a = x/100;
        return a;
        //return z;
        //return y;
        /*System.out.print(a);
        System.out.print(z);
        System.out.print(y);*/
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
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int h = depHour - curHour;
        int m = depMin - curMin;
        if (m<0){
            h--;
            m=60-curMin+depMin;
        }
        System.out.println("Train leaves in "+h+" hours and "+m+" minutes!!");
    }
    public static void dayOfWeek(int firstDay, int date){
                                    //%7
        System.out.println("");
    }
}
