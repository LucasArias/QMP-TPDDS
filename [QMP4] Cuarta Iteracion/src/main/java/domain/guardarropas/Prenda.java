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
}


