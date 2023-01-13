public class Book {
    private String bookName;
    private int yearOfPublication;
    private Author authorName;

    public Book (String bookName, int yearOfPublication, Author authorName){
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
        this.authorName = authorName;
    }


    public String getBookName() {
        return this.bookName;
    }

    public int getYearOfPublication(){
        return this.yearOfPublication;
    }

    public String getAuthorName() {
        return authorName.getAuthorName() + " " + authorName.getLastNameOfAuthor();
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
