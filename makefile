all: simple

Animal.class: ZooTest.class
	@javac -cp . Animal.java Bird.java Reptile.java Mammal.java Cat.java SnowLeopard.java Monkey.java toothedReptile.java toothlessReptile.java Alligator.java Tortoise.java flyingBird.java flightlessBird.java Penguin.java Parrot.java

ZooTest.class:
	javac ZooTest.java

simple: Animal.class 
	@echo Running instance of the ZooTest system...
	@java ZooTest

clean:
	rm -rf *.class

