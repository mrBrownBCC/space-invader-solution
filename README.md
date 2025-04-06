# Setup Instructions
In order to run the GUI:
Go to the ports tab. Click "Add port" and type the number 6080.
Follow the link to your forwarded address. This is where your GUI should be available once you run your code. Note that the GUI won't work very well until you have finished most of the code - tests will be used to make sure the intermediate steps works well. 

To access the code, go to app > src > main > java


# Programming Instructions

General notes (same as from battleship lab):
1. Don't change any method headers. These will be correct and may be used by the automated tests. 
2. For testing run the given command in the terminal. It will be of the pattern gradle ______
3. Say hello to your (maybe) first real code editor (if you used codehs for the last project). Autocomplete, error highlighting, and other things are about to make your life so much easier. 
4. Apply for the student github developer pack!!
5. For each step, more detail may be given in code comments
6. As a new recommendation - Commit after each section is complete, in case you make a catostrophic mistake that breaks everything, you can go back to this point in time. 

## Part 1 - Exploration
As a class, we will take a look at the starter code for each class. Explore more on your own!

## Part 2 - Player Ship Movement - 10 points

1. First things first, we need to be able to make a ship class in the first place. Complete the constructor in Ship.java.
2. PlayerShip extends Ship. Complete the PlayerShip Constructor
3. Write the player movement portion of the PlayerShip update method. Then test this out in the GUI!
4. Write the keepInBounds method in the PlayerShip class. 
5. Complete the display method in the PlayerShip class. 

RUN THE TESTS. To earn the points for this section, you must pass all of the tests

## Part 3 - Background Stars - 5 points
This part of the code is straightforward enough, but simple code can make such a big difference in the feel of the game!
Test the new GUI out after steps 2 and 3, choose values that you like for the size, speed, and number of stars. 

1. Complete the Star Constructor
2. Complete the intializeStars method in GamePanel.java
3. Complete the Star update method

## Part 4 - Speedy Enemy + Projectiles - 10 points
In the interest of time, I am leaving most starter code for the EnemyShip Class. This code currently calls the shoot method every maxCooldown frames. 
It also keeps the ship in bounds from left to right, bouncing it away from the wall. If the ship goes below the bottom of the screen, it will loop back to the top. 

1. Write the constructor for SpeedyEnemy
2. Write the update method for SpeedyEnemy
3. Let's make some! Add these ships in the beginLevel method in GamePanel.java. At this point when you test, the ships should move around and down the screen, but not interact with anything. 
4. Write the Projectile Constructor


## Part 5 - Damage, level progression, player shooting, and death - 15

## Part 6 - TankyEnemy and Boss Enemy - 10

## BONUS
In the future, if there is interest, we will revisit this project and add cool extensions. Some ideas - 
1. Add custom images
2. Add cool background stuff
3. Add new enemies (NOTE THAT TO PASS TESTS AND EXPERIMENT WITH NEW ENEMIES EASILY, YOU CAN JUST SET curLevel TO BE 3 AND ADD ALL YOUR COOL NEW STUFF THERE)
4. Fancy new projectiles with special effects (freezing, heat seaking, explosive, etc)
5. Power ups
6. add cool animations
7. A currency + upgrades

# Submission
1. Testing everything. Run the command - 
``` 
gradle test
```
2. Create a .jar file and move to the dist folder. 
3. Submit on github classroom by running the following commands. This also saves your work permanently (unless you actively want to delete it). 

```
git add . 
git commit -m "submitting"
git push
```
