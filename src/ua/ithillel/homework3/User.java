package ua.ithillel.homework3;

public class User {

    private String name;
    private String surname;
    private String email;
    private String password;
    private String gender;
    private String country;

    public User() {

    }

    public User(String name, String surname, String email, String password, String gender, String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public void read() {
        System.out.println("Entered you text: ");
        String output = Main.sc.nextLine();
        System.out.println("You text is: ".concat(output));
    }

    public void write() {
        System.out.println("Example text write: ");
        String input = Main.sc.nextLine();
        System.out.println("Your example text: " + input);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
