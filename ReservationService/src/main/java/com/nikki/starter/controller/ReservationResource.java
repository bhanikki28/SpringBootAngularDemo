package com.nikki.starter.controller;

import com.nikki.starter.model.Reservation;
import com.nikki.starter.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(ReservationResource.ROOM_V_1_RESERVATION)
@CrossOrigin()
public class ReservationResource {
    public static final String ROOM_V_1_RESERVATION = "/room/v1/reservation/";

    private final ReservationService reservationService;

    @Autowired
    public ReservationResource(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping(path ="{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Reservation> getReservationById(@PathVariable String id){
        return reservationService.getReservation(id);
    }

    @PostMapping(path="", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Reservation> createReservation(@RequestBody Mono<Reservation> reservation) {

        return  reservationService.createReservation(reservation);
    }

    @PutMapping(path="{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Reservation> updateReservation(@PathVariable String id, @RequestBody Mono<Reservation> reservation) {
        return  reservationService.updateReservation(id, reservation);
    }

    @DeleteMapping(path="{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Boolean> deleteReservation(@PathVariable String id) {
        return reservationService.deleteReservation(id);

    }

}
