package com.starzplay.json.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Release
{
  private String pid;

  public String getPid() { return this.pid; }

  public void setPid(String pid) { this.pid = pid; }

  private String url;

  public String getUrl() { return this.url; }

  public void setUrl(String url) { this.url = url; }

  private String restrictionId;

  public String getRestrictionId() { return this.restrictionId; }

  public void setRestrictionId(String restrictionId) { this.restrictionId = restrictionId; }
}
