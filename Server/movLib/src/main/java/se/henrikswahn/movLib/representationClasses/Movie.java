package se.henrikswahn.movLib.representationClasses;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by henrik on 15/06/15.
 */
public class Movie {

    @NotNull
    @JsonProperty
    private String name;

    @NotNull
    @JsonProperty
    private String regi;

    @NotNull
    @JsonProperty
    private String actor;

    @NotNull
    @JsonProperty
    private float length;

    @NotNull
    @JsonProperty
    private String desc;

    public Movie(String name, String regi, String actor, float length, String desc) {
        this.name = name;
        this.regi = regi;
        this.actor = actor;
        this.length = length;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegi() {
        return regi;
    }

    public void setRegi(String regi) {
        this.regi = regi;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;

        Movie that = (Movie) o;

        if (!getName().equals(that.getName())) return false;

        return true;
    }
}
