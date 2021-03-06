package com.zygimantus.thegamesdb.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Game")
public class GameGame extends Game {

    private String overview;
    private String esrb;
    private List<GameGenre> genres;
    private String players;
    private String coop;
    private String youtube;
    private String publisher;
    private String developer;
    private double rating;
    private GameImages gameImages;

    @XmlElement(name = "Overview")
    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    @XmlElement(name = "ESRB")
    public String getEsrb() {
        return esrb;
    }

    public void setEsrb(String esrb) {
        this.esrb = esrb;
    }

    @XmlElement(name = "Genres")
    public List<GameGenre> getGenres() {
        return genres;
    }

    public void setGenres(List<GameGenre> genres) {
        this.genres = genres;
    }

    @XmlElement(name = "Players")
    public String getPlayers() {
        return players;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    @XmlElement(name = "Co-op")
    public String getCoop() {
        return coop;
    }

    public void setCoop(String coop) {
        this.coop = coop;
    }

    @XmlElement(name = "Youtube")
    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    @XmlElement(name = "Publisher")
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @XmlElement(name = "Developer")
    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    @XmlElement(name = "Rating")
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @XmlElement(name = "Images")
    public GameImages getGameImages() {
        return gameImages;
    }

    public void setGameImages(GameImages gameImages) {
        this.gameImages = gameImages;
    }
}
