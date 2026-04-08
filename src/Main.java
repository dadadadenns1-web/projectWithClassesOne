
public class Main {

    public static void readBookInfo(Book book) {
        System.out.println("Имя книги = " + book.getName());
        System.out.println("Имя писателя книги = " + book.getAuthor().getFirstName());
        System.out.println("Фамилия писателя книги = " + book.getAuthor().getLastName());
        System.out.println("Год публикации = " + book.getPublicationDate());
        System.out.println();
    }

    public static void main(String[] args) {

        //Используем конструкторы
        Author lionAndDogAuthor = new Author("Лев", "Николаевич");
        Book lionAndDog = new Book("Лев и собачка", lionAndDogAuthor, 1975);
        Author mumuAuthor = new Author("Иван", "Тургенев");
        Book mumu = new Book("Муму", mumuAuthor, 1854);

        //Проверка
        System.out.println("Использование геттеров\n");

        readBookInfo(lionAndDog);
        readBookInfo(mumu);

        //Используем сеттеры, меняем год публикации Муму
        mumu.setPublicationDate(1900);

        //Проверка после изменения года публикации Муму
        System.out.println("Проверка\n");

        readBookInfo(lionAndDog);
        readBookInfo(mumu);

    }
}