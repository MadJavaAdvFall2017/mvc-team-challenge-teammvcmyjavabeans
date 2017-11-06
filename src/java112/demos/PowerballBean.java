package java112.project3;

import java.util.*;

/**
 * This is a JavaBean used to store Powerball numbers.
 *
 * @author jadams
 */
public class PowerballBean {

    private  int  luckyNumber;
    private  int unluckyNumber;
    private  boolean foundLuckyNumber;
    private  boolean foundUnluckyNumber;
    private List<Integer> winningNumbers = new ArrayList<>();
    private  int   powerballNumber;

    /**
     * Constructor for the PowerballBean object
     */
    public PowerballBean() {

    }

    /**
     * Instantiates a new Powerball bean.
     *
     * @param luckyNumber   the lucky number
     * @param unluckyNumber the unlucky number
     */
    public PowerballBean(int luckyNumber, int unluckyNumber) {
        this();
        this.setLuckyNumber(luckyNumber);
        this.setUnluckyNumber(unluckyNumber);
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
     * Gets unlucky number.
     *
     * @return the unlucky number
     */
    public int getUnluckyNumber() {
        return unluckyNumber;
    }

    /**
     * Sets unlucky number.
     *
     * @param unluckyNumber the unlucky number
     */
    public void setUnluckyNumber(int unluckyNumber) {
        this.unluckyNumber = unluckyNumber;
    }

    /**
     * Is found lucky number boolean.
     *
     * @return the boolean
     */
    public boolean isFoundLuckyNumber() {
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
    public boolean isFoundUnluckyNumber() {
        return foundUnluckyNumber;
    }

    /**
     * Sets found un lucky number.
     *
     * @param foundUnluckyNumber the found un lucky number
     */
    public void setFoundUnluckyNumber(boolean foundUnluckyNumber) {
        this.foundUnluckyNumber = foundUnluckyNumber;
    }

    /**
     * Gets winning numbers.
     *
     * @return the winning numbers
     */
    public List<Integer> getWinningNumbers() {
        return winningNumbers;
    }

    /**
     * Sets winning numbers.
     *
     * @param winningNumbers the winning numbers
     */
    public void setWinningNumbers(List<Integer> winningNumbers) {
        this.winningNumbers = winningNumbers;
    }

    /**
     * Gets powerball number.
     *
     * @return the powerball number
     */
    public int getPowerballNumber() {
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
}







