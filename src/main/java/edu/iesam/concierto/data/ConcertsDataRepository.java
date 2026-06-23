package edu.iesam.concierto.data;

import edu.iesam.concierto.domain.Concert;
import edu.iesam.concierto.domain.ConcertRepository;

import java.util.List;

public class ConcertsDataRepository implements ConcertRepository {

    private final ConcertsMemLocalDataSource concertsMemLocalDataSource;

    public ConcertsDataRepository(ConcertsMemLocalDataSource concertsMemLocalDataSource) {
        this.concertsMemLocalDataSource = concertsMemLocalDataSource;
    }

    @Override
    public List<Concert> getConcerts() {
        return concertsMemLocalDataSource.getConcerts();
    }
}
