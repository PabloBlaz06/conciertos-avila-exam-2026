package edu.iesam.concierto.domain;

public class DeleteConcertsUseCase {

    private ConcertRepository concertRepository;

    public DeleteConcertsUseCase(ConcertRepository concertRepository) {
        this.concertRepository = concertRepository;
    }

    public void execute(String concerts){
        concertRepository.delete(concerts);
    }


}
