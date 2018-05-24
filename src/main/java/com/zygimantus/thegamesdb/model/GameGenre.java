package com.zygimantus.thegamesdb.model;

import javax.xml.bind.annotation.XmlElement;

public class GameGenre {

    private String genre;

    @XmlElement(name = "genre")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
