public class Author {

    //Поля
    private String firstName;
    private String lastName;

    //Конструктор
    public Author(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    //Геттеры
    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }


}
