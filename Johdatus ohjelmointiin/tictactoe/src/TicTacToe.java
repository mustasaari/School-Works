import java.util.*;

/**
* Tic-tac-toe game. 
*
* Player plays round of tick-tack-toe agains CPU.
* At start player defines boundaries of play area and required consecutive marks for victory.
* With WASD-controls player moves selection marker on play area and with X claims it for himself.
* Gameboard consist of objects called "square". These squares contain threat-level which is used
* to determine how likely CPU will try to claim square for itself.
*
* @author Mikko Mustasaari
* @version 2017.1205
* @since 1.0
*/


public class TicTacToe {

    static Scanner userScan = new Scanner(System.in);

    /**
    * Stores coordinate for player X position
    */
    static int X = 0;

    /**
    * Stores coordinate for player Y position
    */
    static int Y = 0;

    /**
    * Tracks whos turn it is
    */
    static boolean playerTurn = true;

    /**
    * Stores victory condition
    */
    static int winCondition = 3;

    /**
    * Stores info if game is running
    */
    static boolean isGameRunning = true;

    /**
     * Start method
     * Game parameters are defined at the start.
     * Gameboard is printed.
     * User input is asked. After correct input playerTurn is set to false.
     * If playerTurn is false, CPU makes its moves and set playerTurn to True
     * @param args Command line parameters. Not used.
     */

    public static void main(String [] args) {                           //MAIN
        System.out.println("\nTHE GAME OF RISTINOLLA BEGINS!!!\n");
        int arrayHeight = arrayParameters(" height");                   // setup game area height
        int arrayWidth = arrayParameters(" width");                     // setup game are width
        winCondition = winConditionParam(arrayHeight,arrayWidth);       // setup win condition

        Square[][] gameArray = new Square [arrayHeight][arrayWidth];    // create game table
        formatArray(gameArray);                                         // sets gameSquare object in array

        do {                                                            //MAIN GAME LOOP
            printArray(gameArray);                                      //print board
            getInput(gameArray);                                        //get player input. playerturn is set to false.
            if (playerTurn == false && isGameRunning == true) {         //if player has placed X, this if is executed
                turnCPU(gameArray);                                     //compured makes it's move. playerTurn is set to true
            }
        } while (isGameRunning == true);                                //Check if game still on
        printArray(gameArray);                                          //FINAL PRINT if game has ended
    }                                                                   //MAIN end

     /**
     * Places Square objects in array instead of NULL-value
     */

    public static void formatArray(Square[][] gameArray) {               //place Square objects in array instead of NULL
        for (int i = 0; i < gameArray.length; i++) {
            for (int j = 0; j < gameArray[i].length; j++) {
                gameArray[i][j] = new Square();
            }
        }
    }

     /**
     * Prints grid around squares and contents of every Square in gameArray
     */

    public static void printArray (Square[][] gameArray) {              //prints gameArray and all it's frames and bordes
        gameArray[Y][X].enable();                                       //show player location
        for (int i = 0; i < gameArray.length; i++) {
            
            for(int k = 0; k < gameArray[i].length; k++){
                System.out.print("+---");
            }
            System.out.println("+");
            for (int j = 0; j < gameArray[i].length; j++) {
                gameArray[i][j].printSquare();
                if (j == gameArray[i].length -1 ) {
                    System.out.print("|");
                }
            }
            System.out.println("");                                     //next line
        }
        for (int i = 0; i < gameArray[0].length; i++) {                 //prints last bottom row
            System.out.print("+---");
        }
        System.out.println("+");                                        //prints last plus
        gameArray[Y][X].disable();                                      //hide player location after printing
    }

     /**
     * Reads player's input and modifies X or Y value according to desired movement
     */

    public static void getInput(Square[][] gameArray) {                 //PLAYER CONTROLS

        boolean correctInput = false;                                   //Prevents leaving from method without corret input
        do {
            System.out.println("Use keys WASD to move and X to place your marker");
            String userInput = userScan.nextLine();
            if ((userInput.equals("w") || userInput.equals("W")) && Y > 0 ) {                         //&& prevents going out of array
                Y--;
                correctInput = true;
            }
            if ((userInput.equals("a") || userInput.equals("A")) && X > 0 ) {                         //&& prevents going out of array
                X--;
                correctInput = true;
            }
            if ((userInput.equals("s") || userInput.equals("S")) && Y < gameArray.length -1 ) {       //&& prevents going out of array
                Y++;
                correctInput = true;
            }
            if ((userInput.equals("d") || userInput.equals("D")) && X < gameArray[0].length -1) {     //&& prevents going out of array
                X++;
                correctInput = true;
            }
            if (userInput.equals("X") || userInput.equals("x") ) {
                if (gameArray[Y][X].getState() == 0) {                  //makes sure that square has no owner before it's made X
                gameArray[Y][X].setItX();
                threatCalculations(gameArray);
                correctInput = true;
                checkForWinner(gameArray);                              //When X has been placed check for victory conditions
                playerTurn = false;                                     //Player turn ends and CPU is allowed to take itäs turn
                }
            }
            if (correctInput == false) {                                //print gameArray again if player input was incorrect. smoother presentation
                printArray(gameArray);
            }

        } while( correctInput == false);                                //prevents from leaving without corret input
    }

