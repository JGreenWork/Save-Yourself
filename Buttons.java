public class Buttons{
    
    private static int sneakCount=0, fightCount=8, diplomacyCount=16, magicCount=24;
    
    //clickOne takes five variables.  i is the number of the choice the player made: to explore, train, etc.  Depending on what they
    //chose to do that week, a different string will be returned.  s, f, d, and m are the counters keeping track of how many times
    //the player has chosen that particular option already.  So for instance, if you choose to Explore three times, you will get
    //a different message each time as s increases.  If you then choose to train, you will see the *first* string under the corresponding
    //option, because it is your first time training.  Then clickOne returns that string to main.
    
    public static String clickOne(int i, int s, int f, int d, int m){
    String str = " ";
    switch (i){
        case 0:
            switch (s){
                case 1: str="You explore the upper floors of the castle, hiding whenever something frightens you.";
                    return str;
                case 2: str="You venture down into the basement, avoiding the squeaky stairs.";
                    return str;
                case 3: str="You practice walking without leaving a trail in the dust.";
                    return str;
                case 4: str="You find a locked door and practice until you can pick the lock.";
                    return str;
                case 5: str="You shadow the dragon from atop the parapets, hiding whenever she looks your way.";
                    return str;
                case 6: str="You learn how to walk across a tightrope without losing your balance.";
                    return str;
                case 7: str="You make a grappling hook and spend the week climbing the rooftops of the castle.";
                    return str;
                case 8: str="You practice throwing knives until you can hit the center of the bullseye every time.";
                    return str;
                case 9: str="You find a book on poisons hidden in the library.  This will be very useful.";
                    return str;
                case 10: str="You master the art of concealment.  Nobody sees you unless you want to be seen.";
                    return str;
                }
        case 1:
            switch (f){
                case 1: str="You run up and down the steps of the castle, trying to stay fit.";
                    return str;
                case 2: str="You practice your footwork, remembering everything your fencing instructor tried to teach you.";
                    return str;
                case 3: str="You throw punches until your hands ache.";
                    return str;
                case 4: str="You carve a wooden sword and practice your moves on a dummy.";
                    return str;
                case 5: str="You train until you can hold your sword out with one arm without tiring.";
                    return str;
                case 6: str="You move sacks of flour from the basement to the roof and back again.";
                    return str;
                case 7: str="You swing your sword a thousand times each day.";
                    return str;
                case 8: str="You manage to break through a stack of bricks using only your fists.";
                    return str;
                case 9: str="You sharpen your sword until you can slice a hair in half length-wise.";
                    return str;
                case 10: str="You learn how to slice a man in half and not have him realize until he tries to walk away.";
                    return str;}
            
        case 2:
            switch (d){
                case 1: str="You spend your days writing letters and reading a tattered book of etiquette.";
                    return str;
                case 2: str="You write letter after letter, each one more persuasive.";
                    return str;
                case 3: str="You learn the art of calligraphy.";
                    return str;
                case 4: str="You master twenty-seven different bows and sixteen different curtseys.";
                    return str;
                case 5: str="You learn to compliment gracefully.";
                    return str;
                case 6: str="You learn how to refuse someone without offending them.";
                    return str;
                case 7: str="You write letters to your minsters and send them out using pigeons.";
                    return str;
                case 8: str="You contact the rulers of neighboring countries and persuade them to your side.";
                    return str;
                case 9: str="You call upon the people of your kingdom to defend you.";
                    return str;
                case 10: str="Your armies are standing by.";
                    return str;
               }
        case 3:
            switch (m){
                case 1: str="You read your spellbook over and over again, chanting Latin phrases under your breath.";
                    return str;
                case 2: str="You manage to light a candle using magic.";
                    return str;
                case 3: str="You learn a spell for summoning water and nearly flood the basement.";
                    return str;
                case 4: str="You turn a pumpkin into a carriage and back again.";
                    return str;
                case 5: str="You practice on the kitchen mice, turning them into a variety of amusing objects.";
                    return str;
                case 6: str="You learn a spell for casting fireballs hot enough to melt solid steel.";
                    return str;
                case 7: str="You learn how to brew glory and stopper death.";
                    return str;
                case 8: str="You memorize one of the Eight Forbidden Spells, though you pray you will never need to use it.";
                    return str;
                case 9: str="You bargain with fiends for powers not of this world.";
                    return str;
                case 10: str="You have mastered the magical arts.  There is nothing left for you to learn here.";
                    return str;}
    }
    return str;
    }
      
//clickTwo is where your items are assigned to you in your inventory.  We declare a massive array of items, 32 in total, corresponding to all of the 
//different choices you can make for activities.  
public static Items clickTwo(int n){
    Items[] itemArray = {new Items("Leather Gloves","Stealth +1","These sturdy gloves will keep you from leaving fingerprints."), new Items("Black Mask","Stealth +1","This mask will keep your face covered."),
    new Items("Sneakers","Stealth +1","Sneak, sneak, sneak."),new Items("Pieces of Chalk","Stealth +1","This will help you mark your path."),
    new Items("Castle Map","Stealth +1","Now you can find all the hidden passages."),new Items("Smokebombs","Stealth +1","Vanish!"),
    new Items("Night-Vision Goggles","Stealth +1","I can see you, but you can't see me."),new Items("Invisibility Cloak","Stealth +1","Mwahahahahah..."),
    new Items("Masking Tape","Swordsmanship +1","This tape will keep your knuckles from bleeding."),new Items("Boxing Gloves","Swordsmanship +1","Float like a butterfly, sting like a bee!"),
    new Items("Brass Knuckles","Swordsmanship +1","Give that dragon a knuckle sandwich!"),new Items("Punching Bag","Swordsmanship +1","Much better than punching walls."),
    new Items("Shin Guards","Swordsmanship +1","Proper protection is important."),new Items("Shoulderpads","Swordsmanship +1","Now you can tackle your foes."),
    new Items("Swordfighting for Dummies","Swordsmanship +1","Ohhhh!  The pointy end goes in the OTHER guy!"),new Items("Berserker Potion","Swordsmanship +1","This potion is said to increase your strength ten-fold."),
    new Items("Parchment","Diplomacy +1","Suitable for only the finest correspondence."),new Items("Black Ink","Diplomacy +1","So dark it seems to almost glow on the page."),
    new Items("Fancy Quills","Diplomacy +1","Are these made from gryphon feathers?"),new Items("Homing Pigeons","Diplomacy +1","These birds know exactly where to go."),
    new Items("Book of Court Manners","Diplomacy +1","'How to address your betters and command your lessers.'"),new Items("Magic Mirror","Diplomacy +1","Mirror mirror on the wall, show me what the Duke of Corlais is doing right now."),
    new Items("Gold Tiara","Diplomacy +1","A tiara fit for a queen."),new Items("Scepter","Diplomacy +1","This gold scepter will proclaim your royalty to everyone."),
    new Items("Book of Spells","Magic +1","It's wingardium leviOsa, not levioSA."),new Items("Pieces of Chalk","Magic +1","You can draw a variety of circles and pentagrams with these!"),
    new Items("Eyes of Newt","Magic +1","Useful, but gross."),new Items("Toes of Frog","Magic +1","Do frogs even have toes?"),
    new Items("Mandrake Root","Magic +1","It looks like a baby but screams like a banshee."),new Items("Saltpeter","Magic +1","Used in all sorts of spells, mostly to blow stuff up."),
    new Items("Unicorn Blood","Magic +1","It glows with a faint silvery light."),new Items("Virgin Tears","Magic +1","They don't seem any different than normal tears.")};
        
    Items next = new Items();
    //We use the static variables we declared at the beginning to keep track of our place in the array.  The array is laid out so that
    //the first 8 items are all part of the Stealth branch, the next 8 are part of Fighting, etc.  So we start with sneakCount=0, fightCount=8,
    //etc.  Each time a particular option is chosen the counter for that stat increments, letting us move through the array.
    switch(n){
        case 0:
            next=itemArray[sneakCount];
            sneakCount++;
            return next;
        case 1:
           next=itemArray[fightCount];
            fightCount++;
            return next;
        case 2:
           next=itemArray[diplomacyCount];
            diplomacyCount++;
            return next;
        case 3:
            next=itemArray[magicCount];
            magicCount++;
            return next;}
     return next;       
    }
    
    public static Weapons clickThree(int n){
    Weapons[] weaponArray = {new Weapons("Silver Daggers","Stealth +","These daggers can pierce the heart of any creature without a sound."),
    new Weapons("Broadsword","Swordsmanship +","On the hilt, you can make out the faintest writing: E-X-C-A-L..."),
    new Weapons("Drakul-to-English Dictionary","Diplomacy +","'Drakul?'  Is that the dragon language?  This will come in handy."),
    new Weapons("Crystal Staff","Magic +","The crystal at the end of the staff glows with an unearthly light.")};
    //Similar to clickTwo, we declare and instantiate an array of Weapons.
    
    Weapons w = weaponArray[n];
    w.setStats(w.getStats());
    //Weapons are different from Items in that the magnitude of their stats are randomly generated using the setStats method.
    
    return w;}
    
    public static Armor clickFour(int n){
    Armor[] armorArray = {new Armor("Leather Catsuit","Stealth +","This catsuit is excellent for sneaking around."),
    new Armor("Breastplate","Swordsmanship +","No sword can pierce this breastplate, or claws for that matter!"),
    new Armor("Ballgown","Diplomacy +","You are the next Queen and you will be treated as such."),
    new Armor("Silk Robes","Magic +","These robes are said to enhance your spellcasting.")};
    //This is our array of Armor
    
    Armor a = armorArray[n];
    a.setStats(a.getStats());
    //Like Weapons, the magnitude of an Armor's stat is set by using the setStats method
    
    return a;}
    
    //This resets our static variables to their original form.  We use this when we want to replay the game.
    public static void reset(){
    sneakCount = 0;
    fightCount = 8;
    diplomacyCount = 16;
    magicCount = 24;}
 }