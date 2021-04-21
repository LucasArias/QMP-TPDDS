package domain.guardarropas;

import java.util.Arrays;
import java.util.List;

public class Accesorios extends Prenda{
    private List<String> tipos = Arrays.asList("Lentes", "Pañuelo", "Cartera");

    public Accesorios(String tipoDePrenda, String material, String color){
        if(this.tipos.contains(tipoDePrenda)){
            super.setTipo(tipoDePrenda);
            super.setMaterial(material);
            super.setColorPrincipal(color);
        } else {
            throw new IllegalArgumentException("El Tipo de la Prenda no corresponde con su Categoria");
        }
    }
}
