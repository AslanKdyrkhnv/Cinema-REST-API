package com.example.Cinema.Entities;

public class Cinema {
    public Cinema() {

    }
    private int id;
    private String cinemaName;
    private String date;
    private String genre;

    public Cinema(int id, String cinemaName, String date, String genre) {
        this.id = id;
        this.cinemaName = cinemaName;
        this.date = date;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", cinemaName='" + cinemaName + '\'' +
                ", date='" + date + '\'' +
                ", genre=" + genre +
                '}';
    }
}
