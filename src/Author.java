import java.util.Objects;

public class Author {
    private String authorName;
    private String lastNameOfAuthor;

    public Author (String authorName, String lastNameOfAuthor) {
        this.authorName = authorName;
        this.lastNameOfAuthor = lastNameOfAuthor;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getLastNameOfAuthor() {
        return this.lastNameOfAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(lastNameOfAuthor, author.lastNameOfAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, lastNameOfAuthor);
    }

    @Override
    public String toString() {
        return  "Имя автора = " + authorName  +
                ", Фамилия автора = " + lastNameOfAuthor;
    }
}
