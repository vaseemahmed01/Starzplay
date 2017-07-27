package com.starzplay.json.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Tag
{
  private String scheme;

  public String getScheme() { return this.scheme; }

  public void setScheme(String scheme) { this.scheme = scheme; }

  private String title;

  public String getTitle() { return this.title; }

  public void setTitle(String title) { this.title = title; }
}
