package domain.guardarropas;

enum Trama {
    Lisa,
    Rayada,
    Lunares,
    Cuadros,
    Estampada
}

public abstract class Prenda{
    private String material;
    private String colorPrincipal;
    private String colorSecundario = "S/C";
    private Enum<Trama> tramaPrenda = Trama.Lisa;
    private Integer temperaturaMaxima;

    public void setMaterial(String material){
        this.material = material;
    }

    public void setColorPrincipal(String colorPrincipal){
        this.colorPrincipal = colorPrincipal;
    }

    public void setColorSecundario(String colorSecundario){
        this.colorSecundario = colorSecundario;
    }

    public void agregarColorSecundario(String colorSec){
        this.setColorSecundario(colorSec);
    }

    public void setTrama(Enum<Trama> unaTrama) {
        this.tramaPrenda = unaTrama;
    }

    public void setTemperaturaMaxima(Integer temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Boolean esTemperaturaAdecuada(Integer unaTemperatura) {
        return unaTemperatura < temperaturaMaxima;
    }

    public boolean esSuperior() {
        return false;
    };

    public boolean esInferior() {
        return false;
    };

    public boolean esCalzado() {
        return false;
    };

    public boolean esAccesorio() {
        return false;
    };
}


