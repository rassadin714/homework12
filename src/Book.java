public class Book {
    private String bookName;
    private int yearOfPublication;

    public Book (String bookName, int yearOfPublication){
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
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
