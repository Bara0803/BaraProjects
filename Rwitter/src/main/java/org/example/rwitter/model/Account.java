package org.example.rwitter.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Account {
    @Id
    private long id;

    private String name;

    private Date birthday;

    private String email;

    private long user_id;


}
