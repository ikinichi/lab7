import first.Main;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test1 {
    public static void main(String[] args){
        Main.print(3);
        Main.print(new Integer(4));
        Main.print(3.0);
        Main.print(new int[] {3,4,5});
        Main.print(3," description");
        Main.print(1,2,3);
        Queue<Integer> q = new PriorityQueue<Integer>();
        q.add(123);
        q.add(454);
        Main.print(q);
        Main.print(Main.min(3,6));
        System.out.println(Main.min(Long.MAX_VALUE,Long.MIN_VALUE));
        Main.print(Main.min(3.0,6.0));
        Main.print(Main.max(3,6));
        System.out.println(Main.max(Long.MAX_VALUE,1));
        Main.print(Main.max(4.0,3.25));
    }
}
