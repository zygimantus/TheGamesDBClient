package com.zygimantus.thegamesdb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "fanart")
public class GameImageFanart extends GameImage {

    @XmlElement(name = "thumb")
    @Override
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @XmlElement(name = "original")
    public void setOriginal(GameImageFanartOriginal original) {
        url = original.getUrl();
        height = original.getWidth();
        width = original.getHeight();
    }

    @Override
    public void setUrl(String url) {
        if (!url.equals("\n")) {
            this.url = url;
        }
    }

    @Override
    public String getUrl() {
        return url;
    }

}
