# Where are the java files?

You will be creating all the java files from scratch fort this project. We created this  folder to make it easier.

We suggest you create all the java files with simply the skeleton of the file. For example:

```java
public abstract class GameData {



}
``` 
saved as GameData.java

and

```java
public interface Attributes {


}
```
saved as Attributes.java

You  will notice that GameData  is  not declared as abstract. By creating all the skeletons, you can submit to the autograder - gaining the 1 point that everything compiles :) It is a small step, but one to think about.  Then when you work on each class, flush out the classes by  putting in method stubs, for example

```java
public abstract class GameData {

    // add a  note here on what you need to do. 
    protected Knight findKnight(String nameOrId, List<Knight> list) {
        return null;
    }
}
```

## TESTING

Remember you can have a ```main(String[] args)``` in every class (classes, not interfaces). We would *HIGHLY* recommend you test every class you write  adding a main in the class. For example:

```java
public class Knight extends MOB  {
    // your class code here

    public static void main(String[] args) {  /// this main is ungraded, and you  do  not have to remove before submission.  It will be ignored.
        Knight myTest =  new Knight(1, "Merlin", 50, 2, 1, DiceType.D12, 0);
        System.out.println("TESTING: " + myTest);
        // add other tests here to test each method individually

    }

}