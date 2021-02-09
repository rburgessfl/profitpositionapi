package net.profitposition.api.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BbandsValues {

    private String upper_band;
    private String middle_band;
    private String lower_band;

    public String getupper_band() { return upper_band; }
    public void setupper_band(String value) { this.upper_band = value; }

    public String getmiddle_band() { return middle_band; }
    public void setmiddle_band(String value) { this.middle_band = value; }

    public String getlower_band() { return lower_band; }
    public void setlower_band(String value) { this.lower_band = value; }
}
