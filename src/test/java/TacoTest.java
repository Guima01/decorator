import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TacoTest {

    @Test
    void deveRetornarDescricaoTacoDeGalinha() {
        Taco taco = new Galinha();
        assertEquals("Taco de galinha", taco.getDescricao());
    }

    @Test
    void deveRetornarDescricaoTacoDePorco() {
        Taco taco = new Porco();
        assertEquals("Taco de porco", taco.getDescricao());
    }

    @Test
    void deveRetornarDescricaoTacoDeGalinhaComCebola() {
        Taco taco = new Cebola(new Galinha());

        assertEquals("Taco de galinha, Cebola", taco.getDescricao());
    }

   @Test
    void deveRetornarDescricaoTacoDeGalinhaComBatata() {
       Taco taco = new Batata(new Galinha());

       assertEquals("Taco de galinha, Batata", taco.getDescricao());
    }


    @Test
    void deveRetornarDescricaoTacoDePorcoComBatataMaisCebola() {
        Taco taco = new Batata(new Cebola(new Porco()));

        assertEquals("Taco de porco, Cebola, Batata", taco.getDescricao());
    }


    @Test
    void deveRetornarDescricaoTacoDeGalinhaComCebolaMaisBatata() {
        Taco taco = new Batata(new Cebola(new Galinha()));

        assertEquals("Taco de galinha, Cebola, Batata", taco.getDescricao());
    }


    @Test
   void deveRetornarCustoTacoDeGalinha() {
        Taco taco = new Galinha();

        assertEquals(2.49, taco.custo());
    }


    @Test
   void deveRetornarCustoTacoDePorco() {
        Taco taco = new Porco();

        assertEquals(2.75, taco.custo());
    }

    @Test
    void deveRetornarCustoTacoDePorcoComCebola() {
        Taco taco = new Cebola(new Porco());

        assertEquals(2.85, taco.custo());
    }

    @Test
    void deveRetornarCustoTacoDePorcoComBatata() {
        Taco taco = new Batata(new Porco());

        assertEquals(3.05, taco.custo());
    }

    @Test
    void deveRetornarCustoTacoDeGalinhaComBatata() {
        Taco taco = new Batata(new Galinha());

        assertEquals(2.79, taco.custo());
    }

    @Test
    void deveRetornarCustoTacoDeGalinhaComBatataMaisCebola() {
        Taco taco = new Cebola(new Batata(new Galinha()));

        assertEquals(2.89, taco.custo());
    }

    @Test
    void deveRetornarCustoTacoDePorcoComBatataMaisCebola() {
        Taco taco = new Cebola(new Batata(new Porco()));

        assertEquals(3.15, taco.custo());
    }


}