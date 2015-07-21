package com.dragos.apps.RyuJisho.model;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Definition {

    @Expose
    private Meta meta;
    @Expose
    private List<Datum> data = new ArrayList<Datum>();

    /**
     * @return The meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * @param meta The meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * @return The data
     */
    public List<Datum> getData() {
        return data;
    }

    /**
     * @param data The data
     */
    public void setData(List<Datum> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Definition{" +
                "meta=" + meta +
                ", data=" + data +
                '}';
    }
}