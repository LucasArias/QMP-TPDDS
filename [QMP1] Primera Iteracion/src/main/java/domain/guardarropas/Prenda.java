package domain.guardarropas;

public abstract class Prenda{
    private String tipo;
    private String material;
    private String colorPrincipal;
    private String colorSecundario;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public void setColorPrincipal(String colorPrincipal){
        this.colorPrincipal = colorPrincipal;
    }

    public void setColorSecundario(String colorSecundario){
        this.colorSecundario = colorSecundario;
    }
}

