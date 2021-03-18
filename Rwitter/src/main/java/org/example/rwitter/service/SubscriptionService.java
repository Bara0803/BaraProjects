package org.example.rwitter.service;


import org.example.rwitter.model.Subscriptions;

import java.util.List;


public interface SubscriptionService {

    void createSubscription(Subscriptions subscriptions);
    void deleteSubscription(Subscriptions subscriptions);
    void updateSubscription(Subscriptions subscriptions);
    List<Subscriptions> getAllSubscriptions();
}
