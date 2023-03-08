package com.lista1;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void questao1() {
        Assert.assertEquals(388, QuestoesExercicio.operadoresTiposVariaveis1(7));
    }

    @Test
    public void questao2() {
        Assert.assertEquals(2494, QuestoesExercicio.operadoresTiposVariaveis2(13, 7));
    }

    @Test
    public void questao3() {
        Assert.assertEquals(5, QuestoesExercicio.execucaoCondicional1(1, 5));
        Assert.assertEquals(1, QuestoesExercicio.execucaoCondicional1(1, -5));
    }

    @Test
    public void questao4() {
        Assert.assertEquals(1, QuestoesExercicio.execucaoCondicional2("um"));
        Assert.assertEquals(2, QuestoesExercicio.execucaoCondicional2("dois"));
        Assert.assertEquals(3, QuestoesExercicio.execucaoCondicional2("tres"));
        Assert.assertEquals(4, QuestoesExercicio.execucaoCondicional2("quatro"));
        Assert.assertEquals(5, QuestoesExercicio.execucaoCondicional2("cinco"));
        Assert.assertEquals(0, QuestoesExercicio.execucaoCondicional2("elend"));
    }

    @Test
    public void questao5() {
        Assert.assertEquals(0, QuestoesExercicio.operadoesLogicos1(1, 2, 3, 4));
        Assert.assertEquals(1, QuestoesExercicio.operadoesLogicos1(35, 2, 3, 4));
        Assert.assertEquals(2, QuestoesExercicio.operadoesLogicos1(35, 70, 3, 4));
        Assert.assertEquals(3, QuestoesExercicio.operadoesLogicos1(35, 70, 105, 4));
        Assert.assertEquals(4, QuestoesExercicio.operadoesLogicos1(35, 70, 105, 140));
    }

    @Test
    public void questao6() {
        Assert.assertTrue(QuestoesExercicio.operadoresLogicos2(1, 2, 3));
        Assert.assertFalse(QuestoesExercicio.operadoresLogicos2(2, 2, 3));
        Assert.assertFalse(QuestoesExercicio.operadoresLogicos2(2, 2, 2));
    }

    @Test
    public void questao7() {
        Assert.assertEquals(385, QuestoesExercicio.lacos1(10));
    }

    @Test
    public void questao8() {
        // Assert.assertTrue();
        String resultado = "-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(baos);
	PrintStream old = System.out;
	System.setOut(ps);
        QuestoesExercicio.lacos2();
        System.setOut(old);
		Assert.assertTrue(resultado.equals(baos.toString()));
    }

    // @Test
    // public void questao9() {
    //         Assert.assertEquals(16, QuestoesExercicio.metodo1(3));
    // }

    // @Test
    // public void questao10() {
    //     Assert.assertEquals(0, QuestoesExercicio.metodo2(2, 2, 2, 2));
    //     Assert.assertEquals(1, QuestoesExercicio.metodo2(3, 2, 2, 2));
    //     Assert.assertEquals(2, QuestoesExercicio.metodo2(5, 7, 2, 2));
    //     Assert.assertEquals(3, QuestoesExercicio.metodo2(2, 11, 13, 15));
    //     Assert.assertEquals(4, QuestoesExercicio.metodo2(17, 19, 21, 23));
    // }

    @Test
    public void questao11() {
        int[] array1 = {2,3,4,5};
        int[] array2 = {1,1,1,1};
        Assert.assertEquals(2, QuestoesExercicio.array1(array1));
        Assert.assertEquals(0, QuestoesExercicio.array1(array2));
    }
    
    @Test 
    public void questao12() {
        int[][] array3 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        Assert.assertEquals(4, QuestoesExercicio.array2(array3));
    }

}
