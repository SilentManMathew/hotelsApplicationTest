package com.mateusz.hotelsApplication.remote.rest.dto.request;

import com.mateusz.hotelsApplication.domain.model.StatusType;

import java.util.List;

public class ReservationUpdateDto {
    private StatusType status;
    private List<RoomsReservationDto> roomsReservation;
    private PersonDto person;

    public ReservationUpdateDto(){

    }

    public ReservationUpdateDto(StatusType status, List<RoomsReservationDto> roomsReservation, PersonDto person) {
        this.status = status;
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public List<RoomsReservationDto> getRoomsReservation() {
        return roomsReservation;
    }

    public void setRoomsReservation(List<RoomsReservationDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
