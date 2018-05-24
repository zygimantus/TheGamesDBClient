package com.zygimantus.thegamesdb.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Platforms")
public class PlatformListPlatforms {

    private List<PlatformListPlatform> listOfPlatforms;

    public List<PlatformListPlatform> getListOfPlatforms() {
        return listOfPlatforms;
    }

    @XmlElement(name = "Platform")
    public void setListOfPlatforms(List<PlatformListPlatform> listOfPlatforms) {
        this.listOfPlatforms = listOfPlatforms;
    }
}
