package domain.guardarropas;

import java.util.Arrays;
import java.util.List;

enum TiposParteInferior {
    Pantalon,
    Short,
    Bermudas,
}

public class ParteInferior extends Prenda{
    private Enum<TiposParteInferior> tipoDeParteInferior;

    public ParteInferior(Enum<TiposParteInferior> tipoDePrenda, String material, String color) {
        this.setTipo(tipoDePrenda);
        super.setMaterial(material);
        super.setColorPrincipal(color);
    }

    public void setTipo(Enum<TiposParteInferior> tipo) {
        this.tipoDeParteInferior = tipo;
    }
}
