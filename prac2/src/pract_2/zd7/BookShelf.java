package pract_2.zd7;

class BookShelf {
    private Book[] shelf;
    private int n;
    private Book book;

    BookShelf(){}

     BookShelf(int n){
         Book shelf[]=new Book[n];
     }

     BookShelf(Book book, int n) {
         this.shelf[this.n]= this.book;
    }

    public Book getShelf(int i){
        return shelf[i];
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getN() {
        return n;
    }

    public void add(Book book, int i){
         this.shelf[i]=book;
    }


    public void setN(int n) {
        this.n = n;
    }


    public Book searchMin(){
         int g = Integer.MAX_VALUE;
         Book smallbook = new Book("fdd","fddf",10);
         for(int i =0;i<this.n;i++){
             if(this.shelf[i].getYear()<g){
                 g=this.shelf[i].getYear();
                 smallbook=this.shelf[i];
             }
         }
         return smallbook;
    }

    public Book searchMax(){
         int g =Integer.MIN_VALUE;
         Book bigbox = new Book("dffd","fdfd",10);
         for(int i=0;i<this.n;i++){
             if(this.shelf[i].getYear()<g){
                 g=this.shelf[i].getYear();
                 bigbox=this.shelf[i];
             }
         }
         return bigbox;
    }

    public void sort(){
        for(int i =0;i<shelf.length;i++){
            int pos=i;
            int min=shelf[i].getYear();
            Book minE = shelf[i];
            for (int j=i+1;j<shelf.length;j++){
                if(shelf[j].getYear()<min){
                    pos = j;
                    min = shelf[j].getYear();
                }
            }
            shelf[pos]=shelf[i];
            shelf[i]=minE;
        }
    }

    public String toString(){
         return this.n+")"+this.shelf[this.n];
    }

}
