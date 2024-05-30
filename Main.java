// import statements
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        // declaration of variables and objects
        Damage test = new Damage();
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> results = new ArrayList<>();
        int attack;
        int defense;
        int level;
        int specialDefense;
        int specialAttack;
        int attackerType;
        int defenderType;
        int defender2Type;
        int basePower;
        int moveType;
        while(true)
        {
            // exit condition
            System.out.println("Do you want to exit? (Y/N): ");
            if(in.nextLine().equals("Y"))
            {
                break;
            }
            // user input for variables
            System.out.println("What is the attack of the attacker: ");
            attack = in.nextInt();
            in.nextLine();
            System.out.println("What is the defense of the defender: ");
            defense = in.nextInt();
            in.nextLine();
            System.out.println("What is the special attack of the attacker: ");
            specialAttack = in.nextInt();
            in.nextLine();
            System.out.println("What is the special defense of the defender: ");
            specialDefense = in.nextInt();
            in.nextLine();
            System.out.println("What is the level of the attacker: ");
            level = in.nextInt();
            in.nextLine();
            System.out.println("""
                    0: typeless
                    1: normal
                    2: fighting
                    3: flying
                    4: poison
                    5: ground
                    6: rock
                    7: bug
                    8: ghost
                    9: steel
                    10: fire
                    11: water
                    12: grass
                    13: electric
                    14: psychic
                    15: ice
                    16: dragon
                    17: dark
                    18: fairy""");
            System.out.println("What is the type of the attacker: (Integer, based on the list above) ");
            attackerType = in.nextInt();
            in.nextLine();
            System.out.println("What is the first type of the defender: (Integer, based on the list above) ");
            defenderType = in.nextInt();
            in.nextLine();
            System.out.println("What is the second type of the defender: (Integer, based on the list above) ");
            defender2Type = in.nextInt();
            in.nextLine();
            System.out.println("What is the base power of the move? ");
            basePower = in.nextInt();
            in.nextLine();
            System.out.println("What is the type of the move? ");
            moveType = in.nextInt();
            in.nextLine();
            // determines if move is special or not
            System.out.println("Special moves will have random damage.");
            System.out.println("Is the move a special move? (Y/N): ");
            if(in.nextLine().equals("Y"))
            {
                SpecialMove temp = new SpecialMove(basePower, moveType, (int) (Math.random() * 0.15));
                System.out.println(test.damageCalculator(specialAttack, specialDefense, level, attackerType, defenderType, defender2Type, temp));
                results.add(test.damageCalculator(specialAttack, specialDefense, level, attackerType, defenderType, defender2Type, temp));
            }
            else
            {
                AttackMove temp = new AttackMove(basePower, moveType);
                System.out.println(test.damageCalculator(attack, defense, level, attackerType, defenderType, defender2Type, temp));
                results.add(test.damageCalculator(specialAttack, specialDefense, level, attackerType, defenderType, defender2Type, temp));
            }
        }
        // prints out the results from the arraylist
        System.out.println("Results:");
        for(int element: results)
        {
            System.out.println(element);
        }
    }
}