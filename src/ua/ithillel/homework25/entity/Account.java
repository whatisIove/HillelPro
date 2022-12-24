package ua.ithillel.homework25.entity;

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
    @Column(name = "client_id")
    private int clientId;
    private String number;
    private double value;

    public Account(int clientId, String number, double value) {
        this.clientId = clientId;
        this.number = number;
        this.value = value;
    }
}
