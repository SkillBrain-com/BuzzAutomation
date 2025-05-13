package homework.edinita.javaPart2.dungeon;

import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Random random = new Random();


        //character
        int health = 100;
        int atack = random.nextInt(12, 23);
        int hp = random.nextInt(1, 3);
        int hpValue = random.nextInt(11, 27);
        int chanceHp = 50; //percent


        //enemy
        String[] enemy = {"Zombie", "Skeleton", "Warrior", "Assassin"};
        int maxhealthEnemy = 100;
        int atackEnemy = random.nextInt(6, 23);


        boolean gameRun = true;
        System.out.println("____commands____\n");
        System.out.println("PRESS 'f' == attack");
        System.out.println("PRESS 'g' == heal");
        System.out.println("PRESS 'h' == run_away\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t                                      WELCOM         TO            THE               ASH");


        GAME:
        while (gameRun) {

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t-------------------------------------------------------------------------------------------------------------------------------\n");

            int healthEnemy = random.nextInt(maxhealthEnemy);
            String enemyOut = enemy [random.nextInt(enemy.length)];
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t#" + enemyOut + "#" + " \tits out, you can imagine the enemy" + "\n\n");

            while (healthEnemy > 0){

                System.out.println("\t\t\t\t\t\t\t\t\t\t\tyourHealth______ " + health);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tHEALTH-> " + enemyOut + "______  ~~~" + healthEnemy + "~~~   §you know this creature§   ||||||  --__-- ||||||  .....Haha ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\there is what you can do............\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t-------------------------------------------------------------------------------------------------------------------------------\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  §§§§§§§§§§§§§§§§§§      AaaaaaATttttttAAaACccccKKKKKKkkkkk !!!!!!!!!!!!!!!      \n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tthis is what i should always do");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t--_i_--\n\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t              §§§§§§§§§§§§§§§§§§      use your thing... you know, get potent?!        §§§§§§§§§§§§§§§§§§\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tbut you know, you need to check your health first, you don't wanna use a health regen");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tif you are full hp... DDDHHAAAAAAAA");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t--_i_--\n\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t____________________aannndddd____________________\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t            §§§§§§§§§§§§§§§§§§        RRRRRRRRRR UUUUUUUUU NNNNNNNNNNNNNNNNNNNN !!!!!!!!!!!!!!!!      §§§§§§§§§§§§§§§§§§\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tcmon... dont RUN. unless you must do!");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t--__--\n\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t-------------------------------------------------------------------------------------------------------------------------------\n");


                String input = scanner.nextLine();


                // #################################

                if (input.equals("f")){
                    // for atack
                    System.out.println("____commands____\n");
                    System.out.println("PRESS 'f' == attack");
                    System.out.println("PRESS 'g' == heal");
                    System.out.println("PRESS 'h' == run_away\n");


                    int atackDamage = random.nextInt(atack);
                    int damageTaken = random.nextInt(atackEnemy);


                    healthEnemy -= atackDamage;
                    health -= damageTaken;

                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t################################################## NOW you fight, you got this!!! ##################################################");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t||| you hit the  ->" + enemyOut +"<-    for " + atackDamage + " hp, nice choice btw.. |||");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t||| you took -" + damageTaken + " hp from your health BROO, _____watch OUTT!!!_____ |||\n");


                    if (health < 10){
                        System.out.println("you got beatten dude, let's get home.....");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t--_i_--     --_i_--     --_i_--     --_i_--     --_i_--     --_i_--     --_i_--\n\n\n");
                        break;
                    }


                    // ##############################


                } else if (input.equals("g")){
                    // hp regen
                    System.out.println("____commands____\n");
                    System.out.println("PRESS 'f' == attack");
                    System.out.println("PRESS 'g' == heal");
                    System.out.println("PRESS 'h' == run_away\n");


                    if (hp > 0){
                        health += hpValue;
                        hp--;
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\tyou got pumped up Yo!!");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\tyour health was increase by ~~~" + hpValue + "~~~ how u feel now!?");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\tnow you have ~~~" + health + "~~~ flesh");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t--_i_--\n");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\tbtw... you have ~~~" + hp + "~~~ left\n");
                    }else {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\tu ran out of potent potions... but, you can defeat an enemy and loot him, maybe he has some, huh?!");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t--_i_--\n");
                    }



                    // ##############################


                }else if (input.equals("h")){
                    // run
                    System.out.println("____commands____\n");
                    System.out.println("PRESS 'f' == attack");
                    System.out.println("PRESS 'g' == heal");
                    System.out.println("PRESS 'h' == run_away\n");


                    System.out.println("\t\t\t\t\t\t\t\t\t\t\tu RRRaaaaNNNN?!?!?! ...... --__-- ......");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\tmaybe this " + enemyOut + " was imagined too big, right, ok.\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\tyou did the right thing tho! <3");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t--_i_--\n");

                    continue GAME;


                }else {
                    // dont know
                    System.out.println("____commands____\n");
                    System.out.println("PRESS 'f' == attack");
                    System.out.println("PRESS 'g' == heal");
                    System.out.println("PRESS 'h' == run_away\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\tdon't know what you mean, i don't know that spoken language.");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t--_i_--\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\tall i know is character     'f'      which gonna be translated to ....");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  §§§§ you should fight no matter what §§§§\n\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\tor the character    'g'     which gonna be translated to ....");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t              §§§§ pump yourself if you can with some hp regen §§§§\n\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\tor the character     'h'      which gonna be translated to ....");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t                      §§§§ RUN the f*** away §§§§\n\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t--_i_--");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t-------------------------------------------------------------------------------------------------------------------------------\n");


                }
            }

            if (health < 1) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t      $$$$$$$$$$$$$$$$$$$$$$$$$$      you now obey to the ash         $$$$$$$$$$$$$$$$$$$$$$$$$$");
                break;
            }

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t-------------------------------------------------------------------------------------------------------------------------------\n");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t-> " + enemyOut + " <-      was been defeated ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tyou got " + health + " hp, after that fight between you and " + enemyOut + " well done dude!!!!");

            if(random.nextInt(100) < chanceHp){
                hp++;
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tu looted the corpse and found a potion");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tnow you have ~~" + hp +"~~ potions");
            }

            System.out.println("\t\t\t\t\t\t\t\t\t\t\tu wanna escape from the ash or not?");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tress 'q' for exit");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tpress 'e' to stay in here\n\n\n");
            String input = scanner.nextLine();


            while (!input.equals("e") && !input.equals("q")){
                System.out.println("\t\t\t\t\t\t\t\t\t\t\ti don't undestand..... --__--");
                input = scanner.nextLine();
            }

            switch (input){
                case "e": {
                    System.out.println("____commands____\n");
                    System.out.println("PRESS 'f' == attack");
                    System.out.println("PRESS 'g' == heal");
                    System.out.println("PRESS 'h' == run_away\n");

                    System.out.println("\t\t\t\t\t\t\t\t\t\t\tyeeaahh.. keep fighting!!!\n\n\n");
                    break;
                }
                case "q": {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\tok, rest for now my boi!\n\n\n");
                    break GAME;
                }
            }
        }

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t###############################################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t'                                  thx for your attention!!!!!!");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t###############################################################################################################");
    }
}
