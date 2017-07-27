package com.starzplay.json.content;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Thumb614x1536
{
  private String url;

  public String getUrl() { return this.url; }

  public void setUrl(String url) { this.url = url; }

  private int width;

  public int getWidth() { return this.width; }

  public void setWidth(int width) { this.width = width; }

  private int height;

  public int getHeight() { return this.height; }

  public void setHeight(int height) { this.height = height; }

  private String title;

  public String getTitle() { return this.title; }

  public void setTitle(String title) { this.title = title; }

  private ArrayList<String> assetTypes;

  public ArrayList<String> getAssetTypes() { return this.assetTypes; }

  public void setAssetTypes(ArrayList<String> assetTypes) { this.assetTypes = assetTypes; }
}
