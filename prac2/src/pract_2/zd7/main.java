package pract_2.zd7;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        int n=in.nextInt();
        BookShelf bookShelf = new BookShelf(n);

        for (int i =0;i<n;i++){
            String name = in.next();
            String nameBook=in.next();
            int year = in.nextInt();
            Book book = new Book(name,nameBook,year);
            bookShelf.add(book,i);
        }

        for(int i =0; i<n;i++){
            System.out.println(bookShelf.getBook());
        }
    }
}
