package edu.iesam.concierto.domain;

import edu.iesam.concierto.mock.ConcertMockRepository;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SaveConcertsUseCaseTest {


    public SaveConcertsUseCase saveConcertsUseCase;
    public ConcertMockRepository concertMockRepository;

    @BeforeEach
    void setUp() {
        concertMockRepository = new ConcertMockRepository();
        saveConcertsUseCase = new SaveConcertsUseCase(concertMockRepository);
        Concert concert = new Concert("EV-2026-2205","La Pantera","A2",250);

        saveConcertsUseCase.execute(concert);

        assertEquals(1, concertMockRepository.countSaveMethod);
    }
}