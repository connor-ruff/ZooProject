all: simple

Animal.class: zooDatabase.class
	@javac -cp . Animal.java Bird.java Reptile.java Mammal.java Cat.java SnowLeopard.java Monkey.java toothedReptile.java toothlessReptile.java Alligator.java Tortoise.java flyingBird.java flightlessBird.java Penguin.java Parrot.java

zooDatabase.class:
	javac zooDatabase.java

simple: Animal.class 
	@echo Running instance of the ZooTest system...
	@java zooDatabase

clean:
	rm -rf *.class

