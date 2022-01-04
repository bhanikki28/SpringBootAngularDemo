package com.nikki.starter.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Document
public class Reservation {
    private Long roomNo;
    @DateTimeFormat( iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkIn;
    @DateTimeFormat( iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkOut;
    private Integer price;

    public Reservation(Long roomNo, LocalDate checkIn, LocalDate checkOut, Integer price) {
        this.roomNo = roomNo;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.price = price;
    }

    @Id
    private String id;

    public Long getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Long roomNo) {
        this.roomNo = roomNo;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public Reservation() {
    }
}
