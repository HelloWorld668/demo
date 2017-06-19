package com.demo.domain;

import com.google.gson.annotations.SerializedName;

public class Server {
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Server [serverCode=" + serverCode + ", serverName="
                + serverName + ", areaCode=" + areaCode + ", areaName="
                + areaName + ", serverIP=" + serverIP + ", serverPort="
                + serverPort + ", isOpen=" + isOpen + ", isNormally="
                + isNormally + ", isGetVersionNormally=" + isGetVersionNormally
                + "]";
    }
    @SerializedName("ServerCode")
    private Integer serverCode;
    @SerializedName("ServerName")
    private String serverName;
    @SerializedName("AreaCode")
    private Integer areaCode;
    @SerializedName("AreaName")
    private String areaName;
    @SerializedName("ServerIP")
    private String serverIP;
    @SerializedName("ServerPort")
    private Integer serverPort;
    @SerializedName("IsOpen")
    private String isOpen;
    @SerializedName("IsNormally")
    private String isNormally;
    @SerializedName("IsGetVersionNormally")
    private String isGetVersionNormally;

    public Integer getServerCode() {
        return serverCode;
    }

    public void setServerCode(Integer serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP == null ? null : serverIP.trim();
    }

    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public String getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(String isOpen) {
        this.isOpen = isOpen == null ? null : isOpen.trim();
    }

    public String getIsNormally() {
        return isNormally;
    }

    public void setIsNormally(String isNormally) {
        this.isNormally = isNormally == null ? null : isNormally.trim();
    }

    public String getIsGetVersionNormally() {
        return isGetVersionNormally;
    }

    public void setIsGetVersionNormally(String isGetVersionNormally) {
        this.isGetVersionNormally = isGetVersionNormally == null ? null : isGetVersionNormally.trim();
    }
}