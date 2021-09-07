package BaseApp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

import java.io.File;
import java.io.IOException;
public class BaseApp {
    protected static DesktopOptions options;
    protected static WiniumDriverService service;
    public static WiniumDriver driver;

    @BeforeAll
    public static void SetupClass() {
        options = new DesktopOptions();
        options.setApplicationPath(ConfProperties.getProperty("ApplicationPath"));
        File driverPath = new File(ConfProperties.getProperty("DriverPath"));
        service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
        try {
            service.start();
        } catch (IOException e) {
            System.out.println("Exception while starting WINIUM service");
            e.printStackTrace();
        }
        driver = new WiniumDriver(service,options);
    }

    @AfterAll
    public static void TearDownClass(){
        service.stop();
    }
}
