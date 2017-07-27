package com.starzplay.json.content;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Medium
{
  private String id;

  public String getId() { return this.id; }

  public void setId(String id) { this.id = id; }

  private String title;

  public String getTitle() { return this.title; }

  public void setTitle(String title) { this.title = title; }

  private String guid;

  public String getGuid() { return this.guid; }

  public void setGuid(String guid) { this.guid = guid; }

  private String ownerId;

  public String getOwnerId() { return this.ownerId; }

  public void setOwnerId(String ownerId) { this.ownerId = ownerId; }

  private Object availableDate;

  public Object getAvailableDate() { return this.availableDate; }

  public void setAvailableDate(Object availableDate) { this.availableDate = availableDate; }

  private Object expirationDate;

  public Object getExpirationDate() { return this.expirationDate; }

  public void setExpirationDate(Object expirationDate) { this.expirationDate = expirationDate; }

  private ArrayList<Object> ratings;

  public ArrayList<Object> getRatings() { return this.ratings; }

  public void setRatings(ArrayList<Object> ratings) { this.ratings = ratings; }

  private ArrayList<Content> content;

  public ArrayList<Content> getContent() { return this.content; }

  public void setContent(ArrayList<Content> content) { this.content = content; }

  private String restrictionId;

  public String getRestrictionId() { return this.restrictionId; }

  public void setRestrictionId(String restrictionId) { this.restrictionId = restrictionId; }

  private String availabilityState;

  public String getAvailabilityState() { return this.availabilityState; }

  public void setAvailabilityState(String availabilityState) { this.availabilityState = availabilityState; }
}
