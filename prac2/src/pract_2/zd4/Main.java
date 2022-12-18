package pract_2.zd4;

import java.util.ArrayList;
import java.util.Scanner;
class Shop{
    private String PC;
    private ArrayList<String> models;
    Shop(String PC){
        models = new ArrayList<>();
        this.PC=PC;
    }
    Shop(){
         models = new ArrayList<>();
    }
    public String getPC(){
        return PC;
    }
    public void setPC(String PC){
        this.PC=PC;
    }
    public void delPC(String a){
        models.remove(a);
    }
    public void add(String a){
        models.add(a);
    }

    public void getList(){
        for(int i = 0; i<models.size();i++){
            System.out.println(models.get(i));
        }
    }

    public boolean find(String a) {
        if (models.contains(a)){
            return true;
        } else {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Shop sh = new Shop();

        String md = in.nextLine();
        sh.add(md);
        sh.add("Apple macbook");
        sh.add("Honor book");
        sh.add("Lenovo ");
        sh.add("Majup");
        sh.getList();
        sh.delPC("Majup");
        String mod = in.nextLine();
        System.out.println(sh.find(mod));
        sh.getList();
    }
}
