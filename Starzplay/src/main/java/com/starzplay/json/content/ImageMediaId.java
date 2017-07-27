package com.starzplay.json.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ImageMediaId
{
  private String mediaId;

  public String getMediaId() { return this.mediaId; }

  public void setMediaId(String mediaId) { this.mediaId = mediaId; }

  private boolean isPrimary;

  public boolean getIsPrimary() { return this.isPrimary; }

  public void setIsPrimary(boolean isPrimary) { this.isPrimary = isPrimary; }

  private String imageType;

  public String getImageType() { return this.imageType; }

  public void setImageType(String imageType) { this.imageType = imageType; }
}
