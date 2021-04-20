package domain.guardarropas;

public class ParteInferior extends Prenda{

    //No se me ocurre como poder evitar repetir logica en las 4 categorias de prenda

    public ParteInferior(String tipoDePrenda, String material, String color, String colorSec){
        super.setTipo(tipoDePrenda);
        super.setMaterial(material);
        super.setColorPrincipal(color);

        if (colorSec == null) {
            super.setColorSecundario("s/c");
        } else {
            super.setColorSecundario(colorSec);
        }
    }
}