     /**
     * Places CPU's O-marker on YX-coordinates in gameArray
     */

    public static void turnCPU(Square[][] gameArray) {
        int cpuThinks = 0;                                              //cpuThinks counts times for loop and prevents method from going into eternal loop if no threat is found. (failsafe)
        for (int i = 0; i < gameArray.length; i++) {
            for (int j = 0; j < gameArray[i].length; j++) {
                gameArray[i][j].decThreat();
            }
        }

        do {
            cpuThinks++;                                                //cpuThinks counts times for loop and prevents from going into eternal loop if no threat is found (failsafe)
            double cpuX = Math.random()*gameArray[0].length;            //ramdomize next square to try to make O
            double cpuY = Math.random()*gameArray.length;
            double threatCheck = Math.random()*100;                     //Rolls d100

            if (gameArray[(int)cpuY][(int)cpuX].getState() == 0 && (gameArray[(int)cpuY][(int)cpuX].getThreat() > threatCheck || cpuThinks > 1000)  ) {      //Check that square is empty and threat high enough
                gameArray[(int)cpuY][(int)cpuX].setItO();               //Place O in square
                checkForWinner(gameArray);                              //When O has been placed starts checking for victory conditions
                playerTurn = true;                                      //Return turn back to player
            }
        } while ( playerTurn == false);
    }

     /**
     * Increases threat value on adjacent squares of the YX-coordinates.
     * Icreasement is made separately to all 8 directions.
     * Then threat is added to opposite side of marker if theres X already on the other side. 
     */

    public static void threatCalculations(Square[][] gameArray) {       //This method increases threat squares
        
        int incThreatAmount = 100;                                       //incThreatAmount controls how much threat is increased when one X is next another X
        int areaIncrease = 7;                                          //areaIncrease controls amount of threat added around placed X

        for (int i = 1; i < 3; i++) {                                   //Horizontal and Vertical threat increasement       (i must be at least 1)
            if (X+i < gameArray[0].length) {                            //Right side of last placed X
                gameArray[Y][X+i].incThreat(areaIncrease-i*i);
                if (gameArray[Y][X+1].getState() == 1 && X-1 >= 0) {    //Check if X on right, if true increase threat on opposite left side
                    gameArray[Y][X-1].incThreat(incThreatAmount);       //increases threat by incThreatAmount
                }
            }
            if (X-i >= 0) {                                             //Left side
                gameArray[Y][X-i].incThreat(areaIncrease-i*i);
                if (gameArray[Y][X-1].getState() == 1 && X+1 < gameArray[0].length ) {
                    gameArray[Y][X+1].incThreat(incThreatAmount);
                }

            }
            if (Y+i < gameArray.length) {                               //Bottom
                gameArray[Y+i][X].incThreat(areaIncrease-i*i);
                if (gameArray[Y+1][X].getState() == 1 && Y-1 >= 0) {
                    gameArray[Y-1][X].incThreat(incThreatAmount);
                }
            }
            if (Y-i >= 0) {                                             //Up
                gameArray[Y-i][X].incThreat(areaIncrease-i*i);
                if (gameArray[Y-1][X].getState() == 1 && Y+1 < gameArray.length) {
                    gameArray[Y+1][X].incThreat(incThreatAmount);
                }
            }

            if (Y-i >= 0 && X-i >= 0) {                                 //Diagonal threat increasements start here
                gameArray[Y-i][X-i].incThreat(areaIncrease-i*i);                  //Upper Left
                if (gameArray[Y-1][X-1].getState() == 1 && Y+1 < gameArray.length && X+1 < gameArray[0].length) {
                    gameArray[Y+1][X+1].incThreat(incThreatAmount);
                }
            }
            if (Y+i < gameArray.length && X+i < gameArray[0].length) {
                gameArray[Y+i][X+i].incThreat(areaIncrease-i*i);        //Bottom Right
                if (gameArray[Y+1][X+1].getState() == 1 && Y-1 >= 0 && X-1 >= 0) {
                    gameArray[Y-1][X-1].incThreat(incThreatAmount);
                }
            }
            if (Y-i >= 0 && X+i < gameArray[0].length) {                //Upper Right
                gameArray[Y-i][X+i].incThreat(areaIncrease-i*i);
                if (gameArray[Y-1][X+1].getState() == 1 && Y+1 < gameArray.length && X-1 >= 0) {
                    gameArray[Y+1][X-1].incThreat(incThreatAmount);
                }
            }
            if (Y+i < gameArray.length && X-i >= 0) {                   //Bottom Left
                gameArray[Y+i][X-i].incThreat(areaIncrease-i*i);
                if (gameArray[Y+1][X-1].getState() == 1 && Y-1 >= 0 && X+1 < gameArray[0].length) {
                    gameArray[Y-1][X+1].incThreat(incThreatAmount);
                }
            }
        } 
    }

