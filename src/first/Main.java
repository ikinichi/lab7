package first;

import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        print(32);
        print(new Integer(32));

    }

    public static void print(int number) {
        System.out.println(number + "- целочисленный примитив");
    }

    public static void print(String string){
        System.out.println(string);
    }

    public static void print(Integer number){
        System.out.println(number+" - ссылочная переменная " );
    }
    public static void print(int[] a){
        for(int v:a)
            System.out.println(v);
    }

    public static void print(Queue qu){
        while (!qu.isEmpty())
            System.out.println(qu.poll().toString());
    }

    public static void print(int number, String description){
        System.out.println(number+" -"+description );
    }

    public static void print(Integer n1,Integer n2,Integer n3){
        System.out.println(n1.toString()+" "+n2.toString()+" "+n3.toString());
    }
    public static void print(double number){
        System.out.println(number);
    }

    public static int min(int a,int b){
        if (a<=b)
            return a;
        else
            return b;
    }

    public static long min(long a,long b){
        if (a<=b)
            return a;
        else
            return b;
    }

    public static double min(double a,double b){
        if (a<=b)
            return a;
        else
            return b;
    }

    public static double max(double a,double b){
        if (a>=b)
            return a;
        else
            return b;
    }

    public static int max(int a,int b){
        if (a>=b)
            return a;
        else
            return b;
    }

    public static long max(long a,long b){
        if (a>=b)
            return a;
        else
            return b;
    }


}
