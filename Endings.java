public class Endings{

//Static method theEnd takes in a loaad of information and then will determine which of the 25 different endings you get.  n is your final
//choice, s, f, d, and m are your stats, w is the name of your weapon, and name is your player name.  You have a final choice between
//sneaking out, fighting your way out, using diplomacy, or using magic.  If your main stat is over 30, you get the first ending for your choice.
//If your main stat is over 20 and a secondary stat is over 15, then you can get other endings.  If you don't qualify for any of those, then
//you get one of the "bad" endings.
    
public static String theEnd(int n, int s, int f, int d, int m, String w, String name){
String str = " ";
switch (n){
    case 0:
        if (s>=30)
            str = "You use all your skills to sneak past the dragon, taking up position\n"
                    + "in the forest just beyond the castle walls.  When the wizard arrives,\n"
                    + "you are ready for him.  You sneak up behind him before he can react, and\n"
                    + "with one firm stroke of your "+w+", slit his throat.\n\n"
                    + "You return home, taking your place as Queen.  As the years go by, your\n"
                    + "kingdom slowly grows, thanks to a rash of mysterious deaths that seem to\n"
                    + "plague the surrounding nobility.  Although none can be connected to you,\n"
                    + "rumors continue to be circulated even after your death, continuing the\n"
                    + "legacy of the Thrice-Widowed Queen, "+name+".";
        else if (s>=20&&f>=15)
            str = w+" in hand, you approach the dragon, hoping to attack her from behind before\n"
                    + "she realizes you're there.  Unfortunately your plan fails; the dragon attacks,\n"
                    + "and the two of you are joined in battle.  Using all of your agility, you\n"
                    + "manage to stay one step ahead of the beast, gradually wearing her down until\n"
                    + "you can strike the fatal blow.\n\n"
                    + "Unfortunately, your battle takes too long.  The wizard arrives just as you\n"
                    + "finish.  Exhausted and wounded, you are unable to prevent him from seizing\n"
                    + "you and pouring a mysterious potion down your throat.  After that, you know\n"
                    + "no more.\n\n"
                    + "The wizard rules for decades, your blank, doll-like body by his side.  Your\n"
                    + "people tell tales of your devotion to your husband, which was so great that\n"
                    + "when he finally died, your empty shell followed him within the day, naming you\n"
                    + "Queen "+name+" the Faithful.";
        else if (s>=20&&d<=15)
            str = "You manage to sneak past the dragon, wandering through the woods until you\n"
                    + "make it to a village.  Once there, you rally your people, calling for\n"
                    + "their support.  You don't have time to wait for your country to come\n"
                    + "to your aid - once you have gathered enough men for an army, you march\n"
                    + "on the wizard's stronghold.\n\n"
                    + "You are ill-equipped and undertrained.  The majority of your army is made\n"
                    + "up of farmers and laborers.  When you arrive at the castle, the dragon is\n"
                    + "waiting for you.  Your men fall by the dozen at the mercy of her claws.\n\n"
                    + "During the melee, you manage to spot the wizard, casting spells at a distance.\n"
                    + "You use every once of stealth that you posess to creep closer, until finally\n"
                    + "you are within striking distance.  You land the fatal blow just as the dragon\n"
                    + "finishes off the remainded of your ragtag army.\n\n"
                    + "As the dragon comes for you, you lay on the bloody ground and hope that your\n"
                    + "death will be swift.  It is.  The legend of your hopeless battle grows, and\n"
                    + "eventually you are remembered only as the Doomed Queen "+name+".";
        else if (s>=20&&m>=15)
            str = "Before attempting to sneak away, you take a moment to study the dragon keeping\n"
                    + "you captive.  There is a golden collar around her neck, and though you lack\n"
                    + "the power to remove it, you think that you may be able to alter it slightly.\n\n"
                    + "When the wizard arrives, you're waiting for him - both of you.  The dragon's\n"
                    + "eyes glow green as you use the magic of the collar to force her to attack her\n"
                    + "master, devouring him before he can even murmur a spell.\n\n"
                    + "You return home, your new pet by your side.  With her power, you solidify your\n"
                    + "grasp on your kingdom, daring anyone to try and unseat you.  You rule through\n"
                    + "threats and fear, and people refer to you as Queen "+name+" the Wicked, though\n"
                    + "not where they think you can hear them.";
        else if (d>=20)
            str = "You creep closer to the dragon, whispering honeyed words in her ears.  'Join with me,'\n"
                    + " you say.  'I will free you from your bondage and ensure that no one will ever\n"
                    + "control you again.'  It doesn't take much to convince her.  When the wizard arrives,\n"
                    + "the dragon stays back, allowing you to ambush him.  Upon his deat, the enchanted\n"
                    + "collar drops from her neck with a sudden snap.\n\n"
                    + "The two of you return to your castle, and you take your rightful place as queen.  You\n"
                    + "amuse yourself throughout your reign by playing your neighbors against each other,\n"
                    + "keeping them in a constant state of war amongst themselves.  Behind your back, they\n"
                    + "whisper each other about "+name+", the Shadow Empress, and her pet dragon.  More loyal\n"
                    + "than any, she stays with you all those years, only leaving the kingdom upon your death.";
        else
            str = "You attempt to sneak away, but the dragon spots you.  She pins you down with one giant claw,\n"
                    + "keeping you from running until the wizard has arrived.  With a echoing cackle, shackles\n"
                    + "appear on your arms and legs, and when you finally return to your home it is in chains,\n"
                    + "as the wizard's slave.  You have a long and miserable life as the wizard's unwilling\n"
                    + "consort, known only as 'Queen' "+name+".";
        return str;
    case 1:
        if (f>=30)
            str = "You slay the dragon and escape from the castle before the wizard arrives.\n"
                    + "Your kingdom welcomes you back with open arms, and the next time the wizard\n"
                    + "shows his face you are there to greet him, "+w+" in hand.\n\n"
                    + "Your reign is long, but bloody.  You war on friend and foe alike,\n"
                    + "conquering many kingsdoms in your lust for power.  In the end, you are\n"
                    + "remembered in the history books as "+name+" the Conqueror. ";
        else if (f>=20&&s>=15)
            str = "You fight the dragon, but are unable to deliver a decisive blow!  Finally, hearing\n"
                    + "the wizard approach, you stab the dragon through her foot and escape into the woods.\n\n"
                    + "You wander the forest for days before making your way to a nearby village where you\n"
                    + "hear the grim news: Your kingdom has been conquered.  The wizard who abducted you\n"
                    + "rules as king.\n\n"
                    + "You do not give up.  It takes time, and money, but eventually you are able to find\n"
                    + "a way into the wizard’s castle - your former home.  Standing over him as he sleeps,\n"
                    +w+" in hand, you feel only fierce satisfaction as you end his miserable life for good.\n\n"
                    + "Your reign begins in bloodshed, and in bloodshed it ends, as the surrounding kingdoms\n"
                    + "band together to fight against you.  Piece by piece, your kingdom is carved away,\n"
                    + "until finally there is nothing left for you to fight for.  You go down in history as\n"
                    + name+" the Usurper.";
        else if (f>=20&&d>=15)
            str = "You fight the dragon, but your days spent locked in study have left you too weak to penetrate\n"
                    + "the beast's scales.  Finally, hearing the wizard approaching, you slash across the dragon's\n"
                    + "eyes with all your might and escape.  You make your way to a nearby village where you can\n"
                    + "rest and begin the long, difficult task of raising an army.\n\n"
                    + "It takes time for you to rally those loyal to you - time that the wizard uses to cement his\n"
                    + "hold on your kingdom.  While many flock to your banner, many more choose to side with him.\n"
                    + "When it finally arrives, the battle is fierce, and though the wizard is eventually slain,\n"
                    + "the pieces left behind by the civil war cannot be so easily put back together.  You spend\n"
                    + "your life fighting to reconcile countryman with countryman, and are remembered only as\n"
                    +name+" the Ineffective.";
        else if (f>=20&&m>=15)
            str = "You fight the dragon, but you cannot seem to wound her.  She circles around you like a cat\n"
                    + "circling a mouse, toying with you.  In desperation, you cast a spell to create light and\n"
                    + "escape while the beast is blinded.\n\n"
                    + "Despairing at the futility of your battle, you wander the woods for days until you stumble\n"
                    + "across a tower.  Some sorceror in ages past clearly lived here, for in one room is a libary,\n"
                    + "fully stocked with more arcane tomes than you could read in a lifetime.  You resolve to try.\n\n"
                    + "Decades past, and in due time, you find yourself beginning to get rather lonely in your\n"
                    + "solitary confinement.  You resolve to find yourself a companion, and set off into the wide\n"
                    + "world to make it happen.  The wizard's heir is said to be comely; perhaps they could help\n"
                    + "to ease your loneliness...\n\n"
                    + "In the end, you are remembered only as the sorceress who kidnapped your country's beloved\n"
                    + "heir to the throne.";
        else if (m>=20)
            str = "Before beginning the battle, you observe the dragon closely.  There is a collar wrapped\n"
                    + "around her neck that glows with the power of arcane runes.  Perhaps it could be of use to you.\n\n"
                    + "You wave your hand, temporarily dissolving the spells holding the dragon prisoner.\n"
                    + "Freed, she shakes the collar from her neck and flies away, never to be seen again.  When the\n"
                    + "wizard arrives, you are ready for him.  You instantly throw the collar around his neck and\n"
                    + "reactivate the runes.\n\n"
                    + "With the wizard under your control, you return home, claiming your rightful place as queen.\n"
                    + "With the wizard's power joined to your own magical ability, there is no one who can stand\n"
                    + "against you.  You rule for long, fear-filled years, and when you have tired of playing\n"
                    + "politics, you take your mindless consort with you and retreat from the world, where you will\n"
                    + "live out the rest of eternity together as the Sorceress Queen "+name+" and her pet.";
        else
            str = "You fight the dragon, but are unable to deliver a decisive blow.  As the fight goes on, you\n"
                    + "become more and more tired, until finally you are unable to hold your "+w+" up.  With cunning\n"
                    + "eyes, the dragon attacks you once, twice, and then a final time.  Exhausted, your last thought\n"
                    + "as her jaws close around you is that no one will even know you tried.\n\n"
                    + "You are forgotten by the history books, remembered only in folk song as the Lost Princess, "+name+".";
        return str;
    case 2:
        if (d>=30)
            str = "You have trained for this moment.  Your army is ready, waiting only for your approval.  But you\n"
                    + "have one last strategem to try first.\n\n"
                    + "Approaching the dragon, you bow deeply to her, addressing\n"
                    + "her in Drakul, the language of the wyverns.  Amused, she gazes upon you with a contemptuous\n"
                    + "eye, but allows you to speak.  She reveals that the wizard is controlling her using an\n"
                    + "enchanted collar.  Thinking quickly, you broker a deal: you will remove her collar, and\n"
                    + "she will join you as an ally.\n\n"
                    + "When the wizard arrives, the two of you are waiting for him.  He lasts barely long enough\n"
                    + "to scream before the dragon devours him, leaving nothing but a pointy hat behind.  The two\n"
                    + "of you return to your capital at the head of your victorious army.  With your friend at\n"
                    + "your side, you make peace with your neighbors, ushering in a new age of prosperity for\n"
                    + "your kingdom.  Your contributions to a peaceful world lead to your becoming known as\n"
                    + "Queen "+name+", the Peacemaker.";
        else if (d>=20&&s>=15)
            str = "Your army is waiting.  Sneaking past the dragon, you meet up with your generals in the\n"
                    + "woods and plan your strategy.  Once the wizard arrives, your army begins its attack.\n\n"
                    + "Unfortunately, you are facing both a powerful wizard as well as a hungry dragon.\n"
                    + "The dragon devours your men by the dozens, while the wizard fires spells of immense\n"
                    + "power into your ranks.  Eventually, however, strength of numbers wins the day, and the\n"
                    + "two of them are vanquished.\n\n"
                    + "The cost is high.  With his last breath, the wizard lays a curse upon you and your\n"
                    + "kingdom.  With your army in tatters, you limp your way back to your castle and begin\n"
                    + "the onerous task or rebuilding.\n\n"
                    + "Unfortunately, it soon becomes apparent that the wizard's curse was no exageration.\n"
                    + "Crops fail, wells dry up, and plague runs unchecked throughout your land.  Your\n"
                    + "enemies surrend you, carving off chunks of your kingdom and absorbing them into their\n"
                    + "own.  News of the curse spreads, until the tale of the Cursed Queen "+name+" is all\n"
                    + "that is left of you.";
        else if (d>=20&&f>=20)
            str = "Your army is ready.  When the time comes, they attack the dragon enmasse, and you charge\n"
                    + "out from inside to attack her from behind.  You lead your troops bravely, being the\n"
                    + "first to attack and the last to retreat.  Under your dedicated leadership, the dragon\n"
                    + "swiftly falls, and the wizard soon afterward.\n\n"
                    + "Your army has taken losses, but thanks to your bravery many are still left.  You take\n"
                    + "your army and march on the capital, claiming your rightful place as queen.  Then you\n"
                    + "cast your eyes upon your neighbors.\n\n"
                    + "Leading your armies personally, you set out on a mission of conquest, grinding nation\n"
                    + "after nation beneath your heels.  You leave behind a united empire that stretches\n"
                    + "from one sea to the next, and a legacy of violence and warfare that endures even\n"
                    + "after your kingdom is no more.  When people speak of you, it is as the first of a\n"
                    + "long line of Empresses, as Empress "+name+" the Great.";
        else if (d>=20&&m>=15)
            str = "Your army has arrived at last.  You give the signal to attack and they charge, but stand\n"
                    + "chance against the wizard's dragon.  You pause in the middle of casting a fireball\n"
                    + "when a flash of gold catches your eye.  There is a collar around the dragon's neck.\n"
                    + "With no time for a proper examination, you cast a spell that you hope will break\n"
                    + "the enchantment upon it.\n\n"
                    + "With a massive BANG the collar explodes, raining slivers of gold down upon your\n"
                    + "army.  Enraged, the dragon attacks both friend and foe alike.  The wizard casts\n"
                    + "spell after spell, but it's to no avail - with a mighty roar, the dragon opens\n"
                    + "her jaws and swallows him whole.  Revenge accomplished, she flies into the air\n"
                    + "and spews fire down on the tattered remnants of your army before winging off\n"
                    + "into the distance.\n\n"
                    + "You return home to your castle, taking your place as queen.  But it isn't long\n"
                    + "before reports begin to come in: the dragon is canvassing your kingdom, razing\n"
                    + "every town she comes across.  You ride out with the few men you have left, but\n"
                    + "the dragon stays one step ahead of you.  You spend the rest of your life battling\n"
                    + "fruitlessly against her as your kingdom crumbles around you.  In the end, you are\n"
                    + "remembered only as "+name+", the Cinder Queen.";
        else if (f>=20)
            str = "Your idea of diplomacy involves threatening people with your "+w+".  You take up your\n"
                    + "weapon and go to speak with the dragon, making sure that she understands that you\n"
                    + "are only sparing her out of the goodness of your heart.  She is not impressed, but\n"
                    + "agrees to stay back and see how things play out.  Then the wizard arrives.  He is\n"
                    + "expecting a scared princess.  You face him as a warrior queen.\n\n"
                    + "With the wizard's blood still drying on your clothing, you return home and take\n"
                    + "your place as queen.  Your first act is to place the wizard's head outside your castle\n"
                    + "on a pike.  Your second is to gather your army.  Your nobles are corrupt and your\n"
                    + "neighbors are weak and ineffectual.  You will show them the error of their ways.\n\n"
                    + "You begin your war of conquest with a culling of those who stood by and watched\n"
                    + "as the wizard stole you.  By the time you are done, your nobility are a shambles and\n"
                    + "your people's spirit broken.  You rule over a peaceful land, but perhaps not a joyous\n"
                    + "one.  When you die, your people celebrate the end of Queen "+name+" the Unjust.";
        else 
            str = "You approach the dragon cautiously, calling out to her in Drakul.  She tilts her head to one\n"
                    + "side, staring at you.  You can see no sign of understanding in her eyes.  Hands shaking,\n"
                    + "you turn to run, but it is too late.  The dragon leaps for you, pinning you to the ground\n"
                    + "underneath her.\n\n"
                    + "When the wizard arrives several hours later, you try your hardest to reason with him.\n"
                    + "Unfortunately, he is not interested in listening to you.  He offers you the same choice\n"
                    + "he gave you five months ago - marry him, or remain forever inside this castle.  Once more,\n"
                    + "you give him your answer.  With a scornful laugh, he turns and leaves, never to return.\n\n"
                    + "As the years pass, your loneliness weighs upon you more and more.  You grow weaker and weaker,\n"
                    + "unable to concentrate on anything.  Eventually, after many decades of solitude, you go to bed\n"
                    + "one evening and never arise the next morning.  In time, you are remembered only as the Captive\n"
                    + "Princess, "+name+".";
        return str;
    case 3:
        if (m>=30)
            str = "You stare down at the dragon from atop the parapets.  You can see the fragile threads that tie\n"
                    + "her spirit to her body.  Reaching out, you manipulate them gently.  With a sound like a bell,\n"
                    + "the dragon vanishes and a very surprised mouse scampers towards the safety of the caste walls.\n\n"
                    + "You are ready for the wizard when he arrives.  The duel you fight scars the land and fells much\n"
                    + "of the forest, but in the end you are victorious.  Drunk on the joy of power, you repudiate your\n"
                    + "queenship and instead follow the wizard's trail back to his stronghold.\n\n"
                    + "Magical books and objects are scattered around his home like so much clutter.  You could spend\n"
                    + "a lifetime digging through them and still not discover everything they have to teach.  You settle\n"
                    + "down and devote yourself to your craft.  In time, your diligence pays off, and you take on a\n"
                    + "different role in your kingdom, that of the legendary Archmage, "+name+".";
        else if (m>=20&&s>=15)
            str = "You hide in the shadows and study the dragon.  There is a collar around her neck that appears to be\n"
                    + "enchanted.  Staring at it, you come up with a plan.  Now all you need to do is wait.\n\n"
                    + "The wizard arrives shortly afterwards.  As he approaches the castle, you raise your hand\n"
                    + "and whisper a series of eldritch words under your breath.  On the dragon's neck, the collar\n"
                    + "glows with an unearthly light before breaking in two and falling to the ground.\n\n"
                    + "The wizard has no time to react.  Within seconds the dragon is upon him.  You stroll away\n"
                    + "from the castle with his screams still ringing in your ears.\n\n"
                    + "It takes time, but eventually you find a village and from there are able to return to your\n"
                    + "home.  You take your rightful place as queen, ruling with prudence and wisdom.  When you die,\n"
                    + "your people mourn the loss of Queen "+name+" the Wise.";
        else if (m>=20&&f>=15)
            str = "A collar around the dragon's neck catches your eye.  The gleam of a compulsion spell is\n"
                    + "apparent, even from your position safe upon the battlements.  Removing it is a tricky proposition,\n"
                    + "but altering it, that you can manage.  With a wave of your hand, the collar glows like the sun\n"
                    + "for a moment, obscuring everything around in a wave of burst of light.  When the light fades,\n"
                    + "the dragon looks up at you and bows her head.\n\n"
                    + "You see no point in waiting for the wizard to return.  Instead, you decide to take the fight\n"
                    + "to him.  With your new servant carrying you, you quickly fly to the wizard's stronghold,\n"
                    + "surprising him just as he was preparing to leave.  Your dragon makes short work of him, and\n"
                    + "soon all that is left is a bloodstained hat lying on the ground.\n\n"
                    + "You return home and take your place as queen, but boredom soon sets in.  You look at the\n"
                    + "kingdoms surrounding you, many of which are home to some of the greatest arcane artifacts\n"
                    + "ever created, and you plan.  When the time comes, you strike swiftly, conquering your\n"
                    + "neighbors in brutal fashion, and taking their treasures for your own.  You amass the\n"
                    + "greatest collection of magical artifacts ever known, making your own land prosperous\n"
                    + "beyond belief.  Unfortunately accumulating that much magical power together in one place\n"
                    + "has its hazards.  An ill-timed fall is all it takes to cause two items to collide which\n"
                    + "should never have been brought together, and in the end the reign of Queen "+name+" the\n"
                    + "Rapacious ends the same way as it began: with dragonfire and magic.";
        else if (m>=20&&d>=15)
            str = "You approach the dragon cautiously.  Studying her, you notice a collar around her neck that\n"
                    + "gleams with the weight of the spells on it.  This must be how the wizard is controlling her.\n"
                    + "Perhaps there is a bargain to be made here.\n\n"
                    + "You offer her a deal: You will remove the collar from around her provided that she agrees to\n"
                    + "kill the wizard for you.  With a cunning gleam in her eye, the dragon agrees, and you begin\n"
                    + "the spell.  With a sound like the ringing of bells the collar drops from around her neck, now\n"
                    + "merely a worthless trinket.  When the wizard arrives, the dragon is waiting for him, and she\n"
                    + "is hungry.  His death is not quick.\n\n"
                    + "You bow to the dragon, and she inclines her head regally towards you before flying off.  You\n"
                    + "make your way back to your castle and take your place as queen.  You rule wisely and well, and\n"
                    + "for the length of your reign there is peace between your kingdom and the wild drakes who live\n"
                    + "in the mountains nearby.  You are known to all, and beloved as Queen "+name+", Drake-Friend.";
        else if (s>=20)
            str = "You hide in the shadows, waiting for the wizard to arrive.  When he finally enters the castle, it\n"
                    + "is close to nightfall.  He hunts for you throughout the living area, but when he cannot locate\n"
                    + "you he settles down to dinner, content in the knowledge that hunger will soon drive you out.  As\n"
                    + "he eats, his eyes grow heavier and heavier, and eventually he falls down upon his own dinner\n"
                    + "table, his breaths coming slower and slower until eventually he breathes his last.  You smirk.\n"
                    + "Perhaps if he had checked the basement first he would have come across your magical laboratory,\n"
                    + "with several poisons still brewing on the hearth.\n\n"
                    + "Freed by the wizard’s death, the dragon flies away, never to return.  You consider returning to\n"
                    + "your home and taking your place as queen, but the idea of ruling holds no joy for you now.  You\n"
                    + "know what true power is, and it is not found on a throne.  You take your poisons and vials and\n"
                    + "depart.  In years to come, rumors swirl of a new assassin stalking the land.  Your name is never\n"
                    + "spoken, only whispered in dark places: "+name+", the Dark Lady.";
        else
            str = "Approaching the dragon fearlessly, you ready your spell.  You will not be stopped by an overgrown\n"
                    + "lizard!  Your hands glow red and the arcane power builds and builds, until it inevitably erupts\n"
                    + "with devastating consequences.  When the dust clears, the dragon is still there, but now where you\n"
                    + "were standing, there is only a small, bright green frog.  With a ribbit of terror, you hop away,\n"
                    + "crossing the forest in a series of small journeys, avoiding predators and hopping from pond to\n"
                    + "pond until you eventually arrive at a village.\n\n"
                    + "You bide your time on the outskirts, waiting for an impressionable youth to come close.  Finally\n"
                    + "you seize your chance, revealing yourself to a young man who wanders close to your bog.  You\n"
                    + "reveal your identity to him and beg for his help breaking the curse.  Hesitantly, he lifts you up\n"
                    + "to his face and kisses you.\n\n"
                    + "At once there is a bright light and a cloud of smoke.  When the smoke clears, where once one frog\n"
                    + "stood, now there are two!  You may be cursed, but at least you won’t be lonely anymore.  With no\n"
                    + "choices left, the two of you return to the forest, settling down in a nearby pond and raising your\n"
                    + "tadpoles in solitude.  Over the years, rumors of your fate spread across the kingdom, until you\n"
                    + "are known only as "+name+", the Frog Princess.";
        
        return str;
}
return str;}
}