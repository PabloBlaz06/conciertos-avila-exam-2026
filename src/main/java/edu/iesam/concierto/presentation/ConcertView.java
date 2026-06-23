package edu.iesam.concierto.presentation;

import edu.iesam.concierto.data.ConcertsDataRepository;
import edu.iesam.concierto.data.ConcertsMemLocalDataSource;
import edu.iesam.concierto.domain.Concert;
import edu.iesam.concierto.domain.GetConcertsUseCase;

import java.util.ArrayList;
import java.util.List;

public class ConcertView {

    public static void printConcerts(){
        GetConcertsUseCase getConcertsUseCase = new GetConcertsUseCase(
                new ConcertsDataRepository(ConcertsMemLocalDataSource.newInstance()));

        List<Concert> concert = getConcertsUseCase.execute();
        System.out.println(concert);
    }
}
