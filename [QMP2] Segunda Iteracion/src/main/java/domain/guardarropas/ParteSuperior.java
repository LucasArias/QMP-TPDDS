package domain.guardarropas;

import java.util.Arrays;
import java.util.List;

enum TiposParteSuperior {
    Camisa,
    CamisaMangaLarga,
    CamisaMangaCorta,
    Remera
}

public class ParteSuperior extends Prenda {
    private Enum<TiposParteSuperior> tipoDeParteSuperior;

    public ParteSuperior(Enum<TiposParteSuperior> tipoDePrenda, String material, String color){
        this.setTipo(tipoDePrenda);
        super.setMaterial(material);
        super.setColorPrincipal(color);
    }

    public void setTipo(Enum<TiposParteSuperior> tipo) {
        this.tipoDeParteSuperior = tipo;
    }
}
