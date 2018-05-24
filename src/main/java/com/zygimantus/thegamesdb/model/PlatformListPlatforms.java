package com.zygimantus.thegamesdb.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Platforms")
public class PlatformListPlatforms {

    private List<PlatformListPlatform> platformListPlatforms;

    public List<PlatformListPlatform> getPlatformListPlatforms() {
        return platformListPlatforms;
    }

    @XmlElement(name = "Platform")
    public void setPlatformListPlatforms(List<PlatformListPlatform> platformListPlatforms) {
        this.platformListPlatforms = platformListPlatforms;
    }
}
