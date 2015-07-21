package com.dragos.apps.RyuJisho.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Datum {

    @SerializedName("is_common")
    @Expose
    private Boolean isCommon;
    @Expose
    private List<Object> tags = new ArrayList<Object>();
    @Expose
    private List<Japanese> japanese = new ArrayList<Japanese>();
    @Expose
    private List<Sense> senses = new ArrayList<Sense>();

    /**
     * @return The isCommon
     */
    public Boolean getIsCommon() {
        return isCommon;
    }

    /**
     * @param isCommon The is_common
     */
    public void setIsCommon(Boolean isCommon) {
        this.isCommon = isCommon;
    }

    /**
     * @return The tags
     */
    public List<Object> getTags() {
        return tags;
    }

    /**
     * @param tags The tags
     */
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    /**
     * @return The japanese
     */
    public List<Japanese> getJapanese() {
        return japanese;
    }

    /**
     * @param japanese The japanese
     */
    public void setJapanese(List<Japanese> japanese) {
        this.japanese = japanese;
    }

    /**
     * @return The senses
     */
    public List<Sense> getSenses() {
        return senses;
    }

    /**
     * @param senses The senses
     */
    public void setSenses(List<Sense> senses) {
        this.senses = senses;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "isCommon=" + isCommon +
                ", tags=" + tags +
                ", japanese=" + japanese +
                ", senses=" + senses +
                '}';
    }
}