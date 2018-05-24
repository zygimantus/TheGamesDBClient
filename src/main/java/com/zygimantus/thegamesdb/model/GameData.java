package com.zygimantus.thegamesdb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Data")
public class GameData {

    private String baseImgUrl;
    private GameGame game;

    @XmlElement(name = "baseImgUrl")
    public String getBaseImgUrl() {
        return baseImgUrl;
    }

    public void setBaseImgUrl(String baseImgUrl) {
        this.baseImgUrl = baseImgUrl;
    }

    @XmlElement(name = "Game")
    public GameGame getGame() {
        return game;
    }

    public void setGame(GameGame game) {
        this.game = game;
    }
}
