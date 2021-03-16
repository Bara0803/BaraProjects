package org.example.rwitter.repository;

import org.example.rwitter.model.Subscriptions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends CrudRepository<Subscriptions, Long> {
}
