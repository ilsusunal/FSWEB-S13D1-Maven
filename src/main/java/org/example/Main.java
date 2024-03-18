package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        //clock>=8 && clock<=20 -> isBarking == true
        //clock<8 && clock>20 -> isBarking == true
        if (clock < 0 || clock >23) {
            return false;
        }
        if (isBarking){
            if (clock < 8 || clock > 20) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        // int <19 && int>13 -> true
       if (firstAge <= 19 && firstAge >= 13) {
           return true;
       }
        if (secondAge <= 19 && secondAge >= 13) {
            return true;
        }
        if (thirdAge <= 19 && thirdAge >= 13) {
            return true;
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        // temp<35 && temp>25 -> true
        // isSummer == true temp<45 -> true
        if (isSummer) {
            return temp <= 45 && temp >= 25;
            } else {
            return temp <= 35 && temp >= 25;
        }
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
       return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }

       return radius * radius * Math.PI;
    }
}
