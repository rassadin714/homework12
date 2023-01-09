public class Book {
    String author;
    String bookName;
    int yearOfPublication;

    public Book (String author, String bookName, int yearOfPublication){
        this.author = author;
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
    }
    public String getAuthor() {
        return this.author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYearOfPublication(){
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
