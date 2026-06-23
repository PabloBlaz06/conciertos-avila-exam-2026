package edu.iesam.concierto.domain;

public class Concert {
    private String id;
    private String artist;
    private String recinto;
    private int aforo;


    public Concert(String id, String artist, String recinto, int aforo) {
        this.id = id;
        this.artist = artist;
        this.recinto = recinto;
        this.aforo = aforo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRecinto() {
        return recinto;
    }

    public void setRecinto(String recinto) {
        this.recinto = recinto;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
}


