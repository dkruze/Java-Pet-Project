Dog.class: Dog.java Friend.class
	javac -g Dog.java

Friend.class: Friend.java Hunger.class Fatigue.class Attention.class
	javac -g Friend.java

Hunger.class: Hunger.java Attribute.class
	javac -g Hunger.java

Fatigue.class: Fatigue.java Attribute.class
	javac -g Fatigue.java

Attention.class: Attention.java Attribute.class
	javac -g Attention.java

Attribute.class: Attribute.java
	javac -g Attribute.java

clean:
	rm *.class

run: Dog.class
	java Dog

debug: Dog.class
	jdb Dog