package com.company;

public class MathEx {
    public static void main(String[] args) {
        int input = swap(123);
        System.out.println(input);
        input = swap(6);
        System.out.println(input);
        input = swap(381);
        System.out.println(input);

        timeLeft(1,34,8,20);
        timeLeft(1,15,4,36);

        int input2 = dayOfWeek(0,1);
        System.out.println("Day of Week: "+input2);
        input2 = dayOfWeek(0,14);
        System.out.println("Day of Week: "+input2);
        input2 = dayOfWeek(6,22);
        System.out.println("Day of Week: "+input2);
        input2 = dayOfWeek(5,4);
        System.out.println("Day of Week: "+input2);
        input2 = dayOfWeek(1,24);
        System.out.println("Day of Week: "+input2);
        input2 = dayOfWeek(2,1);
        System.out.println("Day of Week: "+input2);
    }
    public static int swap(int x) {
        int y = (x/10)%10;
        int z = ((x*10)/10)%10*10;
        int a = x/100*100;
        int h = a+z+y;
        return h;
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
    public static int dayOfWeek(int firstDay, int date){
        int x = (date+firstDay-1)%7;
        return x;
    }
}