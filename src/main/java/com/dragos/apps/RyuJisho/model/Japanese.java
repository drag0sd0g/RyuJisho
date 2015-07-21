package com.dragos.apps.RyuJisho.model;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Japanese {

    @Expose
    private String word;
    @Expose
    private String reading;

    /**
     * @return The word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word The word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return The reading
     */
    public String getReading() {
        return reading;
    }

    /**
     * @param reading The reading
     */
    public void setReading(String reading) {
        this.reading = reading;
    }

    @Override
    public String toString() {
        return "Japanese{" +
                "word='" + word + '\'' +
                ", reading='" + reading + '\'' +
                '}';
    }
}