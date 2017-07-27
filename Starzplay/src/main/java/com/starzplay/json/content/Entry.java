package com.starzplay.json.content;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Entry
{
  private String id;

  public String getId() { return this.id; }

  public void setId(String id) { this.id = id; }

  private String guid;

  public String getGuid() { return this.guid; }

  public void setGuid(String guid) { this.guid = guid; }

  private Object updated;

  public Object getUpdated() { return this.updated; }

  public void setUpdated(Object updated) { this.updated = updated; }

  private String title;

  public String getTitle() { return this.title; }

  public void setTitle(String title) { this.title = title; }

  private Object description;

  public Object getDescription() { return this.description; }

  public void setDescription(Object description) { this.description = description; }

  private Object added;

  public Object getAdded() { return this.added; }

  public void setAdded(Object added) { this.added = added; }

  private boolean approved;

  public boolean getApproved() { return this.approved; }

  public void setApproved(boolean approved) { this.approved = approved; }

  private ArrayList<Credit> credits;

  public ArrayList<Credit> getCredits() { return this.credits; }

  public void setCredits(ArrayList<Credit> credits) { this.credits = credits; }

  private DescriptionLocalized descriptionLocalized;

  public DescriptionLocalized getDescriptionLocalized() { return this.descriptionLocalized; }

  public void setDescriptionLocalized(DescriptionLocalized descriptionLocalized) { this.descriptionLocalized = descriptionLocalized; }

  private Object displayGenre;

  public Object getDisplayGenre() { return this.displayGenre; }

  public void setDisplayGenre(Object displayGenre) { this.displayGenre = displayGenre; }

  private Object editorialRating;

  public Object getEditorialRating() { return this.editorialRating; }

  public void setEditorialRating(Object editorialRating) { this.editorialRating = editorialRating; }

  private ArrayList<ImageMediaId> imageMediaIds;

  public ArrayList<ImageMediaId> getImageMediaIds() { return this.imageMediaIds; }

  public void setImageMediaIds(ArrayList<ImageMediaId> imageMediaIds) { this.imageMediaIds = imageMediaIds; }

  private Object isAdult;

  public Object getIsAdult() { return this.isAdult; }

  public void setIsAdult(Object isAdult) { this.isAdult = isAdult; }

  private ArrayList<String> languages;

  public ArrayList<String> getLanguages() { return this.languages; }

  public void setLanguages(ArrayList<String> languages) { this.languages = languages; }

  private String longDescription;

  public String getLongDescription() { return this.longDescription; }

  public void setLongDescription(String longDescription) { this.longDescription = longDescription; }

  private LongDescriptionLocalized longDescriptionLocalized;

  public LongDescriptionLocalized getLongDescriptionLocalized() { return this.longDescriptionLocalized; }

  public void setLongDescriptionLocalized(LongDescriptionLocalized longDescriptionLocalized) { this.longDescriptionLocalized = longDescriptionLocalized; }

  private String programType;

  public String getProgramType() { return this.programType; }

  public void setProgramType(String programType) { this.programType = programType; }

  private ArrayList<Object> ratings;

  public ArrayList<Object> getRatings() { return this.ratings; }

  public void setRatings(ArrayList<Object> ratings) { this.ratings = ratings; }

  private Object seriesEpisodeNumber;

  public Object getSeriesEpisodeNumber() { return this.seriesEpisodeNumber; }

  public void setSeriesEpisodeNumber(Object seriesEpisodeNumber) { this.seriesEpisodeNumber = seriesEpisodeNumber; }

  private Object seriesId;

  public Object getSeriesId() { return this.seriesId; }

  public void setSeriesId(Object seriesId) { this.seriesId = seriesId; }

  private String shortDescription;

  public String getShortDescription() { return this.shortDescription; }

  public void setShortDescription(String shortDescription) { this.shortDescription = shortDescription; }

  private ShortDescriptionLocalized shortDescriptionLocalized;

  public ShortDescriptionLocalized getShortDescriptionLocalized() { return this.shortDescriptionLocalized; }

  public void setShortDescriptionLocalized(ShortDescriptionLocalized shortDescriptionLocalized) { this.shortDescriptionLocalized = shortDescriptionLocalized; }

  private ArrayList<String> tagIds;

  public ArrayList<String> getTagIds() { return this.tagIds; }

  public void setTagIds(ArrayList<String> tagIds) { this.tagIds = tagIds; }

  private ArrayList<Tag> tags;

  public ArrayList<Tag> getTags() { return this.tags; }

  public void setTags(ArrayList<Tag> tags) { this.tags = tags; }

  private Thumbnails thumbnails;

  public Thumbnails getThumbnails() { return this.thumbnails; }

  public void setThumbnails(Thumbnails thumbnails) { this.thumbnails = thumbnails; }

  private TitleLocalized titleLocalized;

  public TitleLocalized getTitleLocalized() { return this.titleLocalized; }

  public void setTitleLocalized(TitleLocalized titleLocalized) { this.titleLocalized = titleLocalized; }

  private Object tvSeasonEpisodeNumber;

  public Object getTvSeasonEpisodeNumber() { return this.tvSeasonEpisodeNumber; }

  public void setTvSeasonEpisodeNumber(Object tvSeasonEpisodeNumber) { this.tvSeasonEpisodeNumber = tvSeasonEpisodeNumber; }

  private Object tvSeasonId;

  public Object getTvSeasonId() { return this.tvSeasonId; }

  public void setTvSeasonId(Object tvSeasonId) { this.tvSeasonId = tvSeasonId; }

  private Object tvSeasonNumber;

  public Object getTvSeasonNumber() { return this.tvSeasonNumber; }

  public void setTvSeasonNumber(Object tvSeasonNumber) { this.tvSeasonNumber = tvSeasonNumber; }

  private int year;

  public int getYear() { return this.year; }

  public void setYear(int year) { this.year = year; }

  private ArrayList<Medium> media;

  public ArrayList<Medium> getMedia() { return this.media; }

  public void setMedia(ArrayList<Medium> media) { this.media = media; }

  @JsonProperty("peg$ExclusiveFrench")
  private String pegExclusiveFrench;

  public String getPegExclusiveFrench() { return this.pegExclusiveFrench; }

  public void setPegExclusiveFrench(String pegExclusiveFrench) { this.pegExclusiveFrench = pegExclusiveFrench; }

  @JsonProperty("peg$arAgeRating")
  private int pegarAgeRating;

  public int getPegArAgeRating() { return this.pegarAgeRating; }

  public void setPegArAgeRating(int pegarAgeRating) { this.pegarAgeRating = pegarAgeRating; }

  @JsonProperty("peg$arContentRating")
  private String pegarContentRating;

  public String getPegArContentRating() { return this.pegarContentRating; }

  public void setPegArContentRating(String pegarContentRating) { this.pegarContentRating = pegarContentRating; }

  @JsonProperty("peg$availableInSection")
  private String pegavailableInSection;

  public String getPegAvailableInSection() { return this.pegavailableInSection; }

  public void setPegAvailableInSection(String pegavailableInSection) { this.pegavailableInSection = pegavailableInSection; }

  @JsonProperty("peg$contentClassification")
  private String pegcontentClassification;

  public String getPegContentClassification() { return this.pegcontentClassification; }

  public void setPegContentClassification(String pegcontentClassification) { this.pegcontentClassification = pegcontentClassification; }

  @JsonProperty("peg$contractName")
  private String pegcontractName;

  public String getPegContractName() { return this.pegcontractName; }

  public void setPegContractName(String pegcontractName) { this.pegcontractName = pegcontractName; }

  @JsonProperty("peg$countryOfOrigin")
  private String pegcountryOfOrigin;

  public String getPegCountryOfOrigin() { return this.pegcountryOfOrigin; }

  public void setPegCountryOfOrigin(String pegcountryOfOrigin) { this.pegcountryOfOrigin = pegcountryOfOrigin; }

  @JsonProperty("peg$priorityLevel")
  private String pegpriorityLevel;

  public String getPegPriorityLevel() { return this.pegpriorityLevel; }

  public void setPegPriorityLevel(String pegpriorityLevel) { this.pegpriorityLevel = pegpriorityLevel; }

  @JsonProperty("peg$priorityLevelActionandAdventure")
  private String pegpriorityLevelActionandAdventure;

  public String getPegPriorityLevelActionandAdventure() { return this.pegpriorityLevelActionandAdventure; }

  public void setPegPriorityLevelActionandAdventure(String pegpriorityLevelActionandAdventure) { this.pegpriorityLevelActionandAdventure = pegpriorityLevelActionandAdventure; }

  @JsonProperty("peg$priorityLevelArabic")
  private String pegpriorityLevelArabic;

  public String getPegPriorityLevelArabic() { return this.pegpriorityLevelArabic; }

  public void setPegPriorityLevelArabic(String pegpriorityLevelArabic) { this.pegpriorityLevelArabic = pegpriorityLevelArabic; }

  @JsonProperty("peg$priorityLevelChildrenandFamily")
  private String pegpriorityLevelChildrenandFamily;

  public String getPegPriorityLevelChildrenandFamily() { return this.pegpriorityLevelChildrenandFamily; }

  public void setPegPriorityLevelChildrenandFamily(String pegpriorityLevelChildrenandFamily) { this.pegpriorityLevelChildrenandFamily = pegpriorityLevelChildrenandFamily; }

  @JsonProperty("peg$priorityLevelComedy")
  private String pegpriorityLevelComedy;

  public String getPegPriorityLevelComedy() { return this.pegpriorityLevelComedy; }

  public void setPegPriorityLevelComedy(String pegpriorityLevelComedy) { this.pegpriorityLevelComedy = pegpriorityLevelComedy; }

  @JsonProperty("peg$priorityLevelDisney")
  private String pegpriorityLevelDisney;

  public String getPegPriorityLevelDisney() { return this.pegpriorityLevelDisney; }

  public void setPegPriorityLevelDisney(String pegpriorityLevelDisney) { this.pegpriorityLevelDisney = pegpriorityLevelDisney; }

  @JsonProperty("peg$priorityLevelDisneyKids")
  private String pegpriorityLevelDisneyKids;

  public String getPegPriorityLevelDisneyKids() { return this.pegpriorityLevelDisneyKids; }

  public void setPegPriorityLevelDisneyKids(String pegpriorityLevelDisneyKids) { this.pegpriorityLevelDisneyKids = pegpriorityLevelDisneyKids; }

  @JsonProperty("peg$priorityLevelDrama")
  private String pegpriorityLevelDrama;

  public String getPegPriorityLevelDrama() { return this.pegpriorityLevelDrama; }

  public void setPegPriorityLevelDrama(String pegpriorityLevelDrama) { this.pegpriorityLevelDrama = pegpriorityLevelDrama; }

  @JsonProperty("peg$priorityLevelKids")
  private String pegpriorityLevelKids;

  public String getPegPriorityLevelKids() { return this.pegpriorityLevelKids; }

  public void setPegPriorityLevelKids(String pegpriorityLevelKids) { this.pegpriorityLevelKids = pegpriorityLevelKids; }

  @JsonProperty("peg$priorityLevelKidsAction")
  private String pegpriorityLevelKidsAction;

  public String getPegPriorityLevelKidsAction() { return this.pegpriorityLevelKidsAction; }

  public void setPegPriorityLevelKidsAction(String pegpriorityLevelKidsAction) { this.pegpriorityLevelKidsAction = pegpriorityLevelKidsAction; }

  @JsonProperty("peg$priorityLevelKidsFunandAdventure")
  private String pegpriorityLevelKidsFunandAdventure;

  public String getPegPriorityLevelKidsFunandAdventure() { return this.pegpriorityLevelKidsFunandAdventure; }

  public void setPegPriorityLevelKidsFunandAdventure(String pegpriorityLevelKidsFunandAdventure) { this.pegpriorityLevelKidsFunandAdventure = pegpriorityLevelKidsFunandAdventure; }

  @JsonProperty("peg$priorityLevelKidsMagicandDreams")
  private String pegpriorityLevelKidsMagicandDreams;

  public String getPegPriorityLevelKidsMagicandDreams() { return this.pegpriorityLevelKidsMagicandDreams; }

  public void setPegPriorityLevelKidsMagicandDreams(String pegpriorityLevelKidsMagicandDreams) { this.pegpriorityLevelKidsMagicandDreams = pegpriorityLevelKidsMagicandDreams; }

  @JsonProperty("peg$priorityLevelKidsPreschool")
  private String pegpriorityLevelKidsPreschool;

  public String getPegPriorityLevelKidsPreschool() { return this.pegpriorityLevelKidsPreschool; }

  public void setPegPriorityLevelKidsPreschool(String pegpriorityLevelKidsPreschool) { this.pegpriorityLevelKidsPreschool = pegpriorityLevelKidsPreschool; }

  @JsonProperty("peg$priorityLevelRomance")
  private String pegpriorityLevelRomance;

  public String getPegPriorityLevelRomance() { return this.pegpriorityLevelRomance; }

  public void setPegPriorityLevelRomance(String pegpriorityLevelRomance) { this.pegpriorityLevelRomance = pegpriorityLevelRomance; }

  @JsonProperty("peg$priorityLevelThriller")
  private String pegpriorityLevelThriller;

  public String getPegPriorityLevelThriller() { return this.pegpriorityLevelThriller; }

  public void setPegPriorityLevelThriller(String pegpriorityLevelThriller) { this.pegpriorityLevelThriller = pegpriorityLevelThriller; }

  @JsonProperty("peg$productCode")
  private String pegproductCode;

  public String getPegProductCode() { return this.pegproductCode; }

  public void setPegProductCode(String pegproductCode) { this.pegproductCode = pegproductCode; }

  @JsonProperty("peg$programMediaAvailability")
  private String pegprogramMediaAvailability;

  public String getPegProgramMediaAvailability() { return this.pegprogramMediaAvailability; }

  public void setPegProgramMediaAvailability(String pegprogramMediaAvailability) { this.pegprogramMediaAvailability = pegprogramMediaAvailability; }

  @JsonProperty("peg$testDefaultValue")
  private String pegtestDefaultValue;

  public String getPegTestDefaultValue() { return this.pegtestDefaultValue; }

  public void setPegTestDefaultValue(String pegtestDefaultValue) { this.pegtestDefaultValue = pegtestDefaultValue; }

  @JsonProperty("peg$ISOcountryOfOrigin")
  private String pegISOcountryOfOrigin;

  public String getPegISOcountryOfOrigin() { return this.pegISOcountryOfOrigin; }

  public void setPegISOcountryOfOrigin(String pegISOcountryOfOrigin) { this.pegISOcountryOfOrigin = pegISOcountryOfOrigin; }
}