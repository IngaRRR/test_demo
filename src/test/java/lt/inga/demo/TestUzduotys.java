package lt.inga.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestUzduotys {
//    @Test
//    public void testArDabar19Valandu() {
//      1. duomenys
//        int dabarValandu = LocalTime.now().getHour();
//        int expectedDabarValandu = 0;
//        int actualDabarValandu;
//
//       2. testavimo veiksmai
//        actualDabarValandu = dabarValandu - expectedDabarValandu;
//
//      3. testavimo rezultatu patikrinimas
//        Assert.assertFalse(
//                actualDabarValandu == expectedDabarValandu,
//                String.format("Actual: %s, Expected: %s", actualDabarValandu, expectedDabarValandu));
//    }

    @Test
    public void test03() {
//        1. duomenys
        int expectedDabarValandu = 19;
        int actualDabarValandu;

//        2. testavimo veiksmai
        actualDabarValandu = LocalTime.now().getHour();

//        3. testavimo rezultatu patikrinimas
        Assert.assertTrue(
                actualDabarValandu == expectedDabarValandu,
                String.format("Actual: %s, Expected: %s", actualDabarValandu, expectedDabarValandu));
    }

    @Test
    public void test02() {
        //        1. duomenys, 4 yra lyginis skaicius
        int input = 4;
        int expectedReminder = 0;
        int actualReminder;

        //        2. testavimo veiksmai
        actualReminder = input % 2;

        //        3. testavimo rezultatu patikrinimas
        Assert.assertEquals(actualReminder, expectedReminder);
    }

    // expected => WEDNESDAY
    DayOfWeek actualResult;

    // actualResult = LocalDateTime.now().getDayOfWeek();


    @Test
    public void testIsNumber995DivisibleBy3WithoutResidue() {
        //        1. duomenys, 995 dalijasi is 3 (be liekanos)
        int number = 995;
        int expectedResult = 0;
        int actualResult;

        //        2. testavimo veiksmai
        actualResult = number % 3;

        //        3. testavimo rezultatu patikrinimas
        Assert.assertTrue(
                actualResult == expectedResult,
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult));
    }

    @Test
//    public void testWeekOfDayIfTodayIsWednesday() {
////        1. duomenys
//        String expectedDayOfWeek = "Wednesday";
//        String actualDayOfWeek;
//
////        2. testavimo veiksmai
//        actualDayOfWeek = String.valueOf(LocalDateTime.now().getDayOfWeek());
//
////        3. testavimo rezultatu patikrinimas
//        Assert.assertTrue(
//                actualDayOfWeek == expectedDayOfWeek,
//                String.format("Actual: %s, Expected: %s", actualDayOfWeek, expectedDayOfWeek));
//    }

    public void testWeekOfDayIfTodayIsWednesday2() {
//        1. duomenys
        DayOfWeek expectedResult = DayOfWeek.MONDAY;
        DayOfWeek actualResult;

//        2. testavimo veiksmai
        actualResult = LocalDateTime.now().getDayOfWeek();

//        3. testavimo rezultatu patikrinimas
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIf4NumberIsEven_InputFrom_1To_10() {
//        1. duomenys
        int expectedResult = 4;
        int actualResult = 0;

//        2. testavimo veiksmai
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                actualResult++;
            }
        }
//        3. testavimo rezultatu patikrinimas
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test // sustabdyti laika
    public void activateSleepFor5Seconds() {
        try {
            System.out.println("Starting...");
            Thread.sleep(5000); // uzmiega 5 sekundems
            System.out.println("FINALE"); // po miego atsiranda uzrasas
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
