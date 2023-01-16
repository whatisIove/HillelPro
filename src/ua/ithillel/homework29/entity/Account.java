package ua.ithillel.homework29.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@NamedNativeQuery(name = "getAllAccounts", query = "SELECT * FROM accounts;", resultClass = Account.class)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //    @Column(name = "client_id", insertable = false, updatable = false)
    //    private int clientId;
    private String number;
    private Double value;

    public Account(String number, Double value) {
        this.number = number;
        this.value = value;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;
}