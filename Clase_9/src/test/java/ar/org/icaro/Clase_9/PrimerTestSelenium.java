package ar.org.icaro.Clase_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * ============================================================
 * PRIMER TEST CON SELENIUM
 * ============================================================
 *
 * Este es el primer test que escribimos con Selenium.
 * Simplemente abre el navegador y navega a SauceDemo.
 *
 * Objetivo: Verificar que Selenium está configurado correctamente.
 *
 * DIAPOSITIVA: Selenium WebDriver - Crear instancia del driver
 * ============================================================
 */
public class PrimerTestSelenium {


    // La variable driver debe ser miembro de la clase
    // para que todos los métodos @Test puedan acceder a ella
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        // WebDriverManager descarga automáticamente el driver del navegador
        WebDriverManager.chromedriver().setup();

        // Creamos una instancia de ChromeDriver
        // Esto abre una ventana del navegador Chrome
        driver=new ChromeDriver();

        // Maximizamos la ventana para mejor visibilidad
        driver.manage().window().maximize();
    }

    @Test
    public void navegarASauceDemo(){
        // El metodo get() navega a la URL indicada
        driver.get("https://www.saucedemo.com");

        // Obtenemos el título de la página
        String titulo=driver.getTitle();

        Assert.assertEquals(titulo,"Swag Labs", "El titulo de la pagina no es el esperado");

        System.out.println("Navegamos exitosamente a SauceDemo");
        System.out.println("Titulo de la pagina: " + titulo);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
        if(driver !=null){
            driver.quit();
            System.out.println("Navegador cerrado correctamente");
        }
    }
}
