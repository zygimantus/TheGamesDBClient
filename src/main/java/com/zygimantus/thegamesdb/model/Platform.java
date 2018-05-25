package com.zygimantus.thegamesdb.model;

import javax.xml.bind.annotation.XmlElement;

public abstract class Platform {

    private int id;

    public int getId() {
        return id;
    }

    @XmlElement(name = "id")
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public final int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Platform)) {
            return false;
        }
        Platform other = (Platform) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

}
