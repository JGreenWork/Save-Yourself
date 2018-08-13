public class Items{

private String name, description;
public String stats;

public Items(){         //The default constructor assigns null values to stats and description, and a series of dash marks for the name
name = "----------";    //This becomes important in order to properly display our inventory.
stats = " ";
description = " ";}

public Items(String n, String s, String d){ //Our constructor for Items takes three strings
name = n;
stats = s;
description = d;}

public String getName(){ //These are our standard sets and gets
return name;}

public String getStats(){
return stats;}

public String getDescription(){
return description;}

public void setName(String n){
name = n;}

public void setStats(String s){
stats = s;}

public void setDescription(String d){
description = d;}

@Override
public String toString(){  //We want our Items to display in a certain way
return name+"\t\t"+stats;}

}