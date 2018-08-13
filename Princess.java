import java.util.Random;
public class Princess{

private String name;
private int sneak, diplomacy, fight, magic;


public Princess(){}

public Princess(String n){  //Our constructor takes a name that the user inputs (or uses the default name, if the user chooses not to input one.
Random rand = new Random(); //Then it randomly assigns a number from 1 to 6 to each of our starting stats
name = n;
sneak = 1+rand.nextInt(6);
diplomacy = 1+rand.nextInt(6);
fight = 1+rand.nextInt(6);
magic = 1+rand.nextInt(6);}

public void setName(String n){  //These are our standard sets and gets, nothing tricky here
name = n;}

public void setSneak(int s){
sneak = s;}

public void setDiplomacy(int d){
diplomacy = d;}

public void setFight(int f){
fight = f;}

public void setMagic(int m){
magic = m;}

public String getName(){
return name;}

public int getSneak(){
return sneak;}

public int getDiplomacy(){
return diplomacy;}

public int getFight(){
return fight;}

public int getMagic(){
return magic;}

@Override
public String toString(){ //We want to display our stats so that players can keep track of where they are, so we overwrite the toString method
return "Princess "+name+"\nSneakiness: "+sneak+"     Swordsmanship: "+fight+"     Diplomacy: "+diplomacy+"     Magic: "+magic;
}
}