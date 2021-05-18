package domain.guardarropas;

enum TiposParteSuperior {
    Camisa,
    CamisaMangaLarga,
    CamisaMangaCorta,
    Remera
}

public class ParteSuperior extends Prenda {
    private Enum<TiposParteSuperior> tipoDeParteSuperior;

    public ParteSuperior(Enum<TiposParteSuperior> tipoDePrenda, String material, String color, Enum<Trama> trama, Integer temperatura){
        this.setTipo(tipoDePrenda);
        super.setMaterial(material);
        super.setColorPrincipal(color);
        super.setTrama(trama);
        super.setTemperaturaMaxima(temperatura);
    }

    public ParteSuperior(Enum<TiposParteSuperior> tipoDePrenda, String material, String color, Integer temperatura){
        this.setTipo(tipoDePrenda);
        super.setMaterial(material);
        super.setColorPrincipal(color);
        super.setTemperaturaMaxima(temperatura);
    }

    public void setTipo(Enum<TiposParteSuperior> tipo) {
        this.tipoDeParteSuperior = tipo;
    }

    public boolean esSuperior() {
        return true;
    }
}
