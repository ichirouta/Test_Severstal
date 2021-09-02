package TestCases;

import TestPage.CalcApp;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class Calc_tests extends CalcApp {

    @AfterEach
    public void ClearContent(){
        page.clear_btn.click();
    }

    @AfterAll
    public static void TearDown(){
        page.close_btn.click();
    }

    /**
     * Тест кейс 1. Проверка сложения в windows калькулятор
     * -Ввести число
     * -Нажать плюс
     * -Ввести второе число
     * -Нажать равно, сверить фактический и предполагаемый результаты
     *
     * Автор: Фосмчев П.
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    public void sum_calc_test_001(int first_btn, int second_btn, int result) {
        page.getNumButtons().get(first_btn).click();
        page.plus_btn.click();
        page.getNumButtons().get(second_btn).click();
        page.equal_btn.click();
        String test_result = page.result_field.getAttribute("Name");
        test_calc_result(test_result, result);
    }
}