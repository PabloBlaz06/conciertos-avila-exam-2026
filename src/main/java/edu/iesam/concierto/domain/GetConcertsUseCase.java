package edu.iesam.concierto.domain;

import java.util.List;

public class GetConcertsUseCase {

    private final ConcertRepository concertRepository;

    public GetConcertsUseCase(ConcertRepository concertRepository) {
        this.concertRepository = concertRepository;
    }

    public List<Concert> execute() {
        return concertRepository.getConcerts();
    }
}
