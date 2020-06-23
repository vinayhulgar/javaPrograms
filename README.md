:orange_book: Marker Interface: It is an empty interface (no field or methods). Examples of marker interface are Serializable, Clonnable and Remote interface. All these interfaces are empty interfaces.

:pushpin: Clonable Interface: Cloneable interface is present in java.lang package. There is a method clone() in Object class. A class that implements the Cloneable interface indicates that it is legal for clone() method to make a field-for-field copy of instances of that class.
Invoking Object’s clone method on an instance of the class that does not implement the Cloneable interface results in an exception CloneNotSupportedException being thrown.</br>

:pushpin: Serializable interface : Serializable interface is present in java.io package. It is used to make an object eligible for saving its state into a file. This is called Serialization.

:pushpin: Clever Algorithm To Find Whether Or Not 2 Words Are Anagrams:
![Anagram](https://github.com/vinayhulgar/javaPrograms/blob/master/Anagram.jpg)
- sort each words characters alphabetically
- both ordered words are the same => anagrams

ear => aer
are => aer
