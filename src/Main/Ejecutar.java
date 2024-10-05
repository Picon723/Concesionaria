package Main;

import Objetos.Audi;
import Objetos.Audi.Combustible;
import Objetos.Audi.Tipo;
import Objetos.Audi.Color;

public class Ejecutar {
    public static void main(String[] args) {
        Audi carro_1 = new Audi("AUDI R8", 2020, 3.0, Combustible.GASOLINA,
                Tipo.EJECUTIVO, 2, 2, 330, Color.AZUL, 100);
        System.out.println(carro_1.toString());
        
        carro_1.acelerar(20);
        carro_1.desacelerar(50);
        carro_1.desacelerar(100);
        carro_1.frenar();
        
    }
}
