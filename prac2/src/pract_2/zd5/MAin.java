package pract_2.zd5;

import java.util.ArrayList;
import java.util.Scanner;

class Dog{
    private int age;
    private String name;
    Dog(){}
    Dog(String name, int age){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int fromDogToHum(int age){
        return age*7;
    }

    public String toSTring(){

        return "Кличка:"+name+"\n"+
                "Возраст:"+age+"\n"+
                "В человеческих годах:"+fromDogToHum(age);
    }
}

class DogsPitomnik{
    private ArrayList<Dog> pit = new ArrayList<>();

    DogsPitomnik(String dog){}
    DogsPitomnik(){
        pit = new ArrayList<>();
    }
    public void addDog(Dog dog){
        pit.add(dog);
    }
    public void getList(ArrayList<Dog> pit){
        for (int i = 0;i< pit.size();i++){
            System.out.println(pit.get(i));
        }
    }
}

public class MAin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Dog dg = new Dog();
        Dog arr[] = new Dog[3];
        DogsPitomnik pitomnik = new DogsPitomnik();
        for (int i = 0 ; i<=3;i++){
            int age = in.nextInt();
            String name = in.nextLine();

        }
        System.out.println(dg.toSTring());
    }
}
