package TestPage;

import BaseApp.BaseApp;
import TestPage.Pages.WinCalcPage;
import org.junit.jupiter.api.BeforeAll;


public class CalcApp extends BaseApp{

    @BeforeAll
    public static void SetupCalcPage() throws InterruptedException {
        Thread.sleep(2000);
        page = new WinCalcPage();
        page.add_num_btn_to_list();
    }

    public static void test_calc_result(String str_resulting_value, int required_value){
        boolean check_display = str_resulting_value.contains("Display is ");
        if (check_display) {
            str_resulting_value = str_resulting_value.replace ("Display is ", "");
        }
        int resulting_value = Integer.parseInt (str_resulting_value);
        assert resulting_value == required_value : "Ошибка! Полученное значение не равно предполагаемому.";
    }
}
