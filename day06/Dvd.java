package com.trimindtech.training.day06;

public class Dvd {
    private String movieTitle;
    private double lengthOfMovie;
    MovieStatus movieStatus;

    public Dvd(String movieTitle, double lengthOfMovie) {
        this.movieTitle = movieTitle;
        this.lengthOfMovie = lengthOfMovie;
        this.movieStatus = MovieStatus.IN;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "movieTitle='" + movieTitle + '\'' +
                ", lengthOfMovie=" + lengthOfMovie +
                ", movieStatus=" + movieStatus +
                '}';
    }

    /*public String getMovieTitle() {
        return movieTitle;
    }*/
/*
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }*/

    /*public double getLengthOfMovie() {
        return lengthOfMovie;
    }*/

    /*public void setLengthOfMovie(double lengthOfMovie) {
        this.lengthOfMovie = lengthOfMovie;
    }
*//*
    public MovieStatus getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(MovieStatus movieStatus) {
        this.movieStatus = movieStatus;
    }*/

}

