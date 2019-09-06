package com.shangma.cn.entity;

public class TGameuser {
    @Override
    public String toString() {
        return "TGameuser{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", gameAddress=" + gameAddress +
                ", gameJob=" + gameJob +
                ", gameRace=" + gameRace +
                ", gameRating=" + gameRating +
                ", gameCamp=" + gameCamp +
                ", gameJobName='" + gameJobName + '\'' +
                ", gameRaceName='" + gameRaceName + '\'' +
                ", gameAddressName='" + gameAddressName + '\'' +
                ", gameCampName='" + gameCampName + '\'' +
                '}';
    }

    private Integer gameId;

    private String gameName;

    private Integer gameAddress;

    private Integer gameJob;

    private Integer gameRace;

    private Integer gameRating;

    private Integer gameCamp;

    private String gameJobName;

    public String getGameRaceName() {
        return gameRaceName;
    }

    public void setGameRaceName(String gameRaceName) {
        this.gameRaceName = gameRaceName;
    }

    private String gameRaceName;

    private  String gameAddressName;

    private String gameCampName;

    public String getGameJobName() {
        return gameJobName;
    }

    public void setGameJobName(String gameJobName) {
        this.gameJobName = gameJobName;
    }



    public String getGameAddressName() {
        return gameAddressName;
    }

    public void setGameAddressName(String gameAddressName) {
        this.gameAddressName = gameAddressName;
    }

    public String getGameCampName() {
        return gameCampName;
    }

    public void setGameCampName(String gameCampName) {
        this.gameCampName = gameCampName;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
    }

    public Integer getGameAddress() {
        return gameAddress;
    }

    public void setGameAddress(Integer gameAddress) {
        this.gameAddress = gameAddress;
    }

    public Integer getGameJob() {
        return gameJob;
    }

    public void setGameJob(Integer gameJob) {
        this.gameJob = gameJob;
    }

    public Integer getGameRace() {
        return gameRace;
    }

    public void setGameRace(Integer gameRace) {
        this.gameRace = gameRace;
    }

    public Integer getGameRating() {
        return gameRating;
    }

    public void setGameRating(Integer gameRating) {
        this.gameRating = gameRating;
    }

    public Integer getGameCamp() {
        return gameCamp;
    }

    public void setGameCamp(Integer gameCamp) {
        this.gameCamp = gameCamp;
    }
}