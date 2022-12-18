package pract_8.zd6;

import java.util.Scanner;

public class Task6 {

    public static int verificationNumber(int n, int i){
        if(n%i==0 && i>0) {
            return n+i;
        } else if (i>0) {
            return verificationNumber(n,i-1);
        } else return n;
    }

    public static String checkSimply(int n, int i){
        if(verificationNumber(n,i)==n+1){
            return "YES";
        }else return "NO";
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i =10;

        System.out.println(checkSimply(n,10));
    }
}
