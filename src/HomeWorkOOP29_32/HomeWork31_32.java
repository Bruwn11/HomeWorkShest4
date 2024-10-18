package HomeWorkOOP29_32;

public class HomeWork31_32 {
    public static void main(String[] args) {
        Author author1 = new Author("Александр","Иванов");
        Author author2 = new Author("Фёдор","Петров");
        Author author3 = new Author("Никита", "Сидоров");

        Book book1 = new Book("Книга1",author1,2001);
        book1.setTitle("Книга3");
        book1.setYears(2003);
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getYears());

        Book book2 = new Book("Книга2",author2,2002);
        book2.setAuthor(author3);
        System.out.println(book2.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getYears());

        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
