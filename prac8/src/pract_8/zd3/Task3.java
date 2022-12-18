package pract_8.zd3;

import java.util.Scanner;

public class Task3 {

    public static void enter(int A, int B){
        if(A > B){
            System.out.print(A+" ");
            enter(A-1,B);
        } else if (A < B) {

            enter(A,B-1);
            System.out.print(B+" ");
        } else if (A==B) {
            System.out.print(A+" ");
        } else return;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        enter(A,B);
    }
}
