package com.mateusz.hotelsApplication.remote.rest.dto.response;

import java.util.List;

public class ReservationsDto {
    private List<ReserervationStatusDto> reservations;

    public ReservationsDto() {

    }

    public ReservationsDto(List<ReserervationStatusDto> reservations) {
        this.reservations = reservations;
    }

    public List<ReserervationStatusDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReserervationStatusDto> reservations) {
        this.reservations = reservations;
    }
}
