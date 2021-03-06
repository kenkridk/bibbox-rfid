package rfid;

import java.util.ArrayList;

/**
 * TagListenerInterface.
 */
public interface TagListenerInterface {
	/**
	 * A tag has been detected.
	 * 
	 * @param bibTag
	 */
	public void tagDetected(BibTag bibTag);

	/**
	 * A tag has been removed.
	 * 
	 * @param bibTag
	 */
	public void tagRemoved(BibTag bibTag);
	
	/**
	 * Lists tags currently on device.
	 * 
	 * @param bibTags
	 */
	public void tagsDetected(ArrayList<BibTag> bibTags);
}
