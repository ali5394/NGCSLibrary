package com.nextgenerationcreativesoft_ngcs.ngcslibraryy;

public class NGCS {

    private String teamName;
    private String teamWorkName;
    private String teamAddress;


    public NGCS() {
    }

    public NGCS(String teamName, String teamWorkName, String teamAddress) {
        this.teamName = teamName;
        this.teamWorkName = teamWorkName;
        this.teamAddress = teamAddress;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamWorkName() {
        return teamWorkName;
    }

    public void setTeamWorkName(String teamWorkName) {
        this.teamWorkName = teamWorkName;
    }

    public String getTeamAddress() {
        return teamAddress;
    }

    public void setTeamAddress(String teamAddress) {
        this.teamAddress = teamAddress;
    }
}
