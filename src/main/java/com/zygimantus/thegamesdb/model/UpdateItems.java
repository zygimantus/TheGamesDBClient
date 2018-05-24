package com.zygimantus.thegamesdb.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Items")
public class UpdateItems {

    private int time;
    private List<Integer> games;

    public int getTime() {
        return time;
    }

    @XmlElement(name = "Time")
    public void setTime(int time) {
        this.time = time;
    }

    public List<Integer> getGames() {
        return games;
    }

    @XmlElement(name = "Game")
    public void setGames(List<Integer> games) {
        this.games = games;
    }
}
