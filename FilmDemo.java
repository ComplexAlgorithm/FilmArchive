/*
 * Finally, demonstrate a prototype of this program by allowing the user to create up to ten films
(an array of films). Provide the user with a menu of options to create a film, foreign film, or
Bollywood film. Once a film is created it should be stored so that it can be accessed
again. There should be an option to display all the information for all films entered so far. Use
the toString method to display the information for each film. After a user enters a film use the
equals method in the film class to make sure that film has not already been entered into the 
system. If it has tell the user that film already exists in the system and do not store it again. If it
has not been entered then insert it into the system. This prototype should be first developed
without the use of static methods. This will make the task of writing the prototype easier, but it
will be very redundant. After having a working prototype try to take the repetitive code and
place it into static methods in the prototype.
You may use any films to test your system, but make sure to include at least one film, one
foreign film, and one Bollywood film, and at least five films. If you are not familiar with films
or foreign films or Bollywood films a list is provided below so that you use these films to test
your program.
 */
import java.util.Scanner;
public class FilmDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Film [] filmArray = new Film [10];
		int option;
		int numberOfFilms = 0;
		
		do {
			System.out.println("Press 1 to make a film.");
			System.out.println("Press 2 to make a foreign film.");
			System.out.println("Press 3 to make a bollywood film.");
			System.out.println("Press 4 to view all the information for all the films.");
			System.out.println("Press 5 to end the program.");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if(option == 1) {
				Film currentFilm = new Film();
				System.out.println("Whats the name of the film?");
				String name = keyboard.nextLine();
				currentFilm.setFilmName(name);
				
				System.out.println("Whats the name of the director?");
				String director = keyboard.nextLine();
				currentFilm.setDirectorName(director);
				
				System.out.println("What year was the film released?");
				int year = keyboard.nextInt();
				keyboard.nextLine();
				currentFilm.setYearReleased(year);
				
				boolean alreadyUsed = false;
				if(numberOfFilms < filmArray.length) {
					int index = 0;
					while(alreadyUsed == false && index < numberOfFilms) {
						if(filmArray[index].equals(currentFilm)) {
							alreadyUsed = true;
						}
						index++;
					}
					if(!alreadyUsed) {
						filmArray[numberOfFilms] = currentFilm;
						numberOfFilms++;
					}
					else {
						System.out.println("This film has already been used!");
					}
				}
				else {	
					System.out.println("There is no more room for anymore films!");
				}
			}
			else if(option == 2) {
				ForeignFilm currentForeignFilm = new ForeignFilm();

				System.out.println("What is the name of the foreign film?");
				String name = keyboard.nextLine();
				currentForeignFilm.setFilmName(name);
				
				System.out.println("Whats the director of the foreign film?");
				String director = keyboard.nextLine();
				currentForeignFilm.setDirectorName(director);
				
				System.out.println("Whats the year the foreign film was made?");
				int year = keyboard.nextInt();
				keyboard.nextLine();
				currentForeignFilm.setYearReleased(year);
				
				System.out.println("Whats the native language of the film?");
				String nativeLanguage = keyboard.nextLine();
				currentForeignFilm.setNativeLanguage(nativeLanguage);
				
				System.out.println("Whats the translation of the film name in english?");
				String translation = keyboard.nextLine();
				currentForeignFilm.setTranslationOfFilmName(translation);
				
				System.out.println("How many subtitles does this film have?");
				int subtitles = keyboard.nextInt();
				keyboard.nextLine();
				ForeignFilm.setMaxSubtitles(subtitles);
				
				boolean alreadyUsed = false;
				if(numberOfFilms < filmArray.length) {
					int index = 0;
					while(alreadyUsed == false && index < numberOfFilms) {
						if(filmArray[index].equals(currentForeignFilm)) {
							alreadyUsed = true;
						}
						index++;
					}
					if(!alreadyUsed) {
						filmArray[numberOfFilms] = currentForeignFilm;
						numberOfFilms++;
					}
					else {
						System.out.println("This film has already been used!");
					}
				}
				else {
					System.out.println("There is no more room for any films!");
				}
				for(int i = 0; i < subtitles; i++) {
					System.out.println("Enter the next subtitle.");
					String nextSubtitle = keyboard.nextLine();
					if(currentForeignFilm.getNumberOfSubtitles() < ForeignFilm.getMaxSubtitles()) {
						currentForeignFilm.addSubtitles(nextSubtitle);
					}
				}	
			}
			else if(option == 3) {
				BollywoodFilm currentBollywoodFilm = new BollywoodFilm();
				
				System.out.println("What is the name of the film?");
					String name = keyboard.nextLine();
				System.out.println("Whats the director of the Bollywood film?");
					String director = keyboard.nextLine();
				System.out.println("Whats the year the Bollywood film was made?");
					int year = keyboard.nextInt();
					keyboard.nextLine();
				System.out.println("Whats the native language of the film?");
					String nativeLanguage = keyboard.nextLine();
				System.out.println("Whats the translation of the film name in english?");
					String translation = keyboard.nextLine();
				System.out.println("How many subtitles does this film have?");
					int subtitles = keyboard.nextInt();
					keyboard.nextLine();
					currentBollywoodFilm.setFilmName(name);
					currentBollywoodFilm.setDirectorName(director);
					currentBollywoodFilm.setYearReleased(year);
					currentBollywoodFilm.setNativeLanguage(nativeLanguage);
					currentBollywoodFilm.setTranslationOfFilmName(translation);
					BollywoodFilm.setMaxSubtitles(subtitles);
					
					boolean alreadyUsed = false;
					if(numberOfFilms < filmArray.length) {
						int index = 0;
						while(alreadyUsed == false && index < numberOfFilms) {
							if(filmArray[index].equals(currentBollywoodFilm)) {
								alreadyUsed = true;
							}
							index++;
						}
						if(!alreadyUsed) {
							filmArray[numberOfFilms] = currentBollywoodFilm;
							numberOfFilms++;
						}
						else {
							System.out.println("This film has already been used!");
						}
					}
					else {
						System.out.println("There is no more room for any films!");
					}
					for(int i = 0; i < subtitles; i++) {
						System.out.println("Enter the next subtitle.");
							String nextSubtitle = keyboard.nextLine();
						if(currentBollywoodFilm.getNumberOfSubtitles() < BollywoodFilm.getMaxSubtitles()) {
							currentBollywoodFilm.addSubtitles(nextSubtitle);
						}
					}
					System.out.println("How many secondary languages does this film have?");
						int secondaryLanguages = keyboard.nextInt();
						keyboard.nextLine();
					for(int i = 0; i < secondaryLanguages; i++) {
						System.out.println("Enter the next Secondary Language.");
							String nextLanguage = keyboard.nextLine();
						if(currentBollywoodFilm.getNumberOfSecondaryLanguages() < BollywoodFilm.getMaxSecondaryLanguages()) {
							currentBollywoodFilm.addSecondaryLanguage(nextLanguage);
						}
					}
					System.out.println("How many songs does this film have?");
						int songs = keyboard.nextInt();
						keyboard.nextLine();
					for(int i = 0; i < songs; i++) {
						System.out.println("Whats the next song?");
							String nextSong = keyboard.nextLine();
						if(currentBollywoodFilm.getNumberOfSongs() < BollywoodFilm.getMaxSongs()) {
							currentBollywoodFilm.addSongs(nextSong);
						}
					}
				
			}
			else if(option == 4) {
				for(int i = 0; i < numberOfFilms; i++) {
					System.out.println(filmArray[i].toString());
				}
				
			}
			else if(option == 5) {
				System.out.println("Goodbye! Thank you for using my program!");
			}
			else {
				System.out.println("Error! Pick a valid option!");
			}
			
			
		}while(option != 5);

	}

}
