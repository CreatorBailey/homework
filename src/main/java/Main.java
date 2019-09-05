package com.pluralsight.homework;

public class Main {
    public static void main(String[] args) {
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;

        int result2 = (valA - valB) / valC;

        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB;

        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3);
        System.out.println(result4);

        float floatval = 1.0f;
        double doubleval = 4.0d;
        byte byteval = 7;
        short shortval = 7;
        long longval = 5;

        short result5 = (short) byteval;
        short result6 = (short) (byteval - longval);
        double result7 = longval - floatval;
        long result8 = (long)(shortval - longval + floatval + doubleval);



        System.out.println("Success");
    }
}