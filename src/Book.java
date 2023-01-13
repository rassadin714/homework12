import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearOfPublication, authorName);
    }

    @Override
    public String toString() {
        return  "Название книги = " + bookName +
                ", Дата публикации = " + yearOfPublication +
                ", Имя автора = " + authorName;
    }
}
