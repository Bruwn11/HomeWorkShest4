package HomeWorkOOP29_32;

public class Book {
    private String title;
    private Author author;
    private Integer years;


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

    public String getInfo() {
        return "Book{" +
                "Нзвание книги '" + title + '\'' +
                ", автор " + author.getInfo() +
                ", год издания " + years +
                '}';
    }
}

