package edu.iesam.concierto.domain;

import java.util.List;

public class SaveConcertsUseCase{

    private ConcertRepository concertRepository;

    public SaveConcertsUseCase(ConcertRepository concertRepository) {
        this.concertRepository = concertRepository;
    }

    public void execute(Concert concert) {
        concertRepository.save(concert);
    }
}
