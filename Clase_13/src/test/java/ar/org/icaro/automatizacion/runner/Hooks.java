package ar.org.icaro.automatizacion.runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp(Scenario scenario){

        System.out.println("INICIANDO" + scenario.getName());
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        // Deshabilitar pantalla de selección de buscador (Chrome nuevo)
        options.addArguments("--disable-search-engine-choice-scree");

        // Deshabilitar notificaciones del navegador
        options.addArguments("--disable-notifications");

        // Deshabilitar barra de información de automatización
        options.addArguments("--disable-infobars");

        // Permitir orígenes remotos (necesario para Selenium 4+)
        options.addArguments("--remote-allow-origins=*");

        Map<String, Object> prefs=new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);

        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @After
    public void  tearDown(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println("\n FALLÓ " + scenario.getName());
        }else{
            System.out.println("PASÓ " + scenario.getName());
        }

        if(driver != null){
            driver.quit();
            driver=null;
        }
    }
}
