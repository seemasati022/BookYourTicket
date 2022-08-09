package com.upskill.learning.BookYourTicketWebService.service.impl;

import com.upskill.learning.BookYourTicketWebService.model.request.Events;
import com.upskill.learning.BookYourTicketWebService.repository.IEventsRepository;
import com.upskill.learning.BookYourTicketWebService.service.IEventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventsServiceImpl implements IEventsService {

    private final IEventsRepository eventsRepository;

    @Override
    public Events createEvent(Events events) {
        return eventsRepository.save(events);
    }

    @Override
    public List<Events> getAllEventsList() {
        return eventsRepository.findAll();
    }

    @Override
    public Optional<Events> getEvent(Integer eventId) {
        return eventsRepository.findById(eventId);
    }

    @Override
    public Optional<Events> updateEvents(Integer eventId) {
        return eventsRepository.findById(eventId);
    }

    @Override
    public void deleteEvents(Integer eventId) {
        eventsRepository.deleteById(eventId);
        return;
    }
}
