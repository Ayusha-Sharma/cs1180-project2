import java.util.Scanner;
import java.util.Random;

    public class SimonSays {
            public static void main(String[] args) {
                System.out.println("Let's play Simon Says!");
                startGame();
            }

            public static void startGame(){
                Scanner input = new Scanner(System.in);
                System.out.println("Select difficulty (easy / hard):");
                //remove white space
                String difficulty = cleanInput(input.nextLine());

                if (difficulty.equals("easy")){
                    playEasyMode();
                } else if (difficulty.equals("hard")){
                    playHardMode();
                } else {
                    System.out.println("Invalid difficulty");
                    startGame(); // invalid choices are rejected until the user enters valid choice
                }
            }

            public static void playEasyMode() {
                System.out.println("Easy mode - colors");
                int score = 0;
                easyMode(score);
            }

            public static void hardMode(int score){
                String numChoices = "0,1,2,3,4,5,6,7,8,9";
                StringBuilder simonOptions = new StringBuilder();
                // max choices 3 digits
                int optionCount = Math.min(score, 2);
                for (int i = 0; i <= optionCount; i++) {
                    simonOptions.append(getRandomValue(numChoices)).append(" ");
                }

                String cleanSimonOptions = cleanInput(simonOptions.toString());

                System.out.println("Simon says: " + simonOptions);
                pauseClear();
                System.out.println("Player repeats:");
                Scanner input = new Scanner(System.in);

                String rawResponse = input.nextLine();
                String cleanResponse = cleanInput(rawResponse);

                if (cleanResponse.equals(cleanSimonOptions)) {
                    // correct response
                    score= score + 1;
                    System.out.println("Score: " + score);
                    repeatHardMode(score);
                } else {
                    // wrong response
                    System.out.println("Round over! Your score was " + score);
                    String playAnotherRound = "";
                    /* user can choose if they want to play again;
                     * invalid choices are rejected
                     * until the user enters valid choice
                     */
                    while (!playAnotherRound.equalsIgnoreCase("yes") && !playAnotherRound.equalsIgnoreCase("no")) {
                        System.out.println("Would you like to play another round? (yes / no)");
                        playAnotherRound = input.nextLine();
                        if (playAnotherRound.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing!");
                        } else if (playAnotherRound.equalsIgnoreCase("yes")) {
                            startGame();
                        }
                    }
                }
            }

            public static void easyMode(int score) {
                String colorChoices = "red,blue,green,yellow";
                StringBuilder simonOptions = new StringBuilder();
                // max choices 4 colors
                int optionCount = Math.min(score, 3);
                for (int i = 0; i <= optionCount; i++) {
                    simonOptions.append(getRandomValue(colorChoices)).append(" ");

                }
                // remove white spaces  and converts to lower case
                String cleanSimonOptions = cleanInput(simonOptions.toString());

                System.out.println("Simon says: " + simonOptions);
                pauseClear();
                System.out.println("Player repeats:");
                Scanner input = new Scanner(System.in);

                String rawResponse = input.nextLine();
                String response = cleanInput(rawResponse);
                if (response.equals(cleanSimonOptions)) {
                    // correct response
                    score = score + 1;
                    System.out.println("Score: " + score);
                    repeatEasyMode(score);
                } else {
                    // wrong response
                    System.out.println("Round over! Your score was " + score);
                    String playAnotherRound = "";
                    /* user can choose if they want to play again;
                     * invalid choices are rejected
                     * until the user enters valid choice
                     */
                    while (!playAnotherRound.equalsIgnoreCase("yes") && !playAnotherRound.equalsIgnoreCase("no")) {
                        System.out.println("Would you like to play another round? (yes / no)");
                        playAnotherRound = input.nextLine();

                        if (playAnotherRound.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing!");
                        } else if (playAnotherRound.equalsIgnoreCase("yes")) {
                            startGame();
                        }
                    }

                }
            }

            //repeat game until round over for easy mode
            public static void repeatEasyMode(int score) {
                easyMode(score);
            }

            //repeat game until rou,nd over for hard mode
            public static void repeatHardMode(int score) {
                hardMode(score);
            }

            //method to remove all white space and convert to lower case
            public static String cleanInput(String input) {
                return input.toLowerCase().replaceAll("\\s+", "");
            }

            public static void playHardMode() {
                System.out.println("Hard mode - numbers");
                int score = 0;
                hardMode(score);
            }

            // method to get random choice from given comma separated values
            public static String getRandomValue(String csv) {
                Random random = new Random();
                int count = 1;

                // Count how many items (based on commas)
                for (int i = 0; i < csv.length(); i++) {
                    if (csv.charAt(i) == ',') {
                        count++;
                    }
                }

                // Pick a random position (1 to count)
                int randomIndex = random.nextInt(count) + 1;

                // Extract that word without splitting into an array
                int start = 0;
                int wordNum = 1;
                for (int i = 0; i <= csv.length(); i++) {
                    if (i == csv.length() || csv.charAt(i) == ',') {
                        if (wordNum == randomIndex) {
                            return csv.substring(start, i).trim();
                        }
                        start = i + 1;
                        wordNum++;
                    }
                }
                return "";
            }

            // method to wait for 3 seconds before clearing the screen (ie. print 100 lines)
            public static void pauseClear() {
                try {
                    System.out.print("3... ");
                    Thread.sleep(1000);
                    System.out.print("2... ");
                    Thread.sleep(1000);
                    System.out.print("1... ");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // ignore
                }
                for (int i = 0; i < 100; i++) {
                    // print 100 new lines
                    System.out.println();
                }
            }

        }