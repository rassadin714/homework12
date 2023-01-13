public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        System.out.println(author1);
        System.out.println("author1 = " + author1.getAuthorName());
        System.out.println("author1 = " + author1.getLastNameOfAuthor());

        Book warAndPeace = new Book("Война и мир", 1867,author1 );
        System.out.println(warAndPeace);
        System.out.println("warAndPeace = " + warAndPeace.getAuthorName());
        System.out.println("warAndPeace = " + warAndPeace.getBookName());
        System.out.println("warAndPeace = " + warAndPeace.getYearOfPublication());



        Author author = new Author("Стивен", "Кинг");
        System.out.println(author);
        System.out.println("author = " + author.getAuthorName());
        System.out.println("author = " + author.getLastNameOfAuthor());

        Book greenMile = new Book("Зелена миля",  1996,author);
        System.out.println(greenMile);
        System.out.println("greenMile = " + greenMile.getBookName());
        System.out.println("greenMile = " + greenMile.getYearOfPublication());
        greenMile.setYearOfPublication(2001);
        System.out.println("greenMile = " + greenMile.getYearOfPublication());


        if (warAndPeace.equals(greenMile)) {
            System.out.println("Книги написаны одним автором");
        } else {
            System.out.println("Книги написаны разными авторами");
        }


        if (author1.equals(author)) {
            System.out.println("Один и тот же автор");
        } else {
            System.out.println("Разные автры");
        }
    }

}