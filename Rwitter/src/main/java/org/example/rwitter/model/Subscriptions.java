package org.example.rwitter.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Subscriptions {
    @Id
    private long id;

    private long account_id;

    private long subscribe_id;

}
