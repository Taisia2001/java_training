package org.shutiak;

public class View {
    public static final String MORE_THAN = "more than";
    public static final String LESS_THEN = "less then";
    public static final String AND = "and";
    public static final String SPACE = " ";

    public static final String START_GAME_MESSAGE = "Let`s guess the number";

    public static final String INPUT_INT_DATA = "Enter INT value";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please!";

    public static final String GAME_OVER_MESSAGE ="Congratulations, you win! Secret number =";
    public static final String ATTEMPTS_WAY ="Your way:";
    public static final String TOTAL_ATTEMPTS ="Total attempts:";

    public void printMessage(String message){
        System.out.println(message);
    }
}
