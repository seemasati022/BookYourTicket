package com.upskill.learning.BookYourTicketWebService.model.request;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.Valid;

@Data
@Builder
public class Events {
    @Id
    private Integer id;
    private String type;
    @Field(name = "owner_id")
    private String ownerId;
    @Valid
    private Payload payload;
    @Field(name = "published_at")
    private String publishedAt;
}
