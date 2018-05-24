package com.zygimantus.thegamesdb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Data")
public class GameArtData {

    private String baseImgUrl;
    private GameImages images;

    public String getBaseImgUrl() {
        return baseImgUrl;
    }

    @XmlElement(name = "baseImgUrl")
    public void setBaseImgUrl(String baseImgUrl) {
        this.baseImgUrl = baseImgUrl;
    }

    public GameImages getImages() {
        return images;
    }

    @XmlElement(name = "Images")
    public void setImages(GameImages images) {
        this.images = images;
    }
}
