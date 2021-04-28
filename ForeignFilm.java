/*
 *  *
The development of this project must be done using object-oriented programming. All films
should contain the name of the film, the name of the director, and the year of release. All foreign
films are films but also have the language the film is in, the subtitle information, and the
translation of the film name into English. Since a film can have subtitles in more than one
language an array should be used to hold this information. You can assume that no foreign film
will have more than 10 subtitles. This maximum number of subtitles should be represented as a
static variable since it is the same for all foreign films. There should be static methods to view
and to increase the maximum number of subtitles for all foreign films.

 */
public class ForeignFilm extends Film{
	//instance variables 
	private String [] subtitleInfo;
	private String nativeLanguage;
	private String translationOfNameInEnglish;
	private int numberOfSubtitles;
	
	private static int maxSubtitles = 10;
	
	//static methods
	public static void setMaxSubtitles(int newMaxSubtitles) {
		if(newMaxSubtitles > maxSubtitles) {
			maxSubtitles = newMaxSubtitles;
		}
	}
	public static int getMaxSubtitles() {
		return maxSubtitles;
	}
	//default constructor
	public ForeignFilm() {
		super();
		subtitleInfo = new String [maxSubtitles];
		nativeLanguage = "";
		translationOfNameInEnglish = "";
		numberOfSubtitles = 0;
	}
	//non-static methods
	public void setNativeLanguage(String newNativeLanguage) {
		nativeLanguage = newNativeLanguage;
	}
	public String getNativeLanguage() {
		return nativeLanguage;
	}
	public void setTranslationOfFilmName(String translationOfNameInEnglish) {
		this.translationOfNameInEnglish = translationOfNameInEnglish;
	}
	public String getTranslationOfFilmName() {
		return translationOfNameInEnglish;
	}
	public void addSubtitles(String newSubtitles) {
		if(numberOfSubtitles < subtitleInfo.length) {
			subtitleInfo[numberOfSubtitles] = newSubtitles;
			numberOfSubtitles++;
		}
	}
	public String getSubtitles() {
		String allSubtitles = "";
		for(int i = 0; i < numberOfSubtitles; i++) {
			allSubtitles = allSubtitles + " " + subtitleInfo[i];
		}
		return allSubtitles;
	}
	public int getNumberOfSubtitles() {
		return numberOfSubtitles;
	}
	
	public String toString() {
		return super.toString() + " Native Language: " + nativeLanguage + "\n" + " Translation Of Film Name In English: " 
				+ translationOfNameInEnglish + "\n" + " Languages film is subtitled in: " + getSubtitles();
		
	}

}