     /**
     * Checks if current player has enough adjacent markers on gameArray to complete victory conditons.
     * If victory condition is met, game is set to end and winner is announced
     */

    public static void checkForWinner(Square[][] gameArray) {           //Checks if win condition has been met
        int scoreX = 0;
        int scoreO = 0;
        int isArrayFull = 0;                                            //Checking if all squares have been filled

        for (int i = 0; i < gameArray.length ; i++) {                   //Horizontal check for consecutive X & O 
            scoreX = 0;
            scoreO = 0;
            for (int j = 0; j < gameArray[i].length; j++) {
                if (gameArray[i][j].getState() == 1) {
                    scoreX++;
                    scoreO = 0;
                    isArrayFull++;
                }
                if (gameArray[i][j].getState() == 2) {
                    scoreO++;
                    scoreX = 0;
                    isArrayFull++;
                }
                if (gameArray[i][j].getState() == 0) {
                    scoreO = 0;
                    scoreX = 0;
                }
                if (scoreX == winCondition || scoreO == winCondition) {     //if consecutive X's or O's have been found enough to fill victory condition
                    System.out.println("Horizontal Win");                   //Announce win type
                    announceWinner();                                       //Announce winning player                                       
                    isGameRunning = false;                                  //Set game to end
                }
                if (isArrayFull == gameArray.length*gameArray[0].length) {
                    System.out.println("GRID IS FULL! GAME OVER!");
                    isGameRunning = false;
                }
            }          
        }
  
    
        for (int i = 0; i < gameArray[0].length ; i++) {                    //Vertical Check
                scoreX = 0;
                scoreO = 0;
            for (int j = 0; j < gameArray.length; j++) {
                if (gameArray[j][i].getState() == 1) {
                    scoreX++;
                    scoreO = 0;
                }
                if (gameArray[j][i].getState() == 2) {
                    scoreO++;
                    scoreX = 0;
                }
                if (gameArray[j][i].getState() == 0) {
                    scoreO = 0;
                    scoreX = 0;
                }
                if (scoreX == winCondition || scoreO == winCondition) {
                    System.out.println("Vertical Win");
                    announceWinner();
                    isGameRunning = false;
                }
            }          
        }

        for ( int i = 0; i < gameArray.length -(winCondition-1); i++) {     //Diagonal Check from left to down
            scoreX = 0;
            scoreO = 0;

            for (int j = 0; j < gameArray[0].length -(winCondition-1); j++) {
                for (int k = 0; k < winCondition; k++) {
                    if (gameArray[i+k][j+k].getState() == 1) {
                        scoreX++;
                        scoreO = 0;
                    }
                    if (gameArray[i+k][j+k].getState() == 2) {
                        scoreO++;
                        scoreX = 0;
                    }
                    if (gameArray[i+k][j+k].getState() == 0) {
                        scoreO = 0;
                        scoreX = 0;
                    }
                }

                if (scoreX == winCondition || scoreO == winCondition) {
                    System.out.println("Diagonal Win from left to down");
                    announceWinner();
                    isGameRunning = false;
                }
                scoreO = 0;
                scoreX = 0;
            }
        }

        for (int i = (winCondition-1); i < gameArray.length ; i++) {        //Diagonal check from right to down
            scoreX = 0;
            scoreO = 0;
            for (int j = 0; j < gameArray[0].length -(winCondition-1); j++) {
                for (int k = 0; k < winCondition; k++) {
                    if (gameArray[i-k][j+k].getState() == 1) {
                        scoreX++;
                        scoreO = 0;
                    }
                    if (gameArray[i-k][j+k].getState() == 2) {
                        scoreO++;
                        scoreX = 0;
                    }
                    if (gameArray[i-k][j+k].getState() == 0) {
                        scoreX = 0;
                        scoreO = 0;
                    }
                }

                if (scoreX == winCondition || scoreO == winCondition) {
                    System.out.println("Diagonal Win from right to down");
                    announceWinner();
                    isGameRunning = false;
                }
                scoreO = 0;
                scoreX = 0;
            }
        }
    }

