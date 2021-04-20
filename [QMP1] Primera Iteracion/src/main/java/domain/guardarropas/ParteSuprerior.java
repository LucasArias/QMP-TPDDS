package domain.guardarropas;

public class ParteSuprerior extends Prenda {

    // Leyendo StackOverflow vi que se puede usar "Method Overloading"
    // No se si este aproach es correcto a la hora de tener un color secundario opcional

    public nuevaPrendaSuperior(String tipoDePrenda, String material, String color){
        super.setTipo(tipoDePrenda);
        super.setMaterial(material);
        super.setColorPrincipal(color);
    }
}
