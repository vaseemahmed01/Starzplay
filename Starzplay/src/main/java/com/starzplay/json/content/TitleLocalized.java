package com.starzplay.json.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class TitleLocalized
{
  private String ar;

  public String getAr() { return this.ar; }

  public void setAr(String ar) { this.ar = ar; }

  private String en;

  public String getEn() { return this.en; }

  public void setEn(String en) { this.en = en; }
}