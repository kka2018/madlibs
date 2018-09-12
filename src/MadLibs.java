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

    }

    public void printInstructions(){
        System.out.println("Welcome to the MadLibs game. If you type in"
                    + " words, we'll give you a story. Start by typing in a name.");
    }

    public static void main(String[] args){
        MadLibs game = new MadLibs();
        game.printInstructions();
    }
}
