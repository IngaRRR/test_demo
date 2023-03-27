package lt.inga.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

    @Test // anotacija butina prie kiekvieno metodo
    public void testIfNumberIsEven_InputValue10() {
//        1. duomenys, (turi buti lyginis)
        int input = 10;
        int expectedReminder = 0; // tikimes 0 liekanoje
        int actualReminder;

//        2. testavimo veiksmai
        actualReminder = input % 2;

//        3. testavimo rezultatu patikrinimas
        Assert.assertEquals(actualReminder, expectedReminder);
    }


    @Test
    public void testWithAssertFalseIfNumberIsNotEven_InputValueIs9() {
//        1. duomenys
        int input = 9;
        int expectedReminder = 0; // tikimes 0 liekanoje
        int actualReminder;

//        2. testavimo veiksmai
        actualReminder = input % 2;

//        3. testavimo rezultatu patikrinimas
        Assert.assertFalse(
                actualReminder == expectedReminder,
                String.format("Actual: %s, Expected: %s", actualReminder, expectedReminder)
        );
    }


    @Test
    public void testWithAssertTrueIsNumberIsNotEven_InputNumberIs9() {
//        1. duomenys
        int input = 9;
        int expectedReminder = 1; // tikimes 0 liekanoje
        int actualReminder;

//        2. testavimo veiksmai
        actualReminder = input % 2;

//        3. testavimo rezultatu patikrinimas
        Assert.assertTrue(
                actualReminder == expectedReminder,
                String.format("Actual: %s, Expected: %s", actualReminder, expectedReminder) // visada naudoti!
        );
    }

    @Test
    public void testIfSumIsCorrect_InputValuesIs5And6() {
        // 1. duomenys
        Integer inputA = 5;
        Integer inputB = 6;
        int expectedResult = 11; // cia nereikia veiksmo, tik rezultato, kurio tikimes
        int actualResult;

        // 2. veiksmai
        actualResult = inputA + inputB;

        // 3. testas
//Assert.assertEquals(actualResult, expectedResult);
        Assert.assertTrue(
                actualResult == expectedResult,
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }
}


