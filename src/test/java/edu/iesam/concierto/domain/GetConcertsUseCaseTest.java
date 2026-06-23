package edu.iesam.concierto.domain;

import edu.iesam.concierto.mock.ConcertMockRepository;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GetConcertsUseCaseTest {

    public GetConcertsUseCase getConcertsUseCase;
    public ConcertMockRepository concertMockRepository;

    @BeforeEach
    void setUp() {
        concertMockRepository = new ConcertMockRepository();
        getConcertsUseCase = new GetConcertsUseCase(concertMockRepository);

        List<Concert> concert = getConcertsUseCase.execute();

        assertEquals(2, concert.size());
        assertEquals("EV-2026-2205", concert.get(0).getId());
    }
}