package java112.project3;

import java.util.*;

/**
 * This is a JavaBean used to store Powerball numbers.
 *
 * @author jadams
 */
public class PowerballBean extends Object {

    private  int  luckyNumber;
    private  int unluckyNumber;
    private  boolean foundLuckyNumber = false;
    private  boolean foundUnLuckyNumber = false;
    private  List<Integer> winningNumbers = new ArrayList<>();
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
    public boolean isFoundUnLuckyNumber() {
        return foundUnLuckyNumber;
    }

    /**
     * Sets found un lucky number.
     *
     * @param foundUnLuckyNumber the found un lucky number
     */
    public void setFoundUnLuckyNumber(boolean foundUnLuckyNumber) {
        this.foundUnLuckyNumber = foundUnLuckyNumber;
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

    @java.lang.Override
    public java.lang.String toString() {
        return "PowerballBean{" +
                "luckyNumber=" + luckyNumber +
                ", unluckyNumber=" + unluckyNumber +
                ", foundLuckyNumber=" + foundLuckyNumber +
                ", foundUnLuckyNumber=" + foundUnLuckyNumber +
                ", winningNumbers=" + winningNumbers +
                ", powerballNumber=" + powerballNumber +
                '}';
    }
}