     /**
     * Prints out information about who has won the game
     */

    public static void announceWinner() {                                   //Winner Announcement based on turn value
        if (playerTurn == true) {
            System.out.println("Player has won!");
        }
        else {
            System.out.println("THE GREAT ARTIFICIAL INTELLIGENCE DEFEATS HUMAN!");
        }
    }

     /**
     * Gets user input on range 3-20.
     * Used to define gameArray width and height
     * @param String that is printed in middle of println (width/height)
     * @return Integer between 3 and 20 depending on user input
     */

    public static int arrayParameters(String text) {                        //Asks player for game area width and heigth and returns integer after it has been verified as number
        String userInput = "";
        int parsed = 0;
        do {
            System.out.print("Enter game area" +text +". It must be between 3 and 20 : " );
            userInput = userScan.nextLine();
            for (int i = 0; i <= 20; i++) {                                  //checks if input is number between 0 and 20
                if (userInput.equals("" +i)) {
                    parsed = Integer.parseInt(userInput);
                }
            }
        } while ( parsed < 3 || parsed > 20 );                              //check if input in within allowed game area size parameters - defined here
        return parsed;
    }

     /**
     * Gets user input to determine victory condition of game.
     * Checks that user input is definately a number
     * 
     * @param height integer of gameArrays height
     * @param width  integer of gameArrays width
     * @return Integer between 3 and width or height depending on whichever is lowest of value
     */

    public static int winConditionParam(int height, int width) {            //Ask player how many markers in line are needed to win the game
        int compare = 0;
        String userInput = "";
        int parsed = 0;
        if ( height > width ) {
            compare = width;
        }
        else {
            compare = height;
        }
        do {
            System.out.print("How many markers needed to win? This value must be between 3 and " +compare +" : ");
            userInput = userScan.nextLine();
            for (int i = 0; i <= compare; i++) {                            //checks if input is number between 0 and 20
                if (userInput.equals("" +i)) {
                    parsed = Integer.parseInt(userInput);
                }
            }
        } while ( parsed < 3 || parsed > compare );
        return parsed;
    }

}

/**
* Square class represent one space on the gameboard.
* It has two integers for it's owner and threat level
* and one boolean for printing graphics for player's YX coordinates.
* More higher the threat level is, more likely the CPU will claim this square.
* Owner of the square values are  0=empty  1=player=X   2=CPU=0
*/

class Square {                                                  //Square Object

    /**
    * if true [ ] is printed as selection marker
    */
    private boolean isSelected = false;

    /**
    * Stores the owner of Square: 0=empty  1=X   2=O
    */
    private int owner = 0;    
    
    /**
    * Stores the threat level of the Square
    */                                         
    private int threat = 0;

    /**
    * Prints graphics of Square
    */
    public void printSquare() {
        if (isSelected == true)
        System.out.print("|[");
        if (isSelected == false)
        System.out.print("| ");
        if (owner == 0)
        System.out.print(" ");
        if (owner == 1)
        System.out.print("X");
        if (owner == 2)
        System.out.print("O");
        if (isSelected == true)
        System.out.print("]");
        if (isSelected == false)
        System.out.print(" ");
    }

    /**
    * sets isSelected on true
    */
    public void enable() {                                      //show [ ] when square is printed
        isSelected = true;
    }

    /**
    * sets isSelected on false
    */
    public void disable() {                                     //hide [ ] from square
        isSelected = false;
    }

    /**
    * sets owner to 1
    */
    public void setItX() {                                      //set square's owner to X
        owner = 1;
    }

    /**
    * sets owner to 2
    */
    public void setItO() {                                      //set square's owner to O (cpu player)
        owner = 2;
    }

    /**
    * @return Owner of square Integer as 1,2 or 3 
    */
    public int getState() {                                     //returns owner of the square as 0, 1 or 2
        return owner;
    }

    /**
    * @return Threat level of square as Integer
    */
    public int getThreat() {                                    //returns threat level of the square
        return threat;
    }

    /**
    *
    * @param Integer of how much threat will be increased
    */
    public void incThreat(int increase) {                       //increase threat of the square by increase
            threat += increase;    
    }

    /**
    * Decreases squares threat by dividing it by 2
    */
    public void decThreat() {                                   //decrease threat of the square
        if (threat > 0) {
            threat = threat/2;
        }
    }
}

