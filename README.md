#  Practical Project Option: Knights of Legend

> This project is *large*. However, if you take it in steps, you find it  is very doable,
> as long as  you start right away, and take breaks! Students have informed us
> that while this project is daunting, sticking with it and completing it was
> one of the most rewarding experiences across their semester for them. The
> sense of  accomplishment after the struggle. So remember,  take it in small 
> steps, test frequently, and build from there! 


Round Table Games recently hired you  as an intern, and they would like a revamp of their inaugural
game, Knight Fight, with a new version **Knights of Legend**. While they have hired
a [software architect](https://medium.com/@nvashanin/the-path-to-becoming-a-software-architect-de53f1cb310a) 
to design the layout of the game, your job is to implement it in its entirety as text based adventure game.  

The software architect has provided you with the following resources:

* [Knight Fight - UML Diagram](uml.md) 
* [Knight Fight - Java Documentation](https://www.cs.colostate.edu/~cs163/javadoc/practical/knightfight/allclasses-index.html)

You should familiarize yourself with the UML. Anything in the UML specification is viable for testing/grading. Not all private variables and methods are listed, but some are to help you out. (+ == public, # == protected). You will need to have
private variables, and feel free to implement as many private helper methods as you need (we had many). Once you familiarize yourself with the UML, you should use the java documentation as a guideline of what to write for each method. 


## Required Features To Implement

1. File Reading and Saving  
   Program data should be stored in CSV files, that will be read at the launch of the program. There
   should also be the feature to save the current progress of the knights. There are both
   default files, and the ability to pass in files via the command line. 
2. Knights  
   Knights gain experience defeating monsters, and there can only be four active knights on a quest at a time. 
3. Fortunes / Bonus Cards  
   Before knights start a quest, a random fortune is assigned to them. This fortune provides bonuses or even
   minuses if the fortune is bad. 
4. MOBS / Monsters  
   Knights will have random encounters with 1-4 monsters (depending on the number of active knights).
5. Team Management  
   When not on a quest, players should be able to view information on each knight, and manage their
   active knight pool. Knights never "die", they are just defeated and return to the normal pool.
6. Text-based game  
   For now, the entire game is text based to the System console (System.out / System.in), however, it must
   be done in a way that can easily be replaced. 

The above is just for the general picture, and sometimes what clients actually give us developers to work with! 
This is much easier to see by looking through the javadoc. 

## Sample Output

The following code is sample output from the game running, so you can get an idea of 
what your finished product looks like.

```text
Round Table Games: Knights of Legend
loading...

What would you like to do? help
Unsure what to do, here are some options:
	ls or list all  - listing the knights
	list active  - list the active knights knights only
	show name or id - show the knight details card
	set active name or id - set knight as active (note: only 4 knights can be active)
	remove active name or id - remove a knight from active status (heals knight)
	explore or adventure or quest - find random monsters to fight
	save filename - save the game to the file name (default: saveData.csv)
	exit or goodbye - to leave the game

Game rules: You can have four active knights. As long as they are active, they won't heal, but they can gain XP by going on adventures.
When you make a knight inactive, they will heal. How many monsters can you defeat before, you have to heal?

What would you like to do? ls
1: Guinevere
2: Morrigan Ravenskind
3: Eriu
4: Danu of Ireland
5: Fodla
6: Banba
7: Igraine of the Lake
8: Anna of the Mountains
9: Morgan la Fay
10: Elaine Pendragon
11: Morgawse
12: Arthur
13: Lancelot
14: Gwain
15: Argodras the Red
16: The Green Knight
17: Cam the Ram

What would you like to do? show 3
+============================+
| Eriu                       |
| id: 3                      |
|                            |
| Health: 32      XP: 0      |
|  Power: D4      Armor: 13  |
|                            |
+============================+

What would you like to do? show Elaine
+============================+
| Elaine Pendragon           |
| id: 10                     |
|                            |
| Health: 35      XP: 0      |
|  Power: D8      Armor: 14  |
|                            |
+============================+

What would you like to do? set active 4
What would you like to do? set active 6
What would you like to do? set active 13
What would you like to do? set active 15
What would you like to do? set active 1
Unable to set active knight. Only four can be active at a time.

What would you like to do? list active
4: Danu of Ireland
6: Banba
13: Lancelot
15: Argodras the Red

What would you like to do? remove 15
What would you like to do? set active 1
What would you like to do? quest

For this quest, our knights drew the following fortunes!
Danu of Ireland drew
+======================+
|Wisdom                |
|HP Bonus:           +0|
|AC Bonus:           +1|
|Hit Bonus:          +1|
|Damage Adj:        D12|
+======================+
Banba drew
+======================+
|Franchise             |
|HP Bonus:           +0|
|AC Bonus:           +0|
|Hit Bonus:          +1|
|Damage Adj:          -|
+======================+
Lancelot drew
+======================+
|Integrity             |
|HP Bonus:          +10|
|AC Bonus:           +2|
|Hit Bonus:          +2|
|Damage Adj:          -|
+======================+
Guinevere drew
+======================+
|Honesty               |
|HP Bonus:          +15|
|AC Bonus:           +0|
|Hit Bonus:          +0|
|Damage Adj:          -|
+======================+


Our heroes come across the following monsters. Prepare for battle!
Knights                     Foes
Danu of Ireland             Orc
Banba
Lancelot
Guinevere

Orc was defeated!
Would you like to continue on your quest (y/n)? y

Our heroes come across the following monsters. Prepare for battle!
Knights                     Foes
Danu of Ireland             Umber Hulk
Banba
Lancelot
Guinevere

Umber Hulk was defeated!
Would you like to continue on your quest (y/n)? y

Our heroes come across the following monsters. Prepare for battle!
Knights                     Foes
Danu of Ireland             Gelatinous Cube
Banba                       Frost Giant
Lancelot                    Kobold
Guinevere                   Red Dragon

Kobold was defeated!
Guinevere was defeated!
Banba was defeated!
Gelatinous Cube was defeated!
Lancelot was defeated!
Frost Giant was defeated!
Danu of Ireland was defeated!
All active knights have been defeated!

What would you like to do? save
What would you like to do? goodbye
Thank you for playing!
```

## Where to Start?!?
The most common struggle when getting an assignment like this, is where to start. The biggest mistake you can
make is trying to understand the entire thing before you start. Instead, remember - **divide-conquer-glue**.
You want to start small. Break this problem up into smaller parts, until you come across a part you can solve!

The best place to start is ask yourself, what is one of the smallest pieces you can accomplish. For java programs
that is often the interface, as they define your contract, but no code beyond that. 

You will notice looking at the UML diagram, you have two interfaces. GameView and Attributes.

Furthermore, GameView needs to know what a **Knight** is as part of the methods, so that is not a 
good place to start. You will notice Attributes need to know DiceType, and DiceType is just an enum. At 
this point, the flag of 'oh, I can write one of those' should trigger.

Based on that idea, the first classes you should actually look at implementing is

* DiceType
* DiceSet (relatively easy, only one method, only dependent on DiceType)
  - Make sure to test!
* Attributes
* Fortune
  - Make sure to test!
* MOB
  - Make sure to test!
* Knight
  - Make sure to test!

Notice, these are not dependant much on the entire programming working for them to work. After you have
those classes working, you can then work on getting the data loaded from the CSV files into the objects (GameData),
and **slowly** continue to build your objects. For each object, look at your javadoc and ask yourself
only on a method basis:

* what is my quest
* what do I have to work with
* what can I get
* what can I figure out!

A quick hint, you will be starting small, and then adding a bunch of items to ArrayLists once you get going. 

## NOTE: Part 1 and Part 2  Submissions
To encourage students to not  wait until the last minute to submit, the project is broken into two parts. The first part is actually the classes just mentioned above only

* DiceType
* DiceSet
* Attributes
* Fortune
* MOB
* Knight


## Using Other Code?
You are very free to use code from the other assignments, but you should not copy code from other people. This will flag as plagiarism.  

## Other Hints and Guidelines
* List?  
  You will notice looking at the UML and javadoc, that we use List a fair amount, but what is a List?
  The List is the interface for ArrayList. By using the interface List, the coder can choose to use an
  ArrayList or other structure that implements list. This is the **power** of polymorphism! 
  
  Here is an example
  ```java
    List<String> myList = new ArrayList<>();
    myList.add("hello");
    myList.add("world");
    for(String item : myList) {
       System.out.println(item);
    }
  ```
* Polymorphic Power  
  This assignment uses a fair amount, especially with GameData and GameView. By using the abstract class and
  interface throughout the rest of the code, we can easily swap the type of data and view. For example,
  what if we wanted a JSONGameData class? Would we want to change all of our code, or just that one class?
  To make this work in your code, here is a code snippet from our main method as an example:
  ```java
     GameData data = new CSVGameData(gamedata, saveData);
     GameView view  = new ConsoleView();
     CombatEngine engine = new CombatEngine(data, view);
     GameController controller = new GameController(data, view, engine);
     controller.start();
  ```
  Obviously, your main method will vary based on how you handled the program arguments, but notice that while
  I am initializing a ConsoleView(), I declare it as GameView.  
* Make sure to test!  
  **Over half of the lines in this code are simply accessors/getters**. However, it is very, very easy to get lost
  in code if you don't test. Make sure a class is working as expected before moving on. 
* Stay Social  
  Ask questions, describe algorithms, study together (but don't copy code! - easy way to fail the class). CS is a very social activity, and remember
  talking through the problem makes a world of difference.
* Take breaks  
  Half the reason for starting early, is so you can take breaks! If you are stuck, walk way and come back. The
  solution often presents itself. 
* Small Steps  
  The easiest way to get stuck on this assignment is to try everything at once. Instead treat each file  as an individual project/assignment.  You will find that start plugging into each other quickly as long as you make sure the individual methods and classes are working. 

## Turning In
Turning in your code. You must submit through zybooks, and even if the file doesn't have anything in it besides
the class definition, you will still need to submit it.  This is required by the autograder. 

As this is a **summative** 
assignment you get 10 (5+5) submission attempts only. 5 submission attempts will be in Part 1, and 5 submission attempts will be
in Part 2. You can turn in  Part 1 late without penalty, **but** both parts will have a hard cutoff due to finals week deadline restrictions. 

Testing becomes extremely important before submitting. We even encourage you to share the code you use for testing (only your _test_ code) in MS Teams.



> **Software Architecture and Game Design**  
> This assignment really highlights two areas, software architecture and game design. The design and implementation
> of large programs is difficult. Knowing how to test, knowing how to break up the problem, takes
> training, practice, practice and more practice. Our Software Engineering concentration specializes 
> in training you to be a software architect in the future! If you really liked the
> idea of the UI design, and would love to make this a graphical based  or web based application, then
> you should consider Human Centered Computing!



## Stretch Goals 

If you really enjoyed this project, then we recommend extending it over the break. That will continue to have
practice coding before your next coding class. Some ideas for extension

* Add javadoc to all your methods, and generate the webpages for it all
* Add the ability to have inventory items, each with their own attributes they provide bonuses.
* Build a 'choose your own adventure book' into the game. Based on choices, where does the
quest take the knight?
