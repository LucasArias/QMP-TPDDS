package domain.guardarropas;

import java.util.Arrays;
import java.util.List;

enum TiposAccesorios {
    Lentes,
    Pañuelo,
    Cartera
}

public class Accesorios extends Prenda {
    private Enum<TiposAccesorios> tipoDeAccesorio;

    public Accesorios(TiposAccesorios tipoDePrenda, String material, String color) {
        this.setTipo(tipoDePrenda);
        super.setMaterial(material);
        super.setColorPrincipal(color);
    }

    public void setTipo(Enum<TiposAccesorios> tipo) {
        this.tipoDeAccesorio = tipo;
    }
}
