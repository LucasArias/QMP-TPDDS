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

    public Accesorios(TiposAccesorios tipoDePrenda, String material, String color, Enum<Trama> trama, Integer temperatura) {
        this.setTipo(tipoDePrenda);
        super.setMaterial(material);
        super.setColorPrincipal(color);
        super.setTrama(trama);
        super.setTemperaturaMaxima(temperatura);
    }

    public Accesorios(TiposAccesorios tipoDePrenda, String material, String color, Integer temperatura) {
        this.setTipo(tipoDePrenda);
        super.setMaterial(material);
        super.setColorPrincipal(color);
        super.setTemperaturaMaxima(temperatura);
    }

    public void setTipo(Enum<TiposAccesorios> tipo) {
        this.tipoDeAccesorio = tipo;
    }

    public boolean esAccesorio() {
        return true;
    };
}
