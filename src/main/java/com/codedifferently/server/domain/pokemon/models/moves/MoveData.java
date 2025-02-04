package com.codedifferently.server.domain.pokemon.models.moves;

public class MoveData {

    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "MoveData{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
