public class Author {
    String authorName;
    String lastNameOfAuthor;

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
}
