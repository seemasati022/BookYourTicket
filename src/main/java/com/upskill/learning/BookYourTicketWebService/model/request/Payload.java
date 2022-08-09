package com.upskill.learning.BookYourTicketWebService.model.request;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
public class Payload {

    @Field(name = "event_time")
    private String eventTime;
    @Field(name = "event_date")
    private String eventDate;
    private List<Items> items;

}
