# Homework 06

## Generics. Collections


## Task 01

The goal of this task is to explore the use of Java Generics by developing a Pair class that represents a 2-tuple. 

**Tuple** is a finite ordered sequence of elements. A 2-tuple contains two elements, a 3-tuple contains three elements, 
an n-tuple contains n elements.

A Pair class could be useful any time we need to store data that naturally occurs as an ordered pair: first and last name, 
two-dimensional coordinates, etc.

The challenge in designing this class is that we want to avoid specifying the element types in advance. 
The goal is to develop a single Pair class that may be used to store pairs of objects of any type.

### Object elements

One possible design involves programming the Pair class so that the types of the two elements are declared as `Object`. 

Since every reference type in Java inherits from `Object`, this approach will give us the flexibility we want.

Open the following two classes in IDE:

* [ObjectPair.java](src/main/java/com/softserveinc/task01/ObjectPair.java)
* [ObjectPairDriver.java](src/main/java/com/softserveinc/task01/ObjectPairDriver.java)

Take a few minutes to read the code, then complete the steps below.

1. The provided code compiles, but there is a __logic error__ in the main method that will probably cause the driver to crash 
when `largestStadium` is passed the stadiums array. **Find the problem and fix it.**
2. Complete the `largestStadium` method so that it conforms to the Javadoc comments. Test to make sure that it works as expected. 
(HINT: You will need to perform some casts when you retrieve the items from the tuple.)

### Generics

1. Create a copy of the `ObjectPair` class named `Pair`. Refactor this class to use **Java generics**. Your updated class should 
make it possible to independently specify the types of the first and second elements.
2. Create a copy of the `ObjectPairDriver` class named `PairDriver`. Refactor this driver so that it uses your `Pair` class. 
The functionality should be unchanged. **The resulting code should not include any cast operations.**

**BONUS QUESTION:** What happens if you re-introduce the problem that you fixed in step 1 from the previous section? 
Will the resulting code compile? Why do you think generic collection classes are sometimes called “type-safe” collections?

**BONUS QUESTION:** List some reasons that the Pair class might be preferable to the `ObjectPair` class. Can you think of 
any situations where the `ObjectPair` class might be preferable?

## Task 02

Write a java program that use a shopping list (see the class [ShoppingList](src/main/java/com/softserveinc/task02/ShoppingList.java))
 of products and performs the following operations: 
* add an item at a specified location
* delete an item in the list
* print the contents of the ArrayList

Note: class [ShoppingList](src/main/java/com/softserveinc/task02/ShoppingList.java) should have the private field named `items`
type of `ArrayList<String>`



