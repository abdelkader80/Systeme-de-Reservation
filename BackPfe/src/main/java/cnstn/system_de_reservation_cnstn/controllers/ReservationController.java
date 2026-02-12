package cnstn.system_de_reservation_cnstn.controllers;
import cnstn.system_de_reservation_cnstn.models.Reservation;
import cnstn.system_de_reservation_cnstn.services.ReservationService;
import org.springframework.web.bind.annotation.*;


import java.util.List;
// Import de List

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
}
