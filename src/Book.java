public class Book {

    //Поля
    private String name;
    private Author author;
    private int publicationDate;

    //Конструктор
    public Book(String name, Author author, int publicationDate) {
        this.name = name;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    //Геттеры
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    //Сеттеры
    public void setPublicationDate(int newPublicationDate) {
        this.publicationDate = newPublicationDate;
    }
}
