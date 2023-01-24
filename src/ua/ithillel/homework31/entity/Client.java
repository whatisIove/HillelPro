package ua.ithillel.homework31.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "clients",
        uniqueConstraints =
                {
                        @UniqueConstraint(columnNames = "id"),
                        @UniqueConstraint(columnNames = "email"),
                        @UniqueConstraint(columnNames = "phone"),
                })
@Getter
@Setter
@ToString
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
    private Long phone;
    private String about;
    private int age;

    public Client() {
    }

    public Client(String name, String email, Long phone, String about, int age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.about = about;
        this.age = age;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    @JoinColumn(name = "job_id")
    private Job job;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    @ToString.Exclude
    private Set<Account> accounts;

    @ManyToMany
    @JoinTable(
            name = "client_statuses",
            joinColumns = {@JoinColumn(name = "client_id")},
            inverseJoinColumns = {@JoinColumn(name = "status_id")})
    @ToString.Exclude
    private Set<Status> statuses;

    public Client(Job job) {
    }
}