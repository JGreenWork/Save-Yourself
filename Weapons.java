import java.util.Random;
public class Weapons extends Items{

private static int number;

public Weapons(){super();} //Default constructor is the same as for Items

public Weapons(String n, String s, String d){ //When we first declare our Weapon, we'll use the same constructor as Items did
super(n,s,d);}

public static void setNumber(){  //Assigns a random number from 1 to 4 to the static variable number
Random rand = new Random();

number = (1+rand.nextInt(4));}

public static int getNumber(){  //standard get method
return number;}

@Override
public void setStats(String s){ //Calls setNumber, then uses that number to modify our weapon's stats so that we can get anywhere from +1 to +4
Weapons.setNumber();
int n = Weapons.getNumber();

stats = s+Integer.toString(n);
}

}