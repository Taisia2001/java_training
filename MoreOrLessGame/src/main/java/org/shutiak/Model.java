package org.shutiak;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int minRange;
    private int maxRange;

    private int secretNumber;

    private List<Integer> attempts;

    public final static int DEFAULT_MIN_RANGE = 0;
    public final static int DEFAULT_MAX_RANGE = 100;

    public Model() {
        this.secretNumber = setSecretNumber();
        setRanges(DEFAULT_MIN_RANGE, DEFAULT_MAX_RANGE);
        this.attempts = new ArrayList<>();
    }

    private int setSecretNumber() {
        return (int) (Math.random() * (DEFAULT_MAX_RANGE - DEFAULT_MIN_RANGE - 1)
                + DEFAULT_MIN_RANGE);
    }

    private void setRanges(int min, int max) {
        this.minRange = min;
        this.maxRange = max;
    }

    public boolean checkValue(int value){
        attempts.add(value);
        if(value==secretNumber) {
            return true;
        } else if (value > secretNumber) {
            maxRange = value;
        } else {
            minRange = value;
        }
        return false;
            
    }

    public boolean isValidInput(int input){
        return input>minRange&&input<maxRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getMinRange() {
        return minRange;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public List<Integer> getAttempts() {
        return attempts;
    }

    public int getTotalAttempts() {
        return attempts.size();
    }
}
