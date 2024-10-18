package HomeWorkOOP29_32;

public class HomeWork29_30 {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setFirstName("Александр");
        author1.setLastName("Иванов");
        Author author2 = new Author();
        author2.setFirstName("Фёдор");
        author2.setLastName("Петров");

        Book book1 = new Book();
        book1.setTitle("Книга1");
        book1.setYears(2001);
        book1.setAuthor(author1);

        Book book2 = new Book();
        book2.setTitle("Книга2");
        book2.setYears(2002);
        book2.setAuthor(author2);

        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
    }
}
