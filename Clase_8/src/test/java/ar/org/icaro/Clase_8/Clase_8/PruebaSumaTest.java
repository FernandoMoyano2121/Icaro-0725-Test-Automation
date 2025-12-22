package ar.org.icaro.Clase_8.Clase_8;

import ar.org.icaro.Clase_8.Matematica;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PruebaSumaTest {

    @Test
    public void validarSumarCero(){
        //Ejecutamos el codigo a probar
        int resultado=Matematica.Suma(1,0);

        //verificamos que el resulta sea el esperado
        Assert.assertEquals(resultado,1, "Sumar 0 deberia devolver el mismo número");
    }

}
