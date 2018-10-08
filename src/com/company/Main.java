package com.company;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void work ()
    {
        for(int n=2;n>10;n++)// int n=2; - целочисленные решеия с данным условием
        { for(int a=1;a<100;a++)
         for(int b=1;b<100;b++)
             for(double c=1;c<100;c++)
        {
c=(Math.pow(c,n));
if(c==Math.pow(a,n)+Math.pow(b,n)){
    System.out.println(a+"^"+n+"*"+b+"^"+n+"="+c);
}
        }
}

    }
    public static void main(String[] args){
      work();
    }
}
