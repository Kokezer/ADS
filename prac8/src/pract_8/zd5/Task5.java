package pract_8.zd5;

import java.util.Scanner;

public class Task5 {

    //static int result = 0;
    public static int sumN(int N){
        if(N>0){
            return N % 10 + sumN(N /10);
        }else {
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        System.out.println(sumN(N));
    }
}
