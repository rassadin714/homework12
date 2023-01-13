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
}
