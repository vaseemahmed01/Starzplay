package com.starzplay.json.content;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class RootObject
{		
  @JsonProperty("$xmlns")
  private Xmlns xmlns;

  public Xmlns getXmlns() { return this.xmlns; }

  public void setXmlns(Xmlns xmlns) { this.xmlns = xmlns; }

  private int startIndex;

  public int getStartIndex() { return this.startIndex; }

  public void setStartIndex(int startIndex) { this.startIndex = startIndex; }

  private int itemsPerPage;

  public int getItemsPerPage() { return this.itemsPerPage; }

  public void setItemsPerPage(int itemsPerPage) { this.itemsPerPage = itemsPerPage; }

  private int entryCount;

  public int getEntryCount() { return this.entryCount; }

  public void setEntryCount(int entryCount) { this.entryCount = entryCount; }

  private String title;

  public String getTitle() { return this.title; }

  public void setTitle(String title) { this.title = title; }

  private ArrayList<Entry> entries;

  public ArrayList<Entry> getEntries() { return this.entries; }

  public void setEntries(ArrayList<Entry> entries) { this.entries = entries; }
}
