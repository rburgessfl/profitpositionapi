package net.profitposition.api.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AtrValues {
    private String atr;

    public String getAtr() { return atr; }
    public void setAtr(String value) { this.atr = value; }
}