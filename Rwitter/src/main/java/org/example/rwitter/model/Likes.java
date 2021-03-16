package org.example.rwitter.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Likes {
    @Id
    private long id;

    private long message_id;

    private long account_id;
}
