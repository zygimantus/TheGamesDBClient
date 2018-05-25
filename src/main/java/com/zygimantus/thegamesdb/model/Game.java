package com.zygimantus.thegamesdb.model;

import javax.xml.bind.annotation.XmlElement;

public abstract class Game {

    private int id;
    private String gameTitle;
    private String rawReleaseDate;
    private String platform;

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

    @Override
    public final int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Game))
            return false;
        Game other = (Game) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
