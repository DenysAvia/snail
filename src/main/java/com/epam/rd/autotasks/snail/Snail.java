package com.epam.rd.autotasks.snail;
import java.util.Scanner;
public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();
    if ((a==b && a<h) || (a<h && a<b)) System.out.println("Impossible"); else { if (a>h || b>a) System.out.println(1); else {
    int res = ((h-a)/(a - b)+1);
        System.out.println(res); }}


    }
}
