package domain.guardarropas;

import java.util.Arrays;
import java.util.List;

public class ParteSuperior extends Prenda {
    private List<String> tipos = Arrays.asList("Camisa", "CamisaMangaLarga", "CamisaMangaCorta", "Remera");

    public ParteSuperior(String tipoDePrenda, String material, String color){
        if(this.tipos.contains(tipoDePrenda)){
            super.setTipo(tipoDePrenda);
            super.setMaterial(material);
            super.setColorPrincipal(color);
        } else {
            throw new IllegalArgumentException("El Tipo de la Prenda no corresponde con su Categoria");
        }
    }

}
