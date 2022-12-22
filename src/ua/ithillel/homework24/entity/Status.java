package ua.ithillel.homework24.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Status {
    private int id;
    private String alias;
    private String description;

    public Status(String alias, String description) {
        this.alias = alias;
        this.description = description;
    }
}
