package kanjiMaze;

import java.util.Scanner;

public class GameExec {

/** Kanji Maze
 * @author Project outline, Code review: skkap
 * @author Code: stereowind
 * @version 0.01
 * Test project for teaching Java.
 * Game for practicing kanji readings.
 * Goal of the game: reach the end of the maze by entering readings of each kanji on the way.
 *
 * PHASE 1- STEP 1
 * (Completely deterministic order, each kanji has just one reading.)
 * O 1) Show maze like this: [●]　[猫]　[机]　[山]　[酒]　[✖︎]
 * O 2) Show explanation: You need to get from [●] to [✖︎].
 * O 3) Ask user to enter reading of each kanji one by one, starting from [猫].
 * O 4) When user answeres correctly - show map again [✔]　[●]　[机]　[山]　[酒]　[✖︎].
 * O 5) When user makes mistake - ask again.
 * O 6) When user reaches [✖︎] - show You win!
 *
 * All methods are defined at the bottom! - WORK IN PROGRESS
 */

	public static void main(String[] args) {
		System.out.println("*** Welcome to the Kanji Maze game! ***");
		System.out.println("You will see a map of the Kanji Maze with different kanji and start on the left side of the maze.");
		System.out.println("Your current position is shown with ● mark.");
		System.out.println("The goal is to reach ✖︎ tile. \nTo do that, you need to provide correct KUN readings in HIRAGANA for each kanji you \"step on\".");
		System.out.println("Let's begin!\n\n");

//		NEXT FEATURE WILL BE IMPLEMENTED LATER:
//		Waits for Enter key to be pressed.
//		System.out.println("Press Enter to continue...");
//		try
//      {
//          System.in.read();
//          System.in.close();
//      }
//      catch(Exception e)
//      {}

		// Here we create all necessary arrays, variables and Scanner input.
        String progress[] = {"猫", "机", "山", "酒", "謎", "✖︎"};
		String kanji[] = {"猫", "机", "山", "酒", "謎", "✖︎"};
        String readings[] = {"ねこ", "つくえ", "やま", "さけ", "なぞ"};
        String completedMark = "✔";
        String positionMark = "●";
        String answer = null;
        int pos = 0;
        progress[pos] = positionMark;
        Scanner input = new Scanner(System.in);

// 		NEXT FUNCTIONALITY WILL BE IMPLEMENTED LATER:
// 		Show initial map of the maze.
// 		Ask Press Enter to continue
//		========================================

        // CONDITION CHECK
        while (pos < 5) {
            System.out.println("MAP: ["+progress[0]+"] ["+progress[1]+"] ["+progress[2]+"] ["+progress[3]+"] ["+progress[4]+"] ["+progress[5]+"]");
            System.out.println("CURRENT KANJI: "+kanji[pos]);
            System.out.println("KUN READING: ");
            answer = input.next();
        if (answer.equals(readings[pos])) {
        	System.out.println("Correct!");
        	progress[pos] = completedMark;
        	pos += 1 ;
        	progress[pos] = positionMark;
        	//future method: progressMaze(x,y);
        } else {
	        System.out.println("Incorrect! Try again!\n");
	        }

        }//

        // The code below runs at the end of the program
        System.out.println("\nYou win!");
        System.out.println("MAP: ["+progress[0]+"] ["+progress[1]+"] ["+progress[2]+"] ["+progress[3]+"] ["+progress[4]+"] ["+progress[5]+"]");
        input.close();

	}

	// UNFINISHED Methods
	public static void progressMaze(int currKanjiPos, int nextKanjiPos) { // Run when answer is correct
		// To be created...
	}
}
