package org.example.rwitter.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Messages {
    @Id
    private long id;

    private String text;

    private int likes;

    private long account_id;

    private Date date;

}
