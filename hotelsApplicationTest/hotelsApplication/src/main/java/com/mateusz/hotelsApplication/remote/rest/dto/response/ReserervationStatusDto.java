package com.mateusz.hotelsApplication.remote.rest.dto.response;

import com.mateusz.hotelsApplication.domain.model.StatusType;
import com.mateusz.hotelsApplication.remote.rest.dto.request.PersonDto;
import com.mateusz.hotelsApplication.remote.rest.dto.request.RoomsReservationDto;

import java.util.List;

public class ReserervationStatusDto {
    private Integer id;
    private StatusType status;
    private List<RoomsReservationDto> roomsReservation;
    private PersonDto person;

    public ReserervationStatusDto(){

    }

    public ReserervationStatusDto(Integer id, StatusType status, List<RoomsReservationDto> roomsReservation, PersonDto person) {
        this.id = id;
        this.status = status;
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
