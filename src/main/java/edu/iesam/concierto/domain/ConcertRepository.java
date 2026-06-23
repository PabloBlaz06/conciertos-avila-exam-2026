package edu.iesam.concierto.domain;

import java.util.List;

public interface ConcertRepository {
    List<Concert> getConcerts();
    void save(Concert concert);


    //public static void delete(String concert);

}
