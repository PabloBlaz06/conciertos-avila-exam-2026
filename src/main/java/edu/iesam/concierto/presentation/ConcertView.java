package edu.iesam.concierto.presentation;

import edu.iesam.concierto.data.ConcertsDataRepository;
import edu.iesam.concierto.data.ConcertsMemLocalDataSource;
import edu.iesam.concierto.domain.Concert;
import edu.iesam.concierto.domain.DeleteConcertsUseCase;
import edu.iesam.concierto.domain.GetConcertsUseCase;
import edu.iesam.concierto.domain.SaveConcertsUseCase;

import java.util.ArrayList;
import java.util.List;

public class ConcertView {


    public static void function1(){
        printConcerts();
    }

    public static void function2(){
        printConcerts();
        saveConcerts();
        printConcerts();
    }

    public static void function3(){
        printConcerts();
        deleteConcerts("EV-2026-0451");
        printConcerts();
    }
    public static void printConcerts(){
        GetConcertsUseCase getConcertsUseCase = new GetConcertsUseCase(
                new ConcertsDataRepository(ConcertsMemLocalDataSource.newInstance()));

        List<Concert> concert = getConcertsUseCase.execute();
        System.out.println(concert);
    }

    public static void saveConcerts() {
        Concert newConcert = new Concert("EV-2026-0451", "MD5-002", "A1", 250);

        SaveConcertsUseCase saveConcertsUseCase = new SaveConcertsUseCase(
                new ConcertsDataRepository(ConcertsMemLocalDataSource.newInstance()));


        saveConcertsUseCase.execute(newConcert);
    }

    public static void deleteConcerts(String concertsId) {
        DeleteConcertsUseCase deleteConcertsUseCase = new DeleteConcertsUseCase(
                new ConcertsDataRepository(ConcertsMemLocalDataSource.newInstance()));

        deleteConcertsUseCase.execute(concertsId);
    }
}
