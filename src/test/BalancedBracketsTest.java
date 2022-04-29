package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void openBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void closeBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void reverseBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void threeBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void bracketsContainingTextReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[some text]"));
    }

    @Test
    public void partiallyBracketedTextReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[some] text"));
    }

    @Test
    public void bracketsBeforeTextReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]some text"));
    }

    @Test
    public void reverseBracketsInTextReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Some] Text["));
    }

    @Test
    public void singleBracketInTextReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Some] Text"));
    }
}