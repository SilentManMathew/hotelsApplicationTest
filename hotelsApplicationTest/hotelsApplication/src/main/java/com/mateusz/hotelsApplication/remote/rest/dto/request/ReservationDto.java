package com.mateusz.hotelsApplication.remote.rest.dto.request;

import java.util.List;

public class ReservationDto {
    private List<RoomsReservationDto> roomsReservations;
    private PersonDto person;

    public ReservationDto() {}

    public ReservationDto(List<RoomsReservationDto> roomsReservations, PersonDto person) {
        this.roomsReservations = roomsReservations;
        this.person = person;
    }

    public List<RoomsReservationDto> getRoomsReservations() {
        return roomsReservations;
    }

    public void setRoomsReservations(List<RoomsReservationDto> roomsReservations) {
        this.roomsReservations = roomsReservations;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
