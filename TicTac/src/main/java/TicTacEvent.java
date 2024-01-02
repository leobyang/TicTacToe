import javax.swing.*; //imports libraries we need
import java.awt.event.*;
import java.awt.*;


public class TicTacEvent implements ItemListener, ActionListener, Runnable { //creates a class that responds to mouse and keyboard input by “listening.”
    TicTac gui; //associates the game board with the event.
  
    ImageIcon a = new ImageIcon("X.png"); //sets X.png to imageicon a, make sure the images are less than 100x100 pixels in size
    ImageIcon b = new ImageIcon("O.png"); //sets O.png to imageicon 
    int clicks = 0;  //checks the number of turns 
    int win = 0;   //created to check for a winner
    int xwins = 0; //counter for xwins
    int owins = 0; //xounter for owins
    int ties = 0; //variable to keep track of ties 
    int[][] check = new int[3][3];  //2D array to check the value in each box 

    public TicTacEvent (TicTac in){ //associates the two files to be used together.
        gui = in;
        for (int row=0; row<=2; row++){  //initiates the winner check array.
           for (int col=0; col<=2; col++){ //for loop within for loop to check all rows and columns and set them all to have no value
               check[row][col]=0;
           }
       }
    }

    public void actionPerformed (ActionEvent event) {  //Tells the program what to do when a button is clicked.
        String command = event.getActionCommand();  //takes the button name as input from the button that is clicked.

       if (command.equals("1")) {  //if button labelled 1 is pressed 
           b1();                    //run the b1() method code below
       }
       if (command.equals("2")) {
           b2();
       }
       if (command.equals("3")) {
           b3();
       }
       if (command.equals("4")) {
           b4();
       }
       if (command.equals("5")) {
           b5();
       }
       if (command.equals("6")) {
           b6();
       }
       if (command.equals("7")) {
           b7();
       }
       if (command.equals("8")) {
           b8();
       }
       if (command.equals("9")) {
           b9();
       }
    }

void b1() {  //create methods b1 to b9 to handle clicks on Each game square
        clicks = clicks + 1;  //keeps track of the number of boxes chosen.
        if ((clicks%2)==1){  //if box in array position [0][0] top left corner is pressed 
            check[0][0] = 1; //Declare that the box  belongs to player 1 
            gui.boxes[0][0].setEnabled(false); //disable the box, so it can't be pressed again
            gui.boxes[0][0].setDisabledIcon(a); //set the image of the disabled box to a(strawhatpirates.jpg)
        } else {         // puts Buggy Clown symbol on the board and declares that square to be taken.
            check[0][0] = 2;
            gui.boxes[0][0].setEnabled(false); 
            gui.boxes[0][0].setDisabledIcon(b);
        }
        winner(); //Executes winner function 

    }
    void b2() {
        clicks = clicks + 1; //keeps track of the number of boxes chosen.
        if ((clicks%2)==1){ //if box in array position [0][1]  is pressed 
            check[0][1] = 1; //Declare that the box  belongs to player 1 
            gui.boxes[0][1].setEnabled(false); //disable the box, so it can't be pressed again
            gui.boxes[0][1].setDisabledIcon(a); //set the image of the disabled box to a(strawhatpirates.jpg)
        } else { // puts Buggy Clown symbol on the board and declares that square to be taken.
            check[0][1] = 2;
            gui.boxes[0][1].setEnabled(false); 
            gui.boxes[0][1].setDisabledIcon(b);
        }
        winner(); //Executes winner function 
    }
    void b3() {
        clicks = clicks + 1; //keeps track of the number of boxes chosen.
        if ((clicks%2)==1){ //if box in array position [0][2]  is pressed 
            check[0][2] = 1; //Declare that the box  belongs to player 1
            gui.boxes[0][2].setEnabled(false); //disable the box, so it can't be pressed again
            gui.boxes[0][2].setDisabledIcon(a); //set the image of the disabled box to a(strawhatpirates.jpg)
        } else { // puts Buggy Clown symbol on the board and declares that square to be taken.
            check[0][2] = 2;
            gui.boxes[0][2].setEnabled(false); 
            gui.boxes[0][2].setDisabledIcon(b);
        }
        winner(); //Executes winner function 
    }
    void b4() {
        clicks = clicks + 1; //keeps track of the number of boxes chosen.
        if ((clicks%2)==1){ //if box in array position [1][0]  is pressed 
            check[1][0] = 1; //Declare that the box  belongs to player 1
            gui.boxes[1][0].setEnabled(false); //disable the box, so it can't be pressed again
            gui.boxes[1][0].setDisabledIcon(a); //set the image of the disabled box to a(strawhatpirates.jpg)
        } else { // puts Buggy Clown symbol on the board and declares that square to be taken.
            check[1][0] = 2;
            gui.boxes[1][0].setEnabled(false); 
            gui.boxes[1][0].setDisabledIcon(b);
        }
        winner(); //Executes winner function 
    }
    void b5() { 
        clicks = clicks + 1; //keeps track of the number of boxes chosen
        if ((clicks%2)==1){ //if box in array position [1][1]  is pressed 
            check[1][1] = 1; //Declare that the box  belongs to player 1
            gui.boxes[1][1].setEnabled(false);  //disable the box, so it can't be pressed again
            gui.boxes[1][1].setDisabledIcon(a); //set the image of the disabled box to a(strawhatpirates.jpg)
        } else { // puts Buggy Clown symbol on the board and declares that square to be taken.
            check[1][1] = 2;
            gui.boxes[1][1].setEnabled(false); 
            gui.boxes[1][1].setDisabledIcon(b);
        }
        winner(); //Executes winner function 
    }
    void b6() {
        clicks = clicks + 1; //keeps track of the number of boxes chosen
        if ((clicks%2)==1){ //if box in array position [1][2]  is pressed 
            check[1][2] = 1; //Declare that the box  belongs to player 1
            gui.boxes[1][2].setEnabled(false); //disable the box, so it can't be pressed again
            gui.boxes[1][2].setDisabledIcon(a); //set the image of the disabled box to a(strawhatpirates.jpg)
        } else { // puts Buggy Clown symbol on the board and declares that square to be taken.
            check[1][2] = 2;
            gui.boxes[1][2].setEnabled(false); 
            gui.boxes[1][2].setDisabledIcon(b);
        }
        winner(); //Executes winner function 
    }
    void b7() {
        clicks = clicks + 1; //keeps track of the number of boxes chosen
        if ((clicks%2)==1){ //if box in array position [2][0]  is pressed 
            check[2][0] = 1; //Declare that the box  belongs to player 1
            gui.boxes[2][0].setEnabled(false); //disable the box, so it can't be pressed again
            gui.boxes[2][0].setDisabledIcon(a); //set the image of the disabled box to a(strawhatpirates.jpg)
        } else { // puts Buggy Clown symbol on the board and declares that square to be taken.
            check[2][0] = 2;
            gui.boxes[2][0].setEnabled(false); 
            gui.boxes[2][0].setDisabledIcon(b);
        }
        winner(); //Executes winner function 
    }
    void b8() {
        clicks = clicks + 1; //keeps track of the number of boxes chosen
        if ((clicks%2)==1){ //if box in array position [2][1]  is pressed 
            check[2][1] = 1; //Declare that the box  belongs to player 1
            gui.boxes[2][1].setEnabled(false); //disable the box, so it can't be pressed again
            gui.boxes[2][1].setDisabledIcon(a); //set the image of the disabled box to a(strawhatpirates.jpg)
        } else { // puts Buggy Clown symbol on the board and declares that square to be taken.
            check[2][1] = 2;
            gui.boxes[2][1].setEnabled(false); 
            gui.boxes[2][1].setDisabledIcon(b);
        }
        winner(); //Executes winner function 
    }
    void b9() {
        clicks = clicks + 1; //keeps track of the number of boxes chosen
        if ((clicks%2)==1){ //if box in array position [2][2]  is pressed 
            check[2][2] = 1; //Declare that the box  belongs to player 1
            gui.boxes[2][2].setEnabled(false); //disable the box, so it can't be pressed again 
            gui.boxes[2][2].setDisabledIcon(a); //set the image of the disabled box to a(strawhatpirates.jpg)
        } else { // puts Buggy Clown symbol on the board and declares that square to be taken.
            check[2][2] = 2;
            gui.boxes[2][2].setEnabled(false); 
            gui.boxes[2][2].setDisabledIcon(b);
        }
        winner(); //Executes winner function 
    }

