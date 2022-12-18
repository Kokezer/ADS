package pract_8.zd1;

import java.util.Scanner;

public class Test {

    public static void tringle(int n){
        if(n>0){
            tringle(n-1);
            for(int i =1;i<=n;i++){
                System.out.print(n+" ");
            }
        } else {
            return;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        tringle(7);
    }
}
