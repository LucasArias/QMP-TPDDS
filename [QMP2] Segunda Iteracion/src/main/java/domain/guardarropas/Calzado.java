package domain.guardarropas;

import java.util.Arrays;
import java.util.List;

enum TiposCalzado {
    Zapatillas,
    Zapatos,
    Sandalias,
    Ojotas
}

public class Calzado extends Prenda{
    private Enum<TiposCalzado> tipoDeCalzado;

    public Calzado(Enum<TiposCalzado> tipoDePrenda, String material, String color, Enum<Trama> trama){
        this.setTipo(tipoDePrenda);
        super.setMaterial(material);
        super.setColorPrincipal(color);
        super.setTrama(trama);
    }

    public Calzado(Enum<TiposCalzado> tipoDePrenda, String material, String color){
        this.setTipo(tipoDePrenda);
        super.setMaterial(material);
        super.setColorPrincipal(color);
    }

    public void setTipo(Enum<TiposCalzado> tipo) {
        this.tipoDeCalzado = tipo;
    }

}
