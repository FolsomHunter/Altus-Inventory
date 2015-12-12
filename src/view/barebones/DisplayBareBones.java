/*******************************************************************************
* Title: DisplayBareBones.java
* Author: Hunter Schoonover
* Date: 12/06/15
*
* Purpose:
*
* This class is the BareBones display version. It the most bare-bone, basic GUI
* possible: 
*   It takes input from the console and feeds it directly to CommandHandler as
*       a controller command
*   No information is displayed to the user except for "Next command:"
*
*/

//------------------------------------------------------------------------------

package view.barebones;

//------------------------------------------------------------------------------

import command.CommandHandler;
import java.util.Scanner;
import view.Display;

//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
// class DisplayBareBones
//

public class DisplayBareBones implements Display
{

    //--------------------------------------------------------------------------
    // DisplayBareBones::DisplayBareBones (constructor)
    //

    public DisplayBareBones()
    {

    }//end of DisplayBareBones::DisplayBareBones (constructor)
    //--------------------------------------------------------------------------

    //--------------------------------------------------------------------------
    // DisplayBareBones::init
    //
    // Initializes the object. Must be called immediately after instantiation.
    //

    @Override
    public void init()
    {
        
        //start listening for console input
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Next command:");
            CommandHandler.performControllerCommand(scanner.nextLine());
        }

    }// end of DisplayBareBones::init
    //--------------------------------------------------------------------------

    //functions required for Display interface
    @Override
    public void displayCustomers() {}
    
    @Override
    public void displayAddCustomer() {}

}//end of class DisplayBareBones
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
