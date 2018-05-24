package com.zygimantus.thegamesdb.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Data")
public class GamesListData {

    private List<GamesListGame> gamesListGames;

    @XmlElement(name = "Game")
    public List<GamesListGame> getGamesListGames() {
        if (null == gamesListGames) {
            gamesListGames = new ArrayList<>();
        }
        return gamesListGames;
    }

    public void setGamesListGames(List<GamesListGame> gamesListGames) {
        this.gamesListGames = gamesListGames;
    }

}
