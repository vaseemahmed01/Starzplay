package com.starzplay.json.content;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Content
{
  private int bitrate;

  public int getBitrate() { return this.bitrate; }

  public void setBitrate(int bitrate) { this.bitrate = bitrate; }

  private double duration;

  public double getDuration() { return this.duration; }

  public void setDuration(double duration) { this.duration = duration; }

  private String format;

  public String getFormat() { return this.format; }

  public void setFormat(String format) { this.format = format; }

  private int height;

  public int getHeight() { return this.height; }

  public void setHeight(int height) { this.height = height; }

  private String language;

  public String getLanguage() { return this.language; }

  public void setLanguage(String language) { this.language = language; }

  private int width;

  public int getWidth() { return this.width; }

  public void setWidth(int width) { this.width = width; }

  private String id;

  public String getId() { return this.id; }

  public void setId(String id) { this.id = id; }

  private String guid;

  public String getGuid() { return this.guid; }

  public void setGuid(String guid) { this.guid = guid; }

  private ArrayList<String> assetTypeIds;

  public ArrayList<String> getAssetTypeIds() { return this.assetTypeIds; }

  public void setAssetTypeIds(ArrayList<String> assetTypeIds) { this.assetTypeIds = assetTypeIds; 
  }
  private ArrayList<String> assetTypes;

  public ArrayList<String> getAssetTypes() { return this.assetTypes; }

  public void setAssetTypes(ArrayList<String> assetTypes) { this.assetTypes = assetTypes; }

  private String downloadUrl;

  public String getDownloadUrl() { return this.downloadUrl; }

  public void setDownloadUrl(String downloadUrl) { this.downloadUrl = downloadUrl; }

  private ArrayList<Release> releases;

  public ArrayList<Release> getReleases() { return this.releases; }

  public void setReleases(ArrayList<Release> releases) { this.releases = releases; }

  private String serverId;

  public String getServerId() { return this.serverId; }

  public void setServerId(String serverId) { this.serverId = serverId; }

  private String streamingUrl;

  public String getStreamingUrl() { return this.streamingUrl; }

  public void setStreamingUrl(String streamingUrl) { this.streamingUrl = streamingUrl; }

  private String protectionScheme;

  public String getProtectionScheme() { return this.protectionScheme; }

  public void setProtectionScheme(String protectionScheme) { this.protectionScheme = protectionScheme; }
}