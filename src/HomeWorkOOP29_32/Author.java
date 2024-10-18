package HomeWorkOOP29_32;


public class Author {
    private String firstName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInfo() {
        return "Author{" +
                "имя автора '" + firstName + '\'' +
                ", фамилия автора '" + lastName + '\'' +
                '}';
    }
}
