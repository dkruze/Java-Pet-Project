> import java.util.*
> import java.io.*
> Make an abstract class with an integer array and a display value, as well as buffers for checking values
		> int display;
		> int buffer1
		> int buffer2
		> Integer[] data = {0, 1, 2};
	> Initialize constructor as AClass(int display) { display = 1; }
	> Method for displaying value
		> return display
	> Method for increasing value
		> int itemp = indexOf(data[])
		> itemp += 1
		> if itemp <= 2
			> return display
			> set buffer
		> else
			> return 0
			> reset buffer
	> Method for decreasing value
		> int dtemp = indexOf(data[])
		> dtemp -= 1
		> if dtemp >= 0
			> return display
		> else
			> return 0
> Make more specific classes that extend AClass
	> Sample:
			> String hungerStatus;
		> empty constructor Hunger()
	 	> Method for printing hunger status
	 		> If display == 0, status = hungry, etc.
> Make an abstract pet class 
		> String name
		> Scanner
		> variable to make sure the pet doesnt sleep too much
	> Constructor PClass(String name) { name = scruffles }
	> Get/Set for name
		> Feed method allows dog's hunger to increase
		> hunger.increment()
		> print dog.name + " is now " hunger.hungerStatus
		> if the hunger value is at max, a (stop feeding this thing!) message should be displayed. This goes for all these methods
	> Pet method allows dog's attention to increase
		> This method and the one that follows are in the above pattern
	> Walk method allows dog's fatigue to increase
	> Name method allows user to change name of dog
		> Display dog.name (default scruffles)
		> Ask for new string for name
		> Set that as name
		> If not string, prompt again
		> Get name, print it
	> Sleep method allows dog's fatigue to increase to 2 and hunger to decrease to 0
		> if sleep variable is false
			> reset all attributes to 0
			> print "Sleep tight, " + dog.name + "!"
			> print "Rise and shine, " + dog.name + ", time for breakfast!"
		> otherwise warn the user not to keep sleeping
> Make a specific Dog class
	> Instances of specific attributes are attributes of this class
	> Constructor Dog()
	> Serialize in constructor
	> main method creates Pet dog = new Pet(), calls the menu method
	> Tugowar method allows dog's fatigue and hunger to decrease, and attention to increase
		> print dog.name " loves tug-o-war, but could use a snack and a nap after all that effort!"
	> Playdate method allows fatigue to decrease and attention to decrease to 0 (same way as above)
		> print "Go have fun, " + dog.name + "!"
		> print "Welcome back, " + dog.name + ", did you miss me?"
	> Save method to save dog
	> Load method to view dog
	> Menu method that prints all of this out
		
			
	
	
