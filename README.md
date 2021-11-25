### Decorator pattern
Q) How can we change the behavior of an object in java ?
Answer :- We use inheritance or composition to extend the behavior of an object but 
this is done at compile time and its applicable to all the instances of the class. 
We can’t add any new functionality of remove any existing behavior at runtime – 
this is when Decorator pattern comes into picture.

Decorator pattern can add functionality to one object instead of all the instance of the class.


Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

The goal of this pattern is to add additional responsiblities to object dynamically.

Decorator class will wrap the original class and provide additional functionality.

This will implement open closed clause of SOLID principle.

example :- 
new BuggeredInputStream(new FileInputStream())

