package com.zygimantus.thegamesdb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Data")
public class PlatformData {

    private String baseImgUrl;
    private PlatformPlatform platformPlatform;

    public String getBaseImgUrl() {
        return baseImgUrl;
    }

    @XmlElement(name = "baseImgUrl")
    public void setBaseImgUrl(String baseImgUrl) {
        this.baseImgUrl = baseImgUrl;
    }

    public PlatformPlatform getPlatformPlatform() {
        return platformPlatform;
    }

    @XmlElement(name = "Platform")
    public void setPlatformPlatform(PlatformPlatform platformPlatform) {
        this.platformPlatform = platformPlatform;
    }
}
