package edu.iesam.concierto.data;

import edu.iesam.concierto.domain.Concert;

import java.util.ArrayList;
import java.util.Objects;

public class ConcertsMemLocalDataSource {

    private static ConcertsMemLocalDataSource instance = null;

    private ArrayList<Concert> storage = new ArrayList<>();




    public static ConcertsMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new ConcertsMemLocalDataSource();
        }
        return instance;
    }

    public ArrayList<Concert> getConcerts() {
        return new ArrayList<>(storage);
    }

    public void save(Concert concert) {
        storage.add(concert);
    }
/*
    public void delete(String concert) {
        storage.removeIf(concert ->
                Objects.equals(concert.getId(), concert)
        );
    }*/
}
