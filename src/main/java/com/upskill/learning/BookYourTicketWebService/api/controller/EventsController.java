package com.upskill.learning.BookYourTicketWebService.api.controller;

import com.upskill.learning.BookYourTicketWebService.model.request.Events;
import com.upskill.learning.BookYourTicketWebService.service.IEventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

import static com.upskill.learning.BookYourTicketWebService.utils.Constants.Routes.*;

@RestController
@RequiredArgsConstructor
public class EventsController {

    private final IEventsService eventsService;

    @PostMapping(CREATE_EVENTS)
    @ResponseStatus(HttpStatus.CREATED)
    public Events createEvents(
            @Valid @RequestBody Events events) {
        return eventsService.createEvent(events);
    }

    @GetMapping(GET_ALL_EVENTS)
    public List<Events> getAllEvents(){
        List<Events> eventsList = eventsService.getAllEventsList();
        return eventsList;
    }

    @GetMapping(GET_EVENT)
    public Optional<Events> getEvent(
            @Valid @PathVariable final Integer eventId) {
        return eventsService.getEvent(eventId);
    }

    @PutMapping(UPDATE_EVENTS_LIST)
    public Optional<Events> updateEvents(
            @Valid @PathVariable final Integer eventId) {
        return eventsService.updateEvents(eventId);
    }

    @DeleteMapping(DELETE_EVENT)
    public void DeleteEvents(
            @PathVariable final Integer eventId) {
        eventsService.deleteEvents(eventId);
    }
}
