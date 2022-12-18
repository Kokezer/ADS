package pract_2.zd7;

class Book{
    private String Author;
    private String bookName;
    private int year;

    Book(){}

    public Book(String author, String bookName, int year) {
        Author = author;
        this.bookName = bookName;
        this.year = year;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return "Автор: "+this.Author+"\n"+
                "Название: "+ this.bookName+"\n"+
                "Год выпуска: "+this.year;
    }
}