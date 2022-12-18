package pract_8.zd7;

import java.util.Scanner;

public class Task7 {

    public static int palindrom(String word,int i){
        if(i>1){
            palindrom(word,i-1);
            if(word.charAt(i)==word.charAt(word.length()-1)){
                return i+1;
            } else return i+0;
        }else return 0;
    }

    public static String verificationPolinrom(String word, int i){
        if(palindrom(word,i)==word.length()){
            return "YE";
        }else return "N";
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        System.out.println(verificationPolinrom(word,word.length()-1));

    }
}
