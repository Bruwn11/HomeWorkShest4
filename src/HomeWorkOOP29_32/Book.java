package HomeWorkOOP29_32;

public class Book {
    private String title;
    private Author author;
    private Integer years;

    public Book() {

    }

    public Book(String title, Author author, Integer years) {
        this.title = title;
        this.author = author;
        this.years = years;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author.toString() +
                ", years=" + years +
                '}';
    }
}

