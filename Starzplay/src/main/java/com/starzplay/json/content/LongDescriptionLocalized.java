package com.starzplay.json.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class LongDescriptionLocalized
{
  private String ar;

  public String getAr() { return this.ar; }

  public void setAr(String ar) { this.ar = ar; }
}
