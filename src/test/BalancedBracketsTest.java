package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void pairedBracketReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }

    @Test
    public void pairOfBracketInBetweenTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }

    @Test
    public void pairedBracketAtBeginning(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launchcode"));
    }
    @Test
    public void noPairOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyOneOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));;
    }
    @Test
    public void pairOfBracketsInReverseReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));;
    }
    @Test
    public void onlyOneClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));;
    }
    @Test
    public void noClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code"));;
    }
    @Test
    public void noOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code]"));;
    }
    @Test
    public void pairOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));;
    }





    }
