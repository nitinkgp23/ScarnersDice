# ScarnersDice
----------
## Project Description
_________
Scarne’s Dice is a turn-based dice game where players score points by rolling a die and then:
* if they roll a 1: score no points and lose their turn
* if they roll a 2 to 6:
    add the rolled value to their points, choose to either reroll or keep their score and end their turn. 

The winner is the first player that reaches (or exceeds) 50 points.
For example, if a player starts their turn and rolls a 6, they can choose to either ‘hold’ and end their turn, in which case they can add the 6 to their score, or to reroll and potentially score more points.
Let’s say they decide to roll again, and they get a 4. They now have the option to end their turn and add 10 points (6 + 4) to their score, or to roll again to get even more points.
They decide to roll again, but get a 1. Getting a 1 makes the player lose all the points from their turn (so their score is the same as before their turn), and finishes their turn, allowing the second player to begin their turn.
This goes on until one of the players reaches 50 points or more.

## Features supported
------------

- [x] Single MainActivity throughout the game
- [x] 2 player version enabled i.e. the two players share their space on the same phone screen. See images for further reference.
- [x] Reset (New game) option and winner declaration supported

## Features to be added 
-------------

- [ ] Add a Landing page for the app, not just directly start the game.
 
- [ ] Create an animation representing each die roll. This will avoid confusion when rolling the same value twice in a row.


- [ ] Enable options on the landing page:
	A. Single Player (Play with computer)
	B. Multiplayer 


- [ ] For Option A, 
Implement a smarter computer player. I wouldn't recommend attempting the optimal player (which you can read about [here](http://cs.gettysburg.edu/projects/pig/pigVis.html) ) but take into account the difference between the computer score and user score in deciding when to hold.


- [ ] For Option B,
Ask for two more options:
	B1. Play on the same phone screen (Already supported)
	B2. Connect via Bluetooth


- [ ] For Option B2,
Make that game a multiplayer game in which 2 players with 2 mobiles can play connecting via bluetooth. See the relevant links for more info.


- [ ] Make another closing page with winner declaration and option for Restarting the game. Presently, both the things are supported but they appear on the same page. A new activity is to be built.


- [ ] Fast mode: Rather than rolling the dice a variable number of times, the user picks a number of dice to roll then rolls those dice all at once. If a 1 is shown, the user gets nothing. If no 1 is shown, the user gets the sum of the dice. In either case, the turn is over and the other player takes a turn. You can read more about this game in this [research paper](http://personal.vu.nl/h.c.tijms/morfismospaper.pdf).

----------------

Feel free to report any issues and bugs. For working on this project, fork it and make changes. Get back to me by submitting a pull request.

-----------------
[![15133703_1164109920346740_264781946_o.jpg](https://s18.postimg.org/grcyd788p/15133703_1164109920346740_264781946_o.jpg)](https://postimg.org/image/3zys6oygl/)
