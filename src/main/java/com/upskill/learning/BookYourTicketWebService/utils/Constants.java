package com.upskill.learning.BookYourTicketWebService.utils;

public final class Constants {
    private Constants() {}

    public static final class Routes {

        public static final String V1_PREFIX = "/api/v1";
        public static final String CREATE_EVENTS = V1_PREFIX+ "/create/events";
        public static final String GET_ALL_EVENTS = V1_PREFIX+ "/get/events";
        public static final String GET_EVENT = V1_PREFIX+ "/get/events/{eventId}";
        public static final String UPDATE_EVENTS_LIST = V1_PREFIX+ "/create/events/{eventId}";
        public static final String DELETE_EVENT = V1_PREFIX+ "/delete/events/{eventId}";

        private Routes(){}
    }
}
