# Kanji Maze

Test project for teaching Java.

Game for practicing kanji readings.
Goal of the game: reach the end of the maze by entering readings of each kanji on the way.

## PHASE 1

Completely deterministic order, each kanji has just one reading. 

### STEP 1

1. Show maze like this: [●] [猫]　[机]　[山]　[酒]　[✖︎]
2. Show explanation: You need to get from [●] to [✖︎].
3. Ask user to enter reading of each kanji one by one, starting from [猫].
4. When user answeres correctly - show map again [ ] [●]　[机]　[山]　[酒]　[✖︎].
5. When user makes mistake - ask again.
6. When user reaches [✖︎] - show `You win!`.

### STEP 2

User can make only 3 mistakes, if more - show `GAME OVER` and exit.

## PHASE 2

Random order of kanji from the list, there could be several readings.
