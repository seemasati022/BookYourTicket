package com.upskill.learning.BookYourTicketWebService.service;

import com.upskill.learning.BookYourTicketWebService.model.request.Events;

import java.util.List;
import java.util.Optional;

public interface IEventsService {
    Events createEvent(Events events);
    List<Events> getAllEventsList();
    Optional<Events> getEvent(Integer eventId);
    Optional<Events> updateEvents(Integer eventId);

    void deleteEvents(Integer eventId);
}
