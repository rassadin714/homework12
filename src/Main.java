public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book("Л. Н.Толстой", "Война и Мир", 1867);
        System.out.println("warAndPeace = " + warAndPeace.getAuthor());
        System.out.println("warAndPeace = " + warAndPeace.getBookName());
        System.out.println("warAndPeace = " + warAndPeace.getYearOfPublication());

        Book greenMile = new Book("Стивен Кинг", "Зелена миля", 1996);
        System.out.println("greenMile = " + greenMile.getAuthor());
        System.out.println("greenMile = " + greenMile.getBookName());
        System.out.println("greenMile = " + greenMile.getYearOfPublication());
        greenMile.setYearOfPublication(2001);
        System.out.println("greenMile = " + greenMile.getYearOfPublication());


        Author author1 = new Author("Лев", "Толстой");
        System.out.println("author1 = " + author1.getAuthorName());
        System.out.println("author1 = " + author1.getLastNameOfAuthor());


        Author author = new Author("Стивен", "Кинг");
        System.out.println("author = " + author.getAuthorName());
        System.out.println("author = " + author.getLastNameOfAuthor());

    }
}