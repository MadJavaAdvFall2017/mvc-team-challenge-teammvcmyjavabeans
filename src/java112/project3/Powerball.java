package java112.project3;

import java.util.*;

public class Powerball {

    private  int  luckyNumber;
    private  int unluckyNumber;
    private  boolean foundLuckyNumber;
    private  boolean foundUnluckyNumber;
    private  List<Integer> regularNumbers;
    private  List<Integer> powerballNumbers;
    private  List<Integer> winningNumbers;
    private  int   powerballNumber;

    private static final int MAX_REGULAR_NUMBERS = 69;
    private static final int MAX_POWERBALL_NUMBERS = 26;

    /**
     * Instantiates a new Powerball.
     */
    public Powerball() {
        loadNumbers();
    }

    /**
     * Instantiates a new Powerball.
     *
     * @param luckyNumber   the lucky number
     * @param unluckyNumber the unlucky number
     */
    public Powerball(int luckyNumber, int unluckyNumber) {
        this();
        this.luckyNumber = luckyNumber;
        this.unluckyNumber = unluckyNumber;
     }

    /**
     * Gets lucky number.
     *
     * @return the lucky number
     */
    public int getLuckyNumber() {
        return luckyNumber;
    }

    /**
     * Sets lucky number.
     *
     * @param luckyNumber the lucky number
     */
    public void setLuckyNumber(int luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    /**
     * Gets un lucky number.
     *
     * @return the un lucky number
     */
    public int getUnLuckyNumber() {
        return unluckyNumber;
    }

    /**
     * Sets un lucky number.
     *
     * @param unluckyNumber the unlucky number
     */
    public void setUnLuckyNumber(int unluckyNumber) {
        this.unluckyNumber = unluckyNumber;
    }

    /**
     * Is found lucky number boolean.
     *
     * @return the boolean
     */
    public boolean isFoundLuckyNumber()  {
        return foundLuckyNumber;
    }

    /**
     * Sets found lucky number.
     *
     * @param foundLuckyNumber the found lucky number
     */
    public void setFoundLuckyNumber(boolean foundLuckyNumber) {
        this.foundLuckyNumber = foundLuckyNumber;
    }

    /**
     * Is found un lucky number boolean.
     *
     * @return the boolean
     */
    public boolean isFoundUnluckyNumber()  {
        return foundUnluckyNumber;
    }

    /**
     * Sets found un lucky number.
     *
     * @param foundUnluckyNumber the found un lucky number
     */
    public void setFoundUnluckyNumber(boolean foundUnluckyNumber)  {
        this.foundUnluckyNumber = foundUnluckyNumber;
    }

    /**
     * Gets powerball number.
     *
     * @return the powerball number
     */
    public int getPowerballNumber() {
        drawPowerballNumber();
        return powerballNumber;
    }

    /**
     * Sets powerball number.
     *
     * @param powerballNumber the powerball number
     */
    public void setPowerballNumber(int powerballNumber) {
        this.powerballNumber = powerballNumber;
    }

    /**
     * Sets winning numbers.
     *
     * @param winningNumbers the winning numbers
     */
    public void setWinningNumbers(List<Integer> winningNumbers)  {
        this.winningNumbers = winningNumbers;
    }

    /**
     * Gets winning numbers.
     *
     * @return the winning numbers
     */
    public List<Integer> getWinningNumbers() {
        drawWinningNumbers();
        return winningNumbers;
    }

    private void loadNumbers() {

        //Instantiate Instance Variables
        regularNumbers = new ArrayList<>();
        powerballNumbers = new ArrayList<>();


        //Create Regular Number list (1-69) and Powerball Number list(1-26)
        for (int i = 1; i < MAX_REGULAR_NUMBERS; i++) {

             //Load the Powerball Numbers (1-26)
             if (i < MAX_POWERBALL_NUMBERS) {
                 powerballNumbers.add(i);
             }

             //Load the Regular Numbers (1-69)
             regularNumbers.add(i);
        }
    }

    private void drawWinningNumbers() {

        //Instantiate Instance Variables
        winningNumbers = new ArrayList<>();

        //Shuffle Regular Numbers
        Collections.shuffle(regularNumbers, new Random());

        //Add the first 5 numbers to the winning numbers array
        for (int i = 0; i < 5; i++) {
            winningNumbers.add(regularNumbers.get(i));
        }

        //Sort the numbers
        Collections.sort(winningNumbers);

    }

     private void drawPowerballNumber() {

         //Shuffle the Powerball Numbers
         Collections.shuffle(powerballNumbers, new Random());

         powerballNumber = powerballNumbers.get(0);

     }

     private boolean getIsFoundLuckyNumber(PowerballBean myPowerballBean) {

         if (winningNumbers.contains(luckyNumber) ||
                 powerballNumber == luckyNumber) {

             return true;

         } else {

             return false;

         }

     }

     private boolean getIsFoundUnLuckyNumber(PowerballBean myPowerballBean) {

         if (winningNumbers.contains(unluckyNumber) ||
                 powerballNumber == unluckyNumber) {

             return true;

          } else {

             return false;

         }
     }

}







