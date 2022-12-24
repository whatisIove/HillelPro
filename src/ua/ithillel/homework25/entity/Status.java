package ua.ithillel.homework25.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "statuses")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@NamedNativeQuery(name = "getAllStatuses", query = "SELECT * FROM statuses;", resultClass = Status.class)
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String alias;
    private String description;

    public Status(String alias, String description) {
        this.alias = alias;
        this.description = description;
    }
}