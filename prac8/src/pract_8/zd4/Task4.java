package pract_8.zd4;

import java.util.Scanner;

public class Task4 {

    public static int th(int i,int s){
        if(sumI(i)==s){return 1;}
        else return 0;
    }

    public static int sumI(int i){
        if(i>0){
            return i%10 + sumI(i/10);
        }else return 0;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int s = in.nextInt();
        int sum = 0;

        for(int i = (int)Math.pow(10,k-1);i<(int)Math.pow(10,k)-1;i++){
            sum+=th(i,s);
        }
        System.out.println(sum);
    }
}