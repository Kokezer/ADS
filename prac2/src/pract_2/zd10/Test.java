package pract_2.zd10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String string = in.nextLine();
        HowMany howMany = new HowMany(string);
        System.out.println(howMany.getWordSum());

    }
}
