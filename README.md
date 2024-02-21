# The Mines of Forsyth

Welcome to The Mines of Forsyth.
This is a command line base dungeon crawler game build with Java and Gradle.

## Design Patterns
I used the Factory Design pattern for creating various types of enemies.
This was a good option for creating different types of enemies that store all the stats/data.

I used the Decorator design pattern for creating the players that can have different character classes and type.
Character classes can have different abilities or stat advantages. A decorator design is a good choice for creating
different types of characters.

#### Requirements met:

1. Character class:
   Implemented: Yes - Character Decorator design pattern

2. Character type:
   Implemented: Yes - Character Decorator design pattern

3. Generate enemies:
   Yes, generated in Run()

4. Character Equip Items:
   Implemented: No, started implementation but did not finish. Commented out in Run().

5. Encounter chest:
   Implemented: Yes, generated in Run(). Additionally, adding enemy health potions drops chances.

6. Shop:
   Implemented: Yes, implemented the shop with items and players can buy health potions. Uses the Character Decorator design pattern for health potions and gems.

7. Health Potion Heal:
   Implemented: Yes, health potions do not heal more than player max health. Player max health implemented in the Character Decorator.

8. Less than 15% health:
   Implemented: Yes, players go back to top of mine and health and potions are reset. Used Character decorator for updating character values and stats.

9. Enemies get harder:
   Implemented: No

10. Game Cycles:
    Implemented: No

11. Character Stats:
    Implemented: Yes, implements in Character Decorator

12. Gain experience:
    Implemented: No

13. Level 15 Triple strike:
    Implemented: No

14. 14 During Combat:
Implemented: Yes - turn based, depending on speed. Uses Enemy Factory and Character Decorator. Players attack or consume items on their turn, player returns to the top level of mine if health is 0 or less and loses an amount of gems.

15. Player Status Effect:
Implemented: No

### Project Screen Cast:

[The Mines of Forsyth Screen cast](https://youtu.be/bXGwQpLfUPI?si=h0OArbLYpRdZ_q_j)



### Resources:
Design Pattern references I used for this project:

[BlackWasp Dps](https://www.blackwasp.co.uk/gofpatterns.aspx)

[Digital Ocean DPs](https://www.digitalocean.com/community/tutorials/java-design-patterns-example-tutorial)

[Factory Builder DP](https://www.digitalocean.com/community/tutorials/factory-design-pattern-in-java)

[Decorator DP](https://www.digitalocean.com/community/tutorials/decorator-design-pattern-in-java-example)

## Setup
Clone the repo: 

    git clone https://github.com/nswangarcia/The_Mines_of_Forsyth.git

cd The_Mines_of_Forsyth

gradle build

gradle run
