import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();

    // Getters:
    public String getStory(){
        return story;
    }

    public String getName(){
        return name;
    }

    public String getAdjective1(){
        return adjective1;
    }

    public String getAdjective2(){
        return adjective2;
    }

    public String getNoun1(){
        return noun1;
    }

    public String getNoun2(){
        return noun2;
    }

    public String getNoun3(){
        return noun3;
    }

    public String getAdverb(){
        return adverb;
    }

    public String getRandomNums(){
        return randomNums;
    }

    // Setters:
    public void setStory(String newStory){
        this.story = newStory;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAdjective1(String newAdjective1){
        this.adjective1 = newAdjective1;
    }

    public void setAdjective2(String newAdjective2){
        this.adjective2 = newAdjective2;
    }

    public void setNoun1(String newNoun1){
        this.noun1 = newNoun1;
    }

    public void setNoun2(String newNoun2) {
        this.noun2 = newNoun2;
    }

    public void setNoun3(String newNoun3) {
        this.noun3 = newNoun3;
    }

    public void setAdverb(String newAdverb) {
        this.adverb = newAdverb;
    }

    public void setRandomNums(){
        int num = Math.abs(rand.nextInt()) % 50;
        int index=0;
        int[] numberHolder = new int[3];
        while(index < numberHolder.length){
            numberHolder[index] = num + index;
            index++;
        }
        randomNums = ",not " + numberHolder[0] + ", not " + numberHolder[1] + ", but " + numberHolder[2];
    }

    public void printInstructions(){
        System.out.println("Welcome to the MadLibs game. If you type in"
                    + " words, we'll give you a story. Start by typing in a name.");
    }

    // Get data from the player.

    public void enterName(){
        System.out.println("Give me a name");
        setName(scanner.nextLine());
    }

    public void enterNoun1(){
        System.out.println("Give me a noun");
        setNoun1(scanner.nextLine());
    }

    public void enterNoun2(){
        System.out.println("Give me another noun");
        setNoun2(scanner.nextLine());
    }

    public void enterNoun3(){
        System.out.println("Give me the last noun");
        setNoun3(scanner.nextLine());
    }

    public void enterAdjective1(){
        System.out.println("Can I get an adjective");
        setAdjective1(scanner.nextLine());
    }

    public void enterAdjective2(){
        System.out.println("One more adjective would be great!");
        setAdjective2(scanner.nextLine());
    }

    public void enterAdverb(){
        System.out.println("One adverb is missing");
        setAdverb(scanner.nextLine());
    }

    public void putTogetherTheStory(){
        String story;
        int num = Math.abs(rand.nextInt()) % 2;
        if(num == 0) {
            story = "Priya and her best friend " + getName() + " went for a nightout today! "
                    + "They met a " + getNoun1() + " in the streets while on their way "
                    + "and ate a " + getAdjective1() + " feast for the dinner. The next day I"
                    + " ran " + getAdverb() + " to find out about the " + getNoun2() + " "
                    + "and then that night I gazed at the " + getRandomNums() + " "
                    + getAdjective2() + " comets passing through the " + getNoun3() + ".";
        }
        else {
            story = "Eleftheria and her frenemy " + getName() + " went to the zoo last summer. "
                    + "They saw a huge " + getNoun1()+ " and a tiny little " + getNoun2() + ". That night"
                    + " they decided to climb " + getAdverb()+ " into the " + getNoun3() + " to get a closer look. "
                    + "The zoo was " + getAdjective1() + " at night, but they didn't care... "
                    + "until " + getRandomNums() + " " + getAdjective2() + " apes yelled at their faces, making "
                    + "Eleftheria and " + getName() + " sprint all the way back home.";
        }
        setStory(story);
    }

    public void play(){
        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdverb();
        enterNoun2();
        enterAdjective2();
        enterNoun3();
        setRandomNums();
        putTogetherTheStory();

    }

    public static void main(String[] args){
        MadLibs game = new MadLibs();
        game.printInstructions();
        game.play();
        System.out.println(game.getStory());
    }
}
