# FilmArchive
Stores information about films, foreign films, and bollywood films.

You are the software developer put in charge of helping an online streaming website to
categorize its film collection. The company already has an existing collection of American
films, but it wants to branch out into foreign films. While the company plans to have foreign
films from many countries it plans to especially expand into Bollywood films. These films are
from India and are primarily in Hindi, but they sometimes also have other secondary languages
that are spoken in the films. Most Bollywood films are also musicals.
Once you take a look at their software you realize that they have not used object-oriented
programming. The software they have is very difficult to reuse and update. You decide that you
will have to create a new design for the software and start completely from scratch.
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
Finally, demonstrate a prototype of this program by allowing the user to create up to ten films
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
Film
Name of Film: Falling Down
Name of Director(s): Joel Schumacher
Year of Release: 1993
Foreign Film
Name: Densha Otoko
Name of Director(s): Shosuke Murakami
Year of Release: 2005
Language: Japanese
Subtitle Information: English
Translation: Train Man
Bollywood Film
Name of Film: Veer-Zaara
Name of Director(s): Yash Chopra
Year of Release: 2004
Language: Hindi
Secondary Language (if any): Urdu, Punjabi
Subtitle Information: English, Arabic, Tamil, Telugu
Translation: Veer-Zaara
Songs:
1) "Tere Liye"
2) "Main Yahan Hoon"
3) "Aisa Des Hai Mera"
4) "Yeh Hum Aa Gaye Hain Kahan"
5) "Do Pal"
6) "Kyon Hawa"
7) "Hum To Bhai Jaise"
8) "Aaya Tere Dar Par"
9) "Lodi"
10) "Tum Paas Aa Raahein Ho"
11) "Jaane Kyon"
Bollywood Film
Name of Film: Pyaasa
Name of Director(s): Guru Dutt
Year of Release: 1957
Language: Hindi
Secondary Language (if any): none
Subtitle Information: English
Translation: Thirsty
Songs:
1) "Aaj Sajan Mohe Ang Lagalo"
2) "Ham Aapki Aankhon Me"
3) "Jaane Kya Tune Kahi"
4) "Jane Woh Kaise Log"
5) "Sar Jo Tera Chakraye"
6) "Yeh Duniya Agar Mil Bhi Jaaye Toh Kya Hai"
7) "Ye Hanste Huye Phool"
8) "Jinhen Naaz Hai Hind Par"
9) "Tang Aa Chuke Hain Kashm-e-Kashe Zindagi Se"
Bollywood Film
Name of Film: 3 Idiots
Name of Director(s): Rajkumar Hirani
Year of Release: 2009
Language: Hindi
Secondary Language (if any): Urdu, English
Subtitle Information: English, French, Spanish
Translation: 3 Idiots
Songs:
1) "Aal Izz Well"
2) "Zoobi Doobi"
3) "Behti Hawa Sa Tha Woh"
4) "Give Me Some Sunshine"
5) "Jaane Nahin Denge Tujhe"
6) "Zoobi Doobi - Remix"
7) "Aal Izz Well - Remix"
