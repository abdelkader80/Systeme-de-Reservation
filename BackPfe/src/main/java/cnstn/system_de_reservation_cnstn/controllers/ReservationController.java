package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Reservation;
import cnstn.system_de_reservation_cnstn.services.ReservationService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/Reservation")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/add")
    public Reservation create(@RequestBody Reservation reservation) {
        return reservationService.create(reservation);
    }

    @GetMapping("/all")
    public List<Reservation> afficher() {
        return reservationService.findAll();
    }
/*
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteReservation(@PathVariable Long id) {
        reservationService.deleteService(id);
        return ResponseEntity.noContent().build();
    }*/
    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }
}
