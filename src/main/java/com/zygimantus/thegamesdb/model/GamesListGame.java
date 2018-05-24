package com.zygimantus.thegamesdb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Game")
public class GamesListGame {

    private int id;
    private String gameTitle;
    private String rawReleaseDate;
    private String platform;
    private String thumb;

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "GameTitle")
    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    @XmlElement(name = "ReleaseDate")
    public String getRawReleaseDate() {
        return rawReleaseDate;
    }

    public void setRawReleaseDate(String rawReleaseDate) {
        this.rawReleaseDate = rawReleaseDate;
    }

    @XmlElement(name = "Platform")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @XmlElement(name = "thumb")
    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

}
