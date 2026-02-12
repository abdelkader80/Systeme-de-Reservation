package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Direction;
import cnstn.system_de_reservation_cnstn.repository.DirectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DirectionService {
    private final DirectionRepository directionRepository;

    public Direction createDirection(Direction direction) {
        return directionRepository.save(direction);
    }


    public List<Direction> findAll() {
        return directionRepository.findAll();
    }


}


