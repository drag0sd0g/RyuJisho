package com.dragos.apps.RyuJisho.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Sense {

    @SerializedName("english_definitions")
    @Expose
    private List<String> englishDefinitions = new ArrayList<String>();
    @SerializedName("parts_of_speech")
    @Expose
    private List<String> partsOfSpeech = new ArrayList<String>();
    @Expose
    private List<Object> links = new ArrayList<Object>();
    @Expose
    private List<Object> tags = new ArrayList<Object>();
    @Expose
    private List<Object> restrictions = new ArrayList<Object>();
    @SerializedName("see_also")
    @Expose
    private List<Object> seeAlso = new ArrayList<Object>();
    @Expose
    private List<Object> antonyms = new ArrayList<Object>();
    @Expose
    private List<Object> source = new ArrayList<Object>();
    @Expose
    private List<Object> info = new ArrayList<Object>();

    /**
     * @return The englishDefinitions
     */
    public List<String> getEnglishDefinitions() {
        return englishDefinitions;
    }

    /**
     * @param englishDefinitions The english_definitions
     */
    public void setEnglishDefinitions(List<String> englishDefinitions) {
        this.englishDefinitions = englishDefinitions;
    }

    /**
     * @return The partsOfSpeech
     */
    public List<String> getPartsOfSpeech() {
        return partsOfSpeech;
    }

    /**
     * @param partsOfSpeech The parts_of_speech
     */
    public void setPartsOfSpeech(List<String> partsOfSpeech) {
        this.partsOfSpeech = partsOfSpeech;
    }

    /**
     * @return The links
     */
    public List<Object> getLinks() {
        return links;
    }

    /**
     * @param links The links
     */
    public void setLinks(List<Object> links) {
        this.links = links;
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
     * @return The restrictions
     */
    public List<Object> getRestrictions() {
        return restrictions;
    }

    /**
     * @param restrictions The restrictions
     */
    public void setRestrictions(List<Object> restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * @return The seeAlso
     */
    public List<Object> getSeeAlso() {
        return seeAlso;
    }

    /**
     * @param seeAlso The see_also
     */
    public void setSeeAlso(List<Object> seeAlso) {
        this.seeAlso = seeAlso;
    }

    /**
     * @return The antonyms
     */
    public List<Object> getAntonyms() {
        return antonyms;
    }

    /**
     * @param antonyms The antonyms
     */
    public void setAntonyms(List<Object> antonyms) {
        this.antonyms = antonyms;
    }

    /**
     * @return The source
     */
    public List<Object> getSource() {
        return source;
    }

    /**
     * @param source The source
     */
    public void setSource(List<Object> source) {
        this.source = source;
    }

    /**
     * @return The info
     */
    public List<Object> getInfo() {
        return info;
    }

    /**
     * @param info The info
     */
    public void setInfo(List<Object> info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Sense{" +
                "englishDefinitions=" + englishDefinitions +
                ", partsOfSpeech=" + partsOfSpeech +
                ", links=" + links +
                ", tags=" + tags +
                ", restrictions=" + restrictions +
                ", seeAlso=" + seeAlso +
                ", antonyms=" + antonyms +
                ", source=" + source +
                ", info=" + info +
                '}';
    }
}