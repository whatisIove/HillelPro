package ua.ithillel.homework25.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@NamedNativeQueries({
        @NamedNativeQuery(name = "getAllClients", query = "SELECT * FROM clients;", resultClass = Client.class),
        @NamedNativeQuery(name = "getClientByPhone", query = "SELECT * FROM Clients WHERE phone = :phone",
                resultClass = Client.class)
})

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private long phone;
    private String about;
    private int age;

    public Client(String name, String email, long phone, String about, int age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.about = about;
        this.age = age;
    }
}