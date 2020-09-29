package com.company;

public class MathEx {
    public static void main(String[] args) {
        /*int num = swap(9876);
        System.out.println(num);
        timeLeft(4,35,6,38);*/
        int num2 = dayOfWeek(0,14);
        System.out.println("Day of Week: "+num2);
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
        //int x = (date-firstDay+8)%7;
        //int x = date%7-1+firstDay-1+7+date%7;
        int x = date%7+1-firstDay;
        //int x = date%7+firstDay-1;                                    //%7
        return x;
    }
}
