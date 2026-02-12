package cnstn.system_de_reservation_cnstn.services;
// Définition du package service

import cnstn.system_de_reservation_cnstn.models.Reservation;
// Import de l’entité Reservation

import cnstn.system_de_reservation_cnstn.repository.ReservationRepository;
// Import du repository Reservation

import lombok.RequiredArgsConstructor;
// Lombok : génère automatiquement le constructeur avec les attributs final

import org.springframework.stereotype.Service;
// Indique que cette classe est un service Spring

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public Reservation create(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }
}
