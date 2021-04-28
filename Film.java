/*
 *
The development of this project must be done using object-oriented programming. All films
should contain the name of the film, the name of the director, and the year of release. All foreign
films are films but also have the language the film is in, the subtitle information, and the
translation of the film name into English. Since a film can have subtitles in more than one
language an array should be used to hold this information. You can assume that no foreign film
will have more than 10 subtitles. This maximum number of subtitles should be represented as a
static variable since it is the same for all foreign films. There should be static methods to view
and to increase the maximum number of subtitles for all foreign films. Bollywood films are
foreign films that have songs and may have secondary languages as well. Since there can be
more than one song or secondary language an array should be used for each. You can assume
that no Bollywood film will have more than 20 songs. There should be static methods to view
and to increase the maximum number of songs for all Bollywood films. You can assume that no
Bollywood film has more than 5 secondary languages. There should be static methods to view
and to increase the maximum number of songs. There should be non-static methods to access
and mutate all the information stored as instance variables. Inheritance must be used to
accomplish this assignment. There should be a parent class for films and a class which inherits
from that class and represents foreign films and class that represents Bollywood films which
inherits from foreign films.
In addition to the requirements above, each film class must override the toString method
inherited from the Object class or its parent class. The overridden definition of each toString
method should return all the information stored about that specific film. The parent class for
films must also override the equals method inherited from the Object class. This method should
determine whether two films are the same. Two films should be considered the same film if they
have the same name, the same director, and were released in the same year. If these three are the
same it should return true otherwise return false.
 
 */
public class Film extends Object {
	//instance variables
	private String filmName;
	private String directorName;
	private int yearReleased;

	public Film() {
		super(); //calls the default constructor of parent class (object)
		filmName = "";
		directorName = "";
		yearReleased = 0;
		
	}
	//non-static methods
	public void setFilmName(String newFilmName) {
		filmName = newFilmName;
		
	}
	public String getFilmName() {
		return filmName;
	}
	public void setDirectorName(String newDirectorName) {
		directorName = newDirectorName;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setYearReleased(int newYearReleased) {
		if(yearReleased >= 0) {
			yearReleased = newYearReleased;
		}
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public String toString() {
		return " Film Name: " + filmName + " Director Name: " + directorName + " Year Released: " + yearReleased;
	}
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false;
		if(otherObject != null && otherObject instanceof Film) {
			Film otherFilm = (Film)otherObject;
			if(this.filmName.equals(otherFilm.filmName) && this.directorName.equals(otherFilm.directorName)
					&& this.yearReleased == otherFilm.yearReleased) {
				areTheyEqual = true;
			}
		}
		return areTheyEqual;
	}

}
