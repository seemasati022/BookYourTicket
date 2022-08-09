package com.upskill.learning.BookYourTicketWebService.repository;

import com.upskill.learning.BookYourTicketWebService.model.request.Events;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IEventsRepository extends MongoRepository<Events, Integer> {

}
