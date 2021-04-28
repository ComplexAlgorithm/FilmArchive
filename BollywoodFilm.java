/*
 Bollywood films are foreign films that have songs and may have secondary languages as well. 
 Since there can be more than one song or secondary language an array should be used for each. 
 You can assume that no Bollywood film will have more than 20 songs. There should be static methods to view
and to increase the maximum number of songs for all Bollywood films. You can assume that no
Bollywood film has more than 5 secondary languages. There should be static methods to view
and to increase the maximum number of languages. There should be non-static methods to access
and mutate all the information stored as instance variables. Inheritance must be used to
accomplish this assignment. There should be a parent class for films and a class which inherits
from that class and represents foreign films and class that represents Bollywood films which
inherits from foreign films.
In addition to the requirements above, each film class must override the toString method
inherited from the Object class or its parent class. The overridden definition of each toString
method should return all the information stored about that specific film.
 */
public class BollywoodFilm extends ForeignFilm {
	//instance variables
	private String [] songArray;
	private String [] secondaryLanguageArray;
	private int numberOfSongs;
	private int numberOfSecondaryLanguages;
	
	//static variables
	private static int maxSongs = 20;
	private static int maxSecondaryLanguages = 5;
	
	//static methods
	public static void setMaxSongs(int newMaxSongs) {
		if(newMaxSongs > maxSongs) {
			maxSongs = newMaxSongs;
		}
	}
	public static int getMaxSongs() {
		return maxSongs;
	}
	public static void setMaxSecondaryLanguages(int newMaxSecondaryLanguages) {
		if(newMaxSecondaryLanguages > maxSecondaryLanguages) {
			maxSecondaryLanguages = newMaxSecondaryLanguages;
		}
	}
	public static int getMaxSecondaryLanguages() {
		return maxSecondaryLanguages;
	}
	//default constructor
	public BollywoodFilm() {
		super();
		songArray = new String [maxSongs];
		secondaryLanguageArray = new String [maxSecondaryLanguages];
		numberOfSongs = 0;
		numberOfSecondaryLanguages = 0;
	}
	//non-static methods
	public void addSecondaryLanguage(String newSecondaryLanguage) {
		if(numberOfSecondaryLanguages < secondaryLanguageArray.length) {
			secondaryLanguageArray[numberOfSecondaryLanguages] = newSecondaryLanguage;
			numberOfSecondaryLanguages++;
		}
	}
	public String getSecondaryLanguages() {
		String allLanguages = "";
		for(int i = 0; i < numberOfSecondaryLanguages; i++) {
			allLanguages = allLanguages + " " + secondaryLanguageArray[i];
		}
		return allLanguages;
	}
	public void addSongs(String newSongs) {
		if(numberOfSongs < songArray.length) {
			songArray[numberOfSongs] = newSongs;
			numberOfSongs++;
		}
	}
	public String getSongs() {
		String allSongs = "";
		for(int i = 0; i < numberOfSongs; i++) {
			allSongs = allSongs + " " + songArray[i];
		}
		return allSongs;
	}
	public int getNumberOfSecondaryLanguages() {
		return numberOfSecondaryLanguages;
	}
	public int getNumberOfSongs() {
		return numberOfSongs;
	}
	
	
	public String toString() {
		return super.toString() + " Secondary Languages: " + getSecondaryLanguages() + "\n" + " Songs: " + getSongs();
	}

}
