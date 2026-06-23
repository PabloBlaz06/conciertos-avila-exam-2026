package edu.iesam.concierto.mock;

import edu.iesam.concierto.domain.Concert;
import edu.iesam.concierto.domain.ConcertRepository;

import java.util.ArrayList;
import java.util.List;

public class ConcertMockRepository implements ConcertRepository {
    public int countSaveMethod;

    @Override
    public List<Concert> getConcerts() {
        List<Concert> concert = new ArrayList<>();
        concert.add(new Concert("EV-2026-2205","La Pantera","A2",250));
        concert.add(new Concert("EV-2026-1408","Bad Bunny","A1",5000));
        return List.of();
    }

    @Override
    public void save(Concert concert) {
        countSaveMethod++;
    }

    @Override
    public void delete(String concert) {

    }
}
