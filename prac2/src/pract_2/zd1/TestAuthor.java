package pract_2.zd1;

import java.lang.*;
import java.util.Scanner;

class Author{
    private String name;
    private String email;
    private char gender;

    public void Author(String n, String em, char gen){
        name = n;
        email = em;
        gender = gen;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public void setName(String newName){
        name = newName;
    }
    public void setGender(char newGender){
        gender=newGender;
    }
    public void setEmail(String newEmail){
        email = newEmail;
    }
    public String toString(){
        return "Имя:"+name+"\n"+"Почта:"+email+"\n"
                +"Гендер: "+gender;
    }
}


public class TestAuthor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String n = "Нерд";
        String em = "Mambul@mail.su";
        char gen= 'M';
        Author auth = new Author();
        auth.Author(n,em,gen);
        System.out.println(auth.toString());
    }
}
