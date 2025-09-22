import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        // TASK 1
        String name;
        int age;
        int heightInMeters;
        float weightInPounds;
        int jerseyNum;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your height: ");
        heightInMeters = sc.nextInt();
        System.out.print("Enter your weight: ");
        weightInPounds = sc.nextFloat();
        System.out.print("Enter your jersey num: ");
        jerseyNum = sc.nextInt();

        System.out.println();

        System.out.println("Player Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height - " + heightInMeters + "m");
        System.out.println("Weight - " + weightInPounds + "lbs");
        System.out.println("Jersey Number - " + jerseyNum);

        System.out.println();

        // TASK 2
        final float POUND = 0.45359237f;
        final int METER = 100;

        float weightInKilos = weightInPounds * POUND;
        int heightInCentiMeters = heightInMeters * METER;

        int roundedWeightInKilos = (int) weightInKilos;
        System.out.println("Player Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height - " + heightInCentiMeters + "cm");
        System.out.println("Weight - " + roundedWeightInKilos + "kg");
        System.out.println("Jersey Number - " + jerseyNum);

        System.out.println();

        // TASK 3
        System.out.println("Player's age - " + age);
        age++;
        jerseyNum--;

        System.out.println("New Age - " + age);
        System.out.println("New Jersey Number - " + jerseyNum);

        System.out.println();

        // TASK 4
        // 1.
        if (age >= 18 && age <= 35 && roundedWeightInKilos < 90) {
            System.out.println("Eligibility - Eligible");
        }
        else {
            System.out.println("Eligibility - Not eligible");
        }

        // 2.
        if (age < 18 || roundedWeightInKilos >= 90) {
            System.out.println("Player has a problem (either too young or too heavy)");
        }

        // 3.
        if (!(age >= 18 && age <= 35 && roundedWeightInKilos < 90)) {
            System.out.println("Eligibility - Not Eligible");
        }

        // Verbose testing with different values of age and weight
        // int dummyAge = 25;
        // int dummyWeight = 75;
        // if (!(dummyAge >= 18 && age <= 35 && dummyWeight < 90)) {
        //     System.out.println("Not Eligible");
        // }

        System.out.println();

        // TASK 5
        if (age < 20) {
            System.out.println("Category - Rising Star");
        }
        else if (age <= 30) {
            System.out.println("Category - Prime Player");
        }
        else {
            System.out.println("Category - Veteran");
        }

        System.out.println();

        // TASK 6
        System.out.println("Enter the player's jersey number:");
        int coachInput = sc.nextInt();

        switch(coachInput) {
            case 1 -> System.out.println("Position - GoalKeeper");
            case 2 -> System.out.println("Position - defender");
            case 6 -> System.out.println("Position - midfielder");
            case 7 -> System.out.println("Position - Winger");
            case 9 -> System.out.println("Position - Striker");
            case 10 -> System.out.println("Position - Playmaker");
            case 11 -> System.out.println("Position - Winger");
            case 5 -> System.out.println("Position - defender");
            case 8 -> System.out.println("Position - midfielder");
            default -> System.out.println("Player position not known");
        }

        System.out.println();

        // TASK 7
        // PART A
        System.out.println("Enter the player's jersey number (7.a):");
        coachInput = sc.nextInt();

        switch(coachInput) {
            case 1:
                System.out.println("Position - GoalKeeper");
                break;
            case 2:
                System.out.println("Position - defender");
            case 6:
                System.out.println("Position - midfielder");
            case 7:
                System.out.println("Position - Winger");
            case 9:
                System.out.println("Position - Striker");
                break;
            case 10:
                System.out.println("Position - Playmaker");
                break;
            case 11:
                System.out.println("Position - Winger");
                break;
            case 5:
                System.out.println("Position - defender");
                break;
            case 8:
                System.out.println("Position - midfielder");
                break;
            default:
                System.out.println("Player position not known");
                break;
        }

        // PART B
        System.out.println("Enter the player's jersey number (7.b):");
        coachInput = sc.nextInt();

        switch(coachInput) {
            case 1:
                System.out.println("Position - GoalKeeper");
                break;
            case 2,5:
                System.out.println("Position - defender");
                break;
            case 6, 8:
                System.out.println("Position - midfielder");
                break;
            case 7, 11:
                System.out.println("Position - Winger");
                break;
            case 9:
                System.out.println("Position - Striker");
                break;
            case 10:
                System.out.println("Position - Playmaker");
                break;
            default:
                System.out.println("Player position not known");
                break;
        }

        System.out.println();

        // TASK 8
        if (age >= 20 && age <= 30) {
            if (roundedWeightInKilos < 80) {
                System.out.println("Lineup Decision - starting lineup");
            } else {
                System.out.println("Lineup Decision - bench");
            }
        } else {
            System.out.println("Lineup Decision - bench");
        }

        System.out.println();

        // TASK 9
        boolean isEligible = (age >= 18 && age <= 35 && roundedWeightInKilos < 90) ? true : false;
        if (isEligible) {
            System.out.println("Final Decision - Play");
        }
        else {
            System.out.println("Final Decision - Rest");
        }
    }
}
