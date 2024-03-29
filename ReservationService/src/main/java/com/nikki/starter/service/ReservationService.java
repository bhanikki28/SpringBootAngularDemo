package com.nikki.starter.service;

import com.nikki.starter.model.Reservation;
import reactor.core.publisher.Mono;

public interface ReservationService {
    Mono<Reservation> getReservation(String id);
    Mono<Reservation> createReservation(Mono<Reservation> reservation);
    Mono<Reservation> updateReservation(String id, Mono<Reservation> reservation);
    Mono<Boolean> deleteReservation(String id);
}
