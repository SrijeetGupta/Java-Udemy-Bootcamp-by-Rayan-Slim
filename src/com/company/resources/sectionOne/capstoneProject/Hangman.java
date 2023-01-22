package com.company.resources.sectionOne.capstoneProject;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        final int numberOfWords = words.length;
        Random rand = new Random();
        int generatedWord = rand.nextInt(numberOfWords);
        boolean wordComplete = false;
        boolean guessMadeBefore = false;

        Scanner keyboard = new Scanner(System.in);
        String guessedLetter = null;

        String selectedWord = words[generatedWord];
        int numberOfGuesses = gallows.length;
        int incorrectGuessCount = 0;
        String guessOutput = new String();

        System.out.println("The generated word in this run is: " + selectedWord +  "\n\n");

        System.out.println(gallows[incorrectGuessCount]);
        for(int i = 0; i < selectedWord.length(); i++){
            guessOutput += "*";
        }
        System.out.println(guessOutput);
        StringBuilder string = new StringBuilder(guessOutput);

        Boolean guessPresentOnce = false;
        while(incorrectGuessCount < (gallows.length - 1) && wordComplete != true){
            System.out.println("Guess a letter in the word");
            guessedLetter = keyboard.nextLine();
            for(int i = 0; i < selectedWord.length(); i++){
                if(string.charAt(i) != '*'){
                    if(string.charAt(i) == guessedLetter.charAt(0)) {
                        guessPresentOnce = true;
                        guessMadeBefore = true;
                    }
                }
               else if(selectedWord.charAt(i) == guessedLetter.charAt(0)){
                    string.setCharAt(i,selectedWord.charAt((i)));
                    guessPresentOnce = true;
                }
            }
            if(guessPresentOnce){
                if(guessMadeBefore){
                    incorrectGuessCount++;
                    System.out.println("Guess made already.");
                    System.out.println(gallows[incorrectGuessCount]);
                }

            } else {
                incorrectGuessCount++;
                System.out.println("Guess incorrect!");
                System.out.println(gallows[incorrectGuessCount]);
            }
            guessPresentOnce = false;
            guessMadeBefore = false;
            System.out.println("Guess: " + string);

            if(incorrectGuessCount == (gallows.length - 1)){
                System.out.println("Game over. incorrect guesses ran out the gallows.");
                break;
            }
            for(int x = 0; x < selectedWord.length(); x++){
                if(string.charAt(x) == selectedWord.charAt(x)){
                    wordComplete = true;
                } else {
                    wordComplete = false;
                    break;
                }
            }
        }
        System.out.println("Finished! Game won!");


    }

}