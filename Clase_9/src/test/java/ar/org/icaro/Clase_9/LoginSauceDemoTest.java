package ar.org.icaro.Clase_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginSauceDemoTest {

    private WebDriver driver;

    // URL base de SauceDemo
    private static final String BASE_URL = "https://www.saucedemo.com";

    // Credenciales de prueba (están en la propia página de SauceDemo)
    private static final String USUARIO_STANDARD = "standard_user";
    private static final String USUARIO_BLOQUEADO = "locked_out_user";
    private static final String PASSWORD_CORRECTO = "secret_sauce";
    private static final String PASSWORD_INCORRECTO = "password_malo";

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void irALogin(){driver.get(BASE_URL);}


    @Test
    public void loginExitoso(){
        WebElement campoUsuario=driver.findElement(By.id("user-name"));
        campoUsuario.sendKeys(USUARIO_STANDARD);

        // Encontramos el campo de password por su ID
        WebElement campoPassword = driver.findElement(By.id("password"));
        campoPassword.sendKeys(PASSWORD_CORRECTO);

        WebElement botonLogin=driver.findElement(By.id("login-button"));
        botonLogin.click();

        String urlActual=driver.getCurrentUrl();

        Assert.assertNotNull(urlActual);
        Assert.assertTrue(urlActual.contains("inventory.html"), "Después del login deberia estár en inventory.html");

        System.out.println("Login exitoso - URL actual: " + urlActual);

    }

    @Test
    public void loginUsuarioBloqueado(){
        driver.findElement(By.id("user-name")).sendKeys(USUARIO_BLOQUEADO);
        driver.findElement(By.id("password")).sendKeys(PASSWORD_CORRECTO);
        driver.findElement(By.id("login-button")).click();

        WebElement contenedorError=driver.findElement(By.className("error-message-container"));

        Assert.assertTrue(contenedorError.isDisplayed(), "Deberia mostrarse un de mensaje");
        String mensajeError=contenedorError.getText();
        Assert.assertTrue(mensajeError.contains("locked out"), "El mensaje deberia indicar que el usuario está bloqueado");

        System.out.println("Usuario bloqueado - Mensaje " + mensajeError);
    }

    @Test
    public void loginCredencialesInvalidas(){
        driver.findElement(By.id("user-name")).sendKeys("usuario_falso");
        driver.findElement(By.id("password")).sendKeys(PASSWORD_INCORRECTO);
        driver.findElement(By.id("login-button")).click();

        //Verificamos que aparece el mensaje de error
        WebElement contenedorError=driver.findElement(By.className("error-message-container"));
        Assert.assertTrue(contenedorError.isDisplayed(), "Deberia mostrarse un mensaje de error");

        //Verificamos que seguimos en la pagina de login (no navegó)
        String urlActual=driver.getCurrentUrl();
        Assert.assertFalse(urlActual.contains("inventory"), "No deberia haber navegado al inventario");

        System.out.println("✓ Credenciales Invalidas: Error mostrado Correctamente");
    }

    @Test
    public void verificarElementosLogin(){
        //Verificamos que el campo de usuario existe y está visible
        WebElement campoUsuario=driver.findElement(By.id("user-name"));
        Assert.assertTrue(campoUsuario.isDisplayed(), "Campo usuario deberia ser visible");

        //Verificamos que el campo password existe y esta visible
        WebElement campoPassword=driver.findElement(By.id("password"));
        Assert.assertTrue(campoPassword.isDisplayed(), "Campo password deberia ser visible");

        //Verificamos que el botón de login existe y está visible
        WebElement botonLogin=driver.findElement(By.id("login-button"));
        Assert.assertTrue(botonLogin.isDisplayed(), "Botón login deberia ser visible");

         //Verificamos que el botón de login existe y está visible
        String textoBoton=botonLogin.getDomAttribute("value");
        Assert.assertEquals(textoBoton, "Login", "El boton deberia decir 'Login'");

        System.out.println("✓ Todos los elementos del formulario están presentes");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

