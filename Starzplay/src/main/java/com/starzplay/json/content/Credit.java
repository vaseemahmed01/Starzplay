package com.starzplay.json.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Credit
{
  private String characterName;

  public String getCharacterName() { return this.characterName; }

  public void setCharacterName(String characterName) { this.characterName = characterName; }

  private String creditType;

  public String getCreditType() { return this.creditType; }

  public void setCreditType(String creditType) { this.creditType = creditType; }

  private boolean isInactive;

  public boolean getIsInactive() { return this.isInactive; }

  public void setIsInactive(boolean isInactive) { this.isInactive = isInactive; }

  private int order;

  public int getOrder() { return this.order; }

  public void setOrder(int order) { this.order = order; }

  private String personId;

  public String getPersonId() { return this.personId; }

  public void setPersonId(String personId) { this.personId = personId; }

  private String personName;

  public String getPersonName() { return this.personName; }

  public void setPersonName(String personName) { this.personName = personName; }
}