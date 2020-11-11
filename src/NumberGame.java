import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        System.out.println("Guess your number!");
        int number = (int) ((Math.random() * 100 )+1);
        boolean hasWon = false;
        Scanner scanner = new Scanner(System.in);

        for (int tries = 0; tries < 10; tries++) {
            switch (tries){
                case 0:
                    System.out.println("You have 10 tries left.");
                    break;
                case 1:
                    System.out.println("You have " + (10 - tries) + " tries left.");
                    break;
                case 2:
                    System.out.println("You have " + (10 - tries) + " tries left.");
                    break;
                case 3:
                    System.out.println("You have " + (10 - tries) + " tries left.");
                    break;
                case 4:
                    System.out.println("You have " + (10 - tries) + " tries left.");
                    break;
                case 5:
                    System.out.println("You have " + (10 - tries) + " tries left. Half way through.");
                    break;
                case 6:
                    System.out.println("You have " + (10 - tries) + " tries left. Fool.");
                    break;
                case 7:
                    System.out.println("You have " + (10 - tries) + " tries left. Someone there?");
                    break;
                case 8:
                    System.out.println("You have " + (10 - tries) + " tries left. Are you trying?");
                    break;
                case 9:
                    System.out.println("You have " + (tries - 1) + " tries left. Oh boy, that's your last try...");
                    break;
            };
            int guess = scanner.nextInt();

            if(number < guess){
                System.out.println("The number " + guess + " was too high you fool!");
            } else if(number > guess) {
            }else {
                hasWon = true;
                break;
            }
        }

        if(hasWon){
            System.out.println("And you feel that you have exerted your very best efforts in this matter, do you? You were right! The number was " + number + ".");
        } else {
            System.out.println("And you feel that you have exerted your very best efforts in this matter, do you? Be ashamed! The number was " + number + ".");
        }
    }
}
