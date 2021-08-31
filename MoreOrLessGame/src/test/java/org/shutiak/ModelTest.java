package org.shutiak;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModelTest {

    private static Model model;
    @BeforeAll
    static void initModel(){
        model = new Model();
    }
    @Test
    public void returnTrueWhenSecretNumberInRange(){
        for (int i = 0; i<10000000; i++){
            model.setSecretNumber();
            assertTrue(model.getSecretNumber()> model.getMinRange() &&
                    model.getSecretNumber() < model.getMaxRange());
        }
    }
    @Test
    public void returnFalseWhenInputLessThanRange()
    {
        assertFalse( model.isValidInput(model.getMinRange()-1) );
    }
    @Test
    public void returnFalseWhenInputMoreThanRange()
    {
        assertFalse( model.isValidInput(model.getMaxRange()));
    }
    @Test
    public void returnTrueWhenInputInRange()
    {
        assertTrue( model.isValidInput(model.getMaxRange()-1) );
    }


    @Test
    public void returnFalseWhenValueIsNotSecretNumber()
    {
        assertFalse( model.checkValue(model.getSecretNumber()+1) );
    }
    @Test
    public void returnTrueWhenValueIsSecretNumber()
    {
        assertTrue( model.checkValue(model.getSecretNumber()) );
    }



}
