package com.zygimantus.thegamesdb.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Images")
public class GameImages {

    private List<GameImageFanart> fanarts;
    private List<GameImage> boxarts;
    private List<GameImage> clearLogos;
    private List<GameImage> banners;
    private List<GameImageFanart> screenshots;

    public List<GameImageFanart> getFanarts() {
        return fanarts;
    }

    @XmlElement(name = "fanart")
    public void setFanarts(List<GameImageFanart> fanarts) {
        this.fanarts = fanarts;
    }

    @XmlElement(name = "boxart")
    public List<GameImage> getBoxarts() {
        return boxarts;
    }

    public void setBoxarts(List<GameImage> boxarts) {
        this.boxarts = boxarts;
    }

    @XmlElement(name = "clearlogo")
    public List<GameImage> getClearLogos() {
        return clearLogos;
    }

    public void setClearLogos(List<GameImage> clearLogos) {
        this.clearLogos = clearLogos;
    }

    @XmlElement(name = "banner")
    public List<GameImage> getBanners() {
        return banners;
    }

    public void setBanners(List<GameImage> banners) {
        this.banners = banners;
    }

    public List<GameImageFanart> getScreenshots() {
        return screenshots;
    }

    @XmlElement(name = "screenshot")
    public void setScreenshots(List<GameImageFanart> screenshots) {
        this.screenshots = screenshots;
    }
}
