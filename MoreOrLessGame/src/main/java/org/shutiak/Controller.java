package org.shutiak;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void processUser(){
        Scanner scanner = new Scanner(System.in);
        view.printMessage(View.START_GAME_MESSAGE);
        while (!model.checkValue(getInputInt(scanner)));
        view.printMessage(View.GAME_OVER_MESSAGE + View.SPACE +model.getSecretNumber());
        view.printMessage(View.ATTEMPTS_WAY + View.SPACE + model.getAttempts());
        view.printMessage(View.TOTAL_ATTEMPTS + View.SPACE + model.getTotalAttempts());
    }

    private int getInputInt(Scanner scanner) {
        int input;
        view.printMessage(View.INPUT_INT_DATA + View.SPACE+ View.MORE_THAN
                + View.SPACE + model.getMinRange() + View.SPACE + View.AND
                + View.SPACE + View.LESS_THEN + View.SPACE + model.getMaxRange());
        do {
            while (!scanner.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA + View.SPACE + View.INPUT_INT_DATA);
                scanner.next();
            }
            input = scanner.nextInt();
        }while (!checkInputInt(input));

        return input;
    }

    private boolean checkInputInt(int input){
        if(!model.isValidInput(input)){
            view.printMessage(View.WRONG_INPUT_INT_DATA + View.SPACE + View.INPUT_INT_DATA + View.SPACE+ View.MORE_THAN
                    + View.SPACE + model.getMinRange() + View.SPACE + View.AND
                    + View.SPACE + View.LESS_THEN + View.SPACE + model.getMaxRange());
            return false;
        }
        return true;
    }



}
