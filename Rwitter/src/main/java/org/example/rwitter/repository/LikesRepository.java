package org.example.rwitter.repository;

import org.example.rwitter.model.Likes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesRepository extends CrudRepository<Likes, Long> {
}
