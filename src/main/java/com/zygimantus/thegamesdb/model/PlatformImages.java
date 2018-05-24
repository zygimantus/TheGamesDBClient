package com.zygimantus.thegamesdb.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Images")
public class PlatformImages {

    private List<GameImageFanart> fanarts;
    private List<GameImage> boxarts;
    private List<GameImage> banners;
    private List<GameImage> consolearts;
    private List<GameImage> controllerarts;

    public List<GameImageFanart> getFanarts() {
        return fanarts;
    }

    @XmlElement(name = "fanart")
    public void setFanarts(List<GameImageFanart> fanarts) {
        this.fanarts = fanarts;
    }

    public List<GameImage> getBoxarts() {
        return boxarts;
    }

    @XmlElement(name = "boxart")
    public void setBoxarts(List<GameImage> boxarts) {
        this.boxarts = boxarts;
    }

    public List<GameImage> getBanners() {
        return banners;
    }

    @XmlElement(name = "banner")
    public void setBanners(List<GameImage> banners) {
        this.banners = banners;
    }

    public List<GameImage> getConsolearts() {
        return consolearts;
    }

    @XmlElement(name = "consoleart")
    public void setConsolearts(List<GameImage> consolearts) {
        this.consolearts = consolearts;
    }

    public List<GameImage> getControllerarts() {
        return controllerarts;
    }

    @XmlElement(name = "controllerart")
    public void setControllerarts(List<GameImage> controllerarts) {
        this.controllerarts = controllerarts;
    }
}
