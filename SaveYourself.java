import javax.swing.JOptionPane;

public class SaveYourself{
    
enum Status {NORMAL, EXCITED, FOCUSED, INJURED, HEADACHE};
//declares enums that will correspond to your character's emotional state

public static void main(String[] args){
    
    String name; //used to store character name
    String fourOptions[] = {"Explore", "Train", "Study", "Meditate"}; //used for button options
    String twoOptionsA[] = {"Study", "Meditate"};
    String twoOptionsB[] = {"Explore", "Train"};
    String finalOptions[] = {"Stealth", "Swordsmanship", "Diplomacy", "Magic"};
    int n, week, count, sneakCount, fightCount, diplomacyCount,magicCount; 
    //these are a variety of counters to keep track of game events.  n is used to designate which
    //button a player clicked on, week is for what week it is, count keeps track of how many
    //items a player has, the other four designate how many times a player has chosen those options
    //for the purposes of displaying a message
    
    
    
    while(true){ 
    //outer loop.  Loop will keep going until player breaks it, allowing you to replay the game 
    //over and over
    
        week=1; count=0; sneakCount=0; fightCount=0; diplomacyCount=0; magicCount=0; 
        //initializes counters to 0 (or 1) each time you replay the game
        
        Weapons itemOne = new Weapons(); //instantiates 1 Weapons object, 1 Armor object,
        Armor itemTwo = new Armor();     //and 8 Items objects
        Items itemThree=new Items(), itemFour=new Items(), itemFive=new Items(), 
            itemSix=new Items(),itemSeven=new Items(), itemEight=new Items(), 
            itemNine=new Items(), itemTen=new Items();
        Status playerStatus = Status.NORMAL; 
        //declares a Status enum object and sets it to NORMAL
   
      
        JOptionPane.showMessageDialog(null, "You have been kidnapped by an evil wizard and trapped inside a castle\n" 
            + "by his pet dragon until you agree to marry him.\n\nHe will return for your answer in five months.  "
            + "You have twenty weeks to\nfind a way out of the castle and back to your kingdom.  "
            + "\n\nWill you be able to Save Yourself?");
            //introduction to the game
        
        name = JOptionPane.showInputDialog(null, "What is your name?"); //Prompts player to input name.  If no name is input, defaults to Jane.
        if (name==null)
            break;
        else if (name.equalsIgnoreCase(""))
            name = "Jane";
        
        Princess player = new Princess(name); //instantiates Princess object using name variable
    
        Loop: //outer loop named Loop.  Repeats until week counter hits 22.  We name this so if a player cancels a choice, we can break this loop.
        while (week <=21){
            String[] inventory = {"\n\n\n\n\n\nWeapon:\t"+itemOne.toString(), //array of Strings using data from previously instantiated objects
                          "Armor:\t"+itemTwo.toString(),                  //keeps track of player items
                          "Items:\t"+itemThree.toString(),
                          "\t"+itemFour.toString(),
                          "\t"+itemFive.toString(),
                          "\t"+itemSix.toString(),
                          "\t"+itemSeven.toString(),
                          "\t"+itemEight.toString(),
                          "\t"+itemNine.toString(),
                          "\t"+itemTen.toString()};
            switch (week){
                case 1: case 20: 
                
                    for(String i:inventory) //enhanced for loop.  Prints out inventory array inside output screen
                        System.out.println(i);       
                    
                    n = JOptionPane.showOptionDialog(null, player.toString()+"\nWhat would you like to do this week?", "Week "+week, JOptionPane.DEFAULT_OPTION,  JOptionPane.PLAIN_MESSAGE, null, fourOptions, fourOptions[0]);
                    //prompts user to select activity for the week.
                    
                    switch (n){   //switchs increments player object variables, depending on which button is pressed
                        case -1: break Loop;
                        case 0: player.setSneak(player.getSneak()+2);
                            sneakCount++;
                            break;
                        case 1: player.setFight(player.getFight()+2);
                            fightCount++;
                            break;
                        case 2: player.setDiplomacy(player.getDiplomacy()+2);
                            diplomacyCount++;
                            break;
                        case 3: player.setMagic(player.getMagic()+2);
                            magicCount++;
                            break;}
                    
                    JOptionPane.showMessageDialog(null, Buttons.clickOne(n, sneakCount, fightCount, diplomacyCount, magicCount));
                    //dislays message, taking string from Buttons.clickOne method.  Buttons.clickOne uses the counters to determine how often 
                    //the player has chosen certain options
                    
                    if (week==20)
                        Buttons.reset();
                    //if it's week 20, use Buttons.reset() to return all the instance variables in Buttons back to zero, in case the player 
                    //chooses to play again
                    
                    week++; //increments weekly counter
                    break;
            
                case 2: case 4: case 6: case 8: case 12: case 14: case 16: case 18:  
                    for(String i:inventory) //display inventory
                        System.out.println(i);       
                
                    n = JOptionPane.showOptionDialog(null, player.toString()+"\nWhat would you like to do this week?", "Week "+week, JOptionPane.DEFAULT_OPTION,  JOptionPane.PLAIN_MESSAGE, null, fourOptions, fourOptions[0]);
                    switch (count){ //use variable count to keep track of how many items a player has received
                        case -1: break Loop; //if player closes the messagebox, break the loop
                        case 0: 
                            itemThree = Buttons.clickTwo(n);  //using Buttons.clickTwo, assign items to the eight Items objects we created
                            JOptionPane.showMessageDialog(null, "You've discovered the "+itemThree.getName()+"!  "+itemThree.getDescription());
                            break;
                        case 1:
                            itemFour = Buttons.clickTwo(n);
                            JOptionPane.showMessageDialog(null, "You've discovered the "+itemFour.getName()+"!  "+itemFour.getDescription());
                            break;
                        case 2:
                            itemFive = Buttons.clickTwo(n);
                            JOptionPane.showMessageDialog(null, "You've discovered the "+itemFive.getName()+"!  "+itemFive.getDescription());
                            break;
                        case 3:
                            itemSix = Buttons.clickTwo(n);
                            JOptionPane.showMessageDialog(null, "You've discovered the "+itemSix.getName()+"!  "+itemSix.getDescription());
                            break;
                        case 4:
                            itemSeven = Buttons.clickTwo(n);
                            JOptionPane.showMessageDialog(null, "You've discovered the "+itemSeven.getName()+"!  "+itemSeven.getDescription());
                            break;
                        case 5:
                            itemEight = Buttons.clickTwo(n);
                            JOptionPane.showMessageDialog(null, "You've discovered the "+itemEight.getName()+"!  "+itemEight.getDescription());
                            break;
                        case 6:
                            itemNine = Buttons.clickTwo(n);
                            JOptionPane.showMessageDialog(null, "You've discovered the "+itemNine.getName()+"!  "+itemNine.getDescription());
                            break;
                        case 7:
                            itemTen = Buttons.clickTwo(n);
                            JOptionPane.showMessageDialog(null, "You've discovered the "+itemTen.getName()+"!  "+itemTen.getDescription());
                            break;}
                    
                    week++; //increment counters week and count
                    count++;
                    break;
                    
                case 10:
                    for(String i:inventory) //inventory display
                        System.out.println(i);       
                
                    n = JOptionPane.showOptionDialog(null, player.toString()+"\nWhat would you like to do this week?", "Week "+week, JOptionPane.DEFAULT_OPTION,  JOptionPane.PLAIN_MESSAGE, null, fourOptions, fourOptions[0]);
                    if (n==-1)
                        break Loop;
                    
                    itemOne = Buttons.clickThree(n); //use Buttons.clickThree to assign a weapon to the Weapons object we created earlier
                    JOptionPane.showMessageDialog(null, "You've discovered the "+itemOne.getName()+"!  "+itemOne.getDescription());
                    
                    week++; //increment week counter
                    break;
                
                case 15:
                    for(String i:inventory) //inventory display
                        System.out.println(i);       
                
                    n = JOptionPane.showOptionDialog(null, player.toString()+"\nWhat would you like to do this week?", "Week "+week, JOptionPane.DEFAULT_OPTION,  JOptionPane.PLAIN_MESSAGE, null, fourOptions, fourOptions[0]);
                    if (n==-1)
                        break Loop;
                    
                    itemTwo = Buttons.clickFour(n); //use Buttons.clickFour to assign an armor to the Armor object
                    JOptionPane.showMessageDialog(null, "You've discovered the "+itemTwo.getName()+"!  "+itemTwo.getDescription());
                    
                    week++;
                    break;
                
                case 3: case 5: case 7: case 9: case 11: case 13: case 17: case 19:
                    for(String i:inventory) //inventory display
                        System.out.println(i);
                    
                    int x = Events.weeklyEvent(); //use the Events.weeklyEvent method to generate a random event.  These random events can change
                                                  //a player's Status, limiting or boosting their activities for the week.  
                    switch(x){
                        case 1: playerStatus=Status.NORMAL;
                                JOptionPane.showMessageDialog(null, Events.statusEvent(x));
                                break;
                        case 2: playerStatus=Status.EXCITED;
                                JOptionPane.showMessageDialog(null, Events.statusEvent(x));
                                break;
                        case 3: playerStatus=Status.FOCUSED;
                                JOptionPane.showMessageDialog(null, Events.statusEvent(x));
                                break;
                        case 4: playerStatus=Status.INJURED;
                                JOptionPane.showMessageDialog(null, Events.statusEvent(x));
                                break;
                        case 5: playerStatus=Status.HEADACHE;
                                JOptionPane.showMessageDialog(null, Events.statusEvent(x));
                                break;}
                    
                    switch(playerStatus){ //do different things depending on what playerStatus is set to
                        case NORMAL:
                            n = JOptionPane.showOptionDialog(null, player.toString()+"\nWhat would you like to do this week?", "Week "+week, JOptionPane.DEFAULT_OPTION,  JOptionPane.PLAIN_MESSAGE, null, fourOptions, fourOptions[0]);
                
                
                            switch (n){ //if playerStatus is normal, increment player object variables by one depending on the button they click
                                case -1: break Loop;
                                case 0: player.setSneak(player.getSneak()+1);
                                        sneakCount++;
                                        break;
                                case 1: player.setFight(player.getFight()+1);
                                        fightCount++;
                                        break;
                                case 2: player.setDiplomacy(player.getDiplomacy()+1);
                                        diplomacyCount++;
                                        break;
                                case 3: player.setMagic(player.getMagic()+1);
                                        magicCount++;
                                        break;}
                                
                            JOptionPane.showMessageDialog(null, Buttons.clickOne(n, sneakCount, fightCount, diplomacyCount, magicCount));
                            break;
                    
                        case EXCITED:
                            n = JOptionPane.showOptionDialog(null, player.toString()+"\nWhat would you like to do this week?", "Week "+week, JOptionPane.DEFAULT_OPTION,  JOptionPane.PLAIN_MESSAGE, null, fourOptions, fourOptions[0]);
                
                
                            switch (n){ //if playerStatus is Excited, increment sneak and fight by two if chosen, and diplomacy and magic by one.
                                case -1: break Loop; 
                                case 0: player.setSneak(player.getSneak()+2);
                                    sneakCount++;
                                    break;
                                case 1: player.setFight(player.getFight()+2);
                                    fightCount++;
                                    break;
                                case 2: player.setDiplomacy(player.getDiplomacy()+1);
                                    diplomacyCount++;
                                    break;
                                case 3: player.setMagic(player.getMagic()+1);
                                    magicCount++;
                                    break;}
                
                            JOptionPane.showMessageDialog(null, Buttons.clickOne(n, sneakCount, fightCount, diplomacyCount, magicCount));
                            break;
                    
                        case FOCUSED:
                            n = JOptionPane.showOptionDialog(null, player.toString()+"\nWhat would you like to do this week?", "Week "+week, JOptionPane.DEFAULT_OPTION,  JOptionPane.PLAIN_MESSAGE, null, fourOptions, fourOptions[0]);
                
                            switch (n){ //if playerStatus is focused, increment sneak or fight by one if chosen, and diplomacy or magic by two
                                case -1: break Loop;
                                case 0: player.setSneak(player.getSneak()+1);
                                    sneakCount++;
                                    break;
                                case 1: player.setFight(player.getFight()+1);
                                    fightCount++;
                                    break;
                                case 2: player.setDiplomacy(player.getDiplomacy()+2);
                                    diplomacyCount++;
                                    break;
                                case 3: player.setMagic(player.getMagic()+2);
                                    magicCount++;
                                    break;}
                
                            JOptionPane.showMessageDialog(null, Buttons.clickOne(n, sneakCount, fightCount, diplomacyCount, magicCount));
                            break;
                        
                        case INJURED:
                            n = JOptionPane.showOptionDialog(null, player.toString()+"\nWhat would you like to do this week?", "Week "+week, JOptionPane.DEFAULT_OPTION,  JOptionPane.PLAIN_MESSAGE, null, twoOptionsA, twoOptionsA[0])+2;
                            //if playerStatus is Injured, player cannot choose to Explore or Train that week
                
                            switch (n){  //increment diplomacy or magic by one
                                case -1: break Loop;
                                case 2: player.setDiplomacy(player.getDiplomacy()+1);
                                    diplomacyCount++;
                                    break;
                                case 3: player.setMagic(player.getMagic()+1);
                                    magicCount++;
                                    break;}
                
                            JOptionPane.showMessageDialog(null, Buttons.clickOne(n, sneakCount, fightCount, diplomacyCount, magicCount));
                            break;
                    
                        case HEADACHE:
                            n = JOptionPane.showOptionDialog(null, player.toString()+"\nWhat would you like to do this week?", "Week "+week, JOptionPane.DEFAULT_OPTION,  JOptionPane.PLAIN_MESSAGE, null, twoOptionsB, twoOptionsB[0]);
                            //if playerStatus is Headache, player cannot choose Study or Meditate that week
                
                            switch (n){ //increment sneak or fight by one
                                case -1: break Loop;
                                case 0: player.setSneak(player.getSneak()+1);
                                    sneakCount++;
                                    break;
                                case 1: player.setFight(player.getFight()+1);
                                    fightCount++;
                                    break;}
                
                            JOptionPane.showMessageDialog(null, Buttons.clickOne(n, sneakCount, fightCount, diplomacyCount, magicCount));
                            break;}
                    week++;
                    break;
                
                case 21: //final week.  display stat totals from player object and items/armor/weapon, then have player choose final activity
                    String[] itemsArray = {itemThree.getStats(), itemFour.getStats(), itemFive.getStats(), itemSix.getStats(), itemSeven.getStats(),itemEight.getStats(),itemNine.getStats(),itemTen.getStats()};
                    player = Events.tallyPoints(itemsArray, player, itemOne, itemTwo); 
                    //creates a String array of Item stats, then call Events.tallyPoints and use array to help tally up all stat points             
                
                    String str = "\n\nYour time at the castle is over.  The wizard will be here soon.\nIf you are going to save yourself, you must do it now.\n\nI will escape using my:";
                    n = JOptionPane.showOptionDialog(null, player.toString()+"\n"+str, "Week "+week, JOptionPane.DEFAULT_OPTION,  JOptionPane.PLAIN_MESSAGE, null, finalOptions, finalOptions[0]);
                    //This is your final choice on how you want to escape
                
                    JOptionPane.showMessageDialog(null, Endings.theEnd(n,player.getSneak(),player.getFight(),player.getDiplomacy(),player.getMagic(), itemOne.getName(), player.getName()));
                    //displays an ending depending on player stat totals and final choice
                
                    week++;
                    break;
                }
            }//Once the week counter is at 22, Loop breaks and this will display.  Asks player if they want to play again.  If they say no, while(true) breaks and game exits
        int quit = JOptionPane.showConfirmDialog(null, "Would you like to play again?","Confirm",JOptionPane.YES_NO_OPTION);
        if (quit == JOptionPane.NO_OPTION)
            break;
        }

    System.exit(0);
    }
}