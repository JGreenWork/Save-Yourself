import java.util.Random;

public class Events{

public static int weeklyEvent(){ //weeklyEvent returns a random number from 1 to 5.  That number will be used to change the player's Status
Random rand = new Random();
int n = 1+rand.nextInt(5);
return n;}

public static String statusEvent(int n){  //Returns a string, giving you a hint about what your status is.  For example, "Nothing happens to you
String str = " ";                         //this week" means your Status is NORMAL.

switch(n){
    case 1: 
        str = "Nothing happens to you this week.";
        return str;
    case 2:
        str = "You are so excited that you can't sit still!  You should do something strenuous this week.";
        return str;
    case 3:
        str = "You feel extremely focused this week.  You should do something mentally challenging.";
        return str;
    case 4:
        str = "You fell down the steps and twisted your ankle!  You're on bedrest until you recover.";
        return str;
    case 5:
        str = "You have a splitting headache.  You can't even think about reading until it passes.";
        return str;}
return str;}

public static Princess tallyPoints(String[] a, Princess p, Weapons i1, Armor i2){ //Tallies up our points from Items, Weapons, and Armor and adds them
Weapons itemOne = i1;                                                             //to the stat totals of our Princess
Armor itemTwo = i2;
int n = Weapons.getNumber();
int m = Armor.getNumber();
String[] items = a;
Princess player = p;

switch(itemOne.getStats()){  //Compares your weapon stat and adds the value to the appropriate player stat depending on which weapon you chose
    case "Stealth +1": case "Stealth +2": case "Stealth +3": case "Stealth +4":
        player.setSneak(player.getSneak()+n);
        break;
    case "Swordsmanship +1": case "Swordsmanship +2": case "Swordsmanship +3": case "Swordsmanship +4":
        player.setFight(player.getFight()+n);
        break;
    case "Diplomacy +1": case "Diplomacy +2": case "Diplomacy +3": case "Diplomacy +4":
        player.setDiplomacy(player.getDiplomacy()+n);
        break;
    case "Magic +1": case "Magic +2": case "Magic +3": case "Magic +4":
        player.setMagic(player.getMagic()+n);
        break;}

switch(itemTwo.getStats()){  //Compares your armor stat and adds the value to the appropriate player stat depending on which armor you chose
    case "Stealth +1": case "Stealth +2": case "Stealth +3": case "Stealth +4":
        player.setSneak(player.getSneak()+m);
        break;
    case "Swordsmanship +1": case "Swordsmanship +2": case "Swordsmanship +3": case "Swordsmanship +4":
        player.setFight(player.getFight()+m);
        break;
    case "Diplomacy +1": case "Diplomacy +2": case "Diplomacy +3": case "Diplomacy +4":
        player.setDiplomacy(player.getDiplomacy()+m);
        break;
    case "Magic +1": case "Magic +2": case "Magic +3": case "Magic +4":
        player.setMagic(player.getMagic()+m);
        break;}

for (String str:items){  //goes through the string array we made in main and adds +1 to the appropriate stat for each item in the array
if (str.equals("Stealth +1"))
    player.setSneak(player.getSneak()+1);
else if (str.equals("Swordsmanship +1"))
    player.setFight(player.getFight()+1);
else if (str.equals("Diplomacy +1"))
    player.setDiplomacy(player.getDiplomacy()+1);
else if (str.equals("Magic +1"))
    player.setMagic(player.getMagic()+1);}
return player;}

}