    void winner() {
        /** Check rows for winner */
        
        for (int x=0; x<=2; x++){  // checks each row
            if ((check[x][0]==check[x][1])&&(check[x][0]==check[x][2])) { //checks to see if all entries are X, or all entries are O.
                if (check[x][0]==1) {  
                    win = 1; //Sets win to 1 to verify the game is complete 
                    xwins = xwins + 1; //Adds a X win
                    int result = JOptionPane.showConfirmDialog(null, "X Wins!\nX Wins: " + xwins + "\nO Wins: " + owins + "\nTies: " + ties + "\nWould you like to restart?",null, JOptionPane.YES_NO_OPTION); //Pane to show scores and provide option to restart or exit
                    if(result == JOptionPane.YES_OPTION) { //If button yes is selected, the following code will execute:
                        restart(); //Restart function executed 
                    }else{ 
                        System.exit(0); //Once that dialog is closed, the entire application will exit.
                    }
                    
                } else if (check[x][0]==2){ 
                  win = 1; //Sets win to 1 to verify the game is complete
                  owins = owins + 1; //Adds a O win
                    int result = JOptionPane.showConfirmDialog(null, "O Wins!\nX Wins: " + xwins + "\nO Wins: " + owins + "\nTies: " + ties + "\nWould you like to restart?",null, JOptionPane.YES_NO_OPTION); //Pane to show scores and provide option to restart or exit
                    if(result == JOptionPane.YES_OPTION) { //for following instances, same code is used as first instance
                        restart();
                    }else{
                        System.exit(0); 
                    }
                }
            }
        }

        /** Check columns for winner */
        for (int x=0; x<=2; x++){  //checks each column
            if ((check[0][x]==check[1][x])&&(check[0][x]==check[2][x])) {  //checks to see if all entries are X, or all entries are O.
                if (check[0][x]==1) {
                    win = 1; //Sets win to 1 to verify the game is complete
                    xwins = xwins + 1; //Adds a X win
                    int result = JOptionPane.showConfirmDialog(null, "X Wins!\nX Wins: " + xwins + "\nO Wins: " + owins + "\nTies: " + ties + "\nWould you like to restart?",null, JOptionPane.YES_NO_OPTION);//Pane to show scores and provide option to restart or exit
                    if(result == JOptionPane.YES_OPTION) { 
                        restart();
                    }else{
                        System.exit(0);
                    }    
                   
                } else if (check[0][x]==2) {
                    win = 1; //Sets win to 1 to verify the game is complete
                    owins = owins + 1; //Add a O win
                    int result = JOptionPane.showConfirmDialog(null, "O Wins!\nX Wins: " + xwins + "\nO Wins: " + owins + "\nTies: " + ties + "\nWould you like to restart?",null, JOptionPane.YES_NO_OPTION); //Pane to show scores and provide option to restart or exit
                    if(result == JOptionPane.YES_OPTION) { 
                        restart();
                    }else{
                        System.exit(0);
                    }
                   
                }
            }
        }

        /** Check diagonals for winner */
        if (((check[0][0]==check[1][1])&&(check[0][0]==check[2][2]))||
                ((check[2][0]==check[1][1])&&(check[1][1]==check[0][2]))){  //checks for diagonal matches.
            if (check[1][1]==1) {     
                win = 1; //Sets win to 1 to verify the game is complete
                xwins = xwins + 1; //Adds a X win
                int result = JOptionPane.showConfirmDialog(null, "X Wins!\nX Wins: " + xwins + "\nO Wins: " + owins + "\nTies: " + ties + "\nWould you like to restart?",null, JOptionPane.YES_NO_OPTION); //Pane to show scores and provide option to restart or exit
                if(result == JOptionPane.YES_OPTION) { 
                    restart();
                }else{
                    System.exit(0);
                }
                
            } else if (check[1][1]==2) { 
                win = 1; //Sets win to 1 to verify the game is complete
                owins = owins + 1; //Adds a O win
                int result = JOptionPane.showConfirmDialog(null, "O Wins!\nX Wins: " + xwins + "\nO Wins: " + owins + "\nTies: " + ties + "\nWould you like to restart?",null, JOptionPane.YES_NO_OPTION); //Pane to show scores and provide option to restart or exit
                if(result == JOptionPane.YES_OPTION) { 
                    restart();
                }else{
                    System.exit(0);
                }
            }
        }

        /** Checks if the game is a tie */
        if ((clicks==9) && (win==0)) {   //This structure checks to see if nine boxes have been chosen (clicks) and that a winner has not been declared (win == 0). 
            win = 1; //Sets win to 1 to verify the game is complete
            ties = ties + 1;
            int result = JOptionPane.showConfirmDialog(null, "The game is a tie!\nX Wins: " + xwins + "\nO Wins: " + owins + "\nTies: " + ties + "\nWould you like to restart?",null, JOptionPane.YES_NO_OPTION); //Pane to show scores and provide option to restart or exit
            if(result == JOptionPane.YES_OPTION) { 
                    restart();
                }else{
                    System.exit(0);
                }
            }
    }
    
    /**
     * restart function to begin game once more
     */
    void restart() {
        gui.boxes[0][0].setEnabled(true); //Enables boxes to be clicked again 
        gui.boxes[0][1].setEnabled(true); 
        gui.boxes[0][2].setEnabled(true);
        gui.boxes[1][0].setEnabled(true);
        gui.boxes[1][1].setEnabled(true);
        gui.boxes[1][2].setEnabled(true);
        gui.boxes[2][0].setEnabled(true);
        gui.boxes[2][1].setEnabled(true);
        gui.boxes[2][2].setEnabled(true);
        check[0][0] = 0; //resetting the checks of boxes
        check[0][1] = 0; 
        check[0][2] = 0;
        check[1][0] = 0;
        check[1][1] = 0;
        check[1][2] = 0;
        check[2][0] = 0;
        check[2][1] = 0;
        check[2][2] = 0;
        win = 0; //incompletes round for new winner
        clicks = 0; //resets value to detect ties
    }
     
    //void startPlaying() {
      //  playing = new Thread(this);
       // playing.start();
       // gui.play.setEnabled(false);
    //}

    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}

