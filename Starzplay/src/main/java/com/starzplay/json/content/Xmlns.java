package com.starzplay.json.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Xmlns
{
  private String peg;

  public String getPeg() { return this.peg; }

  public void setPeg(String peg) { this.peg = peg; }
}