package com.zygimantus.thegamesdb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Data")
public class PlatformListData {

    private String basePlatformUrl;
    private PlatformListPlatforms platforms;

    public String getBasePlatformUrl() {
        return basePlatformUrl;
    }

    @XmlElement(name = "basePlatformUrl")
    public void setBasePlatformUrl(String basePlatformUrl) {
        this.basePlatformUrl = basePlatformUrl;
    }

    public PlatformListPlatforms getPlatforms() {
        return platforms;
    }

    @XmlElement(name = "Platforms")
    public void setPlatforms(PlatformListPlatforms platforms) {
        this.platforms = platforms;
    }
}
