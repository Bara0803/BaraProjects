package org.example.rwitter.repository;

import org.example.rwitter.model.Messages;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends CrudRepository<Messages, Long> {
}
