package com.opentext.mada;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class GraderTest {
    @Test
   public void fiftyNineShouldReturnF () {
        Grader grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(59));
    }

    @Test
    public void sixtyNineShouldReturnD () {
        Grader grader = new Grader();
        assertEquals('D',grader.determineLetterGrade(69));
    }

    @Test
    public void seventyNineShouldReturnC () {
        Grader grader = new Grader();
        assertEquals('C',grader.determineLetterGrade(79));
    }

    @Test
    public void eightyNineShouldReturnB () {
        Grader grader = new Grader();
        assertEquals('B',grader.determineLetterGrade(89));
    }

    @Test
    public void ninetyNineShouldReturnA () {
        Grader grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(99));
    }

    @Test
    public void eightyShouldReturnB () {
        Grader grader = new Grader();
        assertEquals('B',grader.determineLetterGrade(80));
    }

    @Test
    public void negativeOneShouldReturnIllegalArgumentException() {
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.determineLetterGrade(-1);
        });
    }
}
