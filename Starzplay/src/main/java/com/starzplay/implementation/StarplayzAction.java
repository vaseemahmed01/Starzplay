package com.starzplay.implementation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.starzplay.StarzplayLoadJsonFactory;
import com.starzplay.json.content.Entry;
import com.starzplay.json.content.Medium;
import com.starzplay.json.content.RootObject;
import com.starzplay.utility.AppConstant;

@Service
public class StarplayzAction {

	@Autowired
	StarzplayLoadJsonFactory starzplayLoadJsonFactory;

	public RootObject getStarplazMediaContent(String level) {
		// TODO Auto-generated method stub

		RootObject rootObject = starzplayLoadJsonFactory.getStarzplayEntiry();

		ArrayList<Entry> entries = rootObject.getEntries();
		ArrayList<Entry> tempEntries = new ArrayList<Entry>();

		String tempContClassifiction = "";

		if (entries != null && entries.size() > 0) {
			rootObject.setEntries(null);

			for (Entry entry : entries) {
				Entry sourceEntry = entry;
				System.out.println("entryTemp--IDDD-->" + sourceEntry.getId());
				System.out.println("entryTemp---->" + sourceEntry.getPegContentClassification());

				if (sourceEntry.getPegContentClassification() != null) {
					tempContClassifiction = sourceEntry.getPegContentClassification();
				}

				if ((level != null && level.equalsIgnoreCase(AppConstant.CONT_lEVEL_C)) && (tempContClassifiction != null
						&& tempContClassifiction.equalsIgnoreCase(AppConstant.CONT_CLASSIFICATION_C))) {
					/*
					 * If Level =='censored' and Classification == 'Censored'
					 * Return Remove Uncensored media
					 */
					tempEntries.add(getMediaContent(sourceEntry, level, tempContClassifiction));
					
				} else if ((level != null && level == AppConstant.CONT_lEVEL_U) && (tempContClassifiction != null
						&& tempContClassifiction.equalsIgnoreCase(AppConstant.CONT_CLASSIFICATION_C))) {
					/*
					 * If Level =='uncensored' and Classification == 'Censored'
					 * Return - Remove censored media
					 */
					tempEntries.add(getMediaContent(sourceEntry, level, tempContClassifiction));
				}else{
					/*
					 * in all cases no change required into filter
					 */
					tempEntries.add(sourceEntry);
				}
				
				

			}
			if (tempEntries != null && tempEntries.size() > 0) {
				rootObject.setEntries(tempEntries);
				tempEntries = null;
			}
		}

		starzplayLoadJsonFactory.setStarzplayEntiry(rootObject);
		System.out.println(starzplayLoadJsonFactory.getStarzplayEntiry());
		return starzplayLoadJsonFactory.getStarzplayEntiry();
	}

	/*
	 * Used to get the media content
	 */
	private Entry getMediaContent(Entry entry, String level, String contClassification) {

		ArrayList<Entry> tempEntries = new ArrayList<Entry>();
		ArrayList<Medium> tempMedia = new ArrayList<Medium>();

		ArrayList<Medium> media = entry.getMedia();
		entry.setMedia(null);

		if (media != null && media.size() > 0) {

			for (Medium medium : media) {

				char tempLastChar = medium.getGuid().charAt(medium.getGuid().length() - 1);

				if (level.equalsIgnoreCase(AppConstant.CONT_lEVEL_C)
						&& contClassification.equalsIgnoreCase(AppConstant.CONT_CLASSIFICATION_C)) {
					if (tempLastChar == 'C') {
						tempMedia.add(medium);
					}

				} else if (level.equalsIgnoreCase(AppConstant.CONT_lEVEL_U)
						&& contClassification.equalsIgnoreCase(AppConstant.CONT_CLASSIFICATION_C)) {
					if (tempLastChar != 'C') {
						tempMedia.add(medium);
					}
				}
			}

			entry.setMedia(tempMedia);
			tempMedia = new ArrayList<Medium>();
		}
		//tempEntries.add(entry);
		return entry;
	}

}
