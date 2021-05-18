package domain.guardarropas;

import java.util.List;

public class Usuario {
    private String nombre;
    private List<Prenda> prendas;
    private List<Uniforme> uniformes;

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public void agregarPrenda(Prenda unaPrenda) {
        this.prendas.add(unaPrenda);
    }

    public void sugerenciaUniforme(Uniforme unUniforme) {
        this.uniformes.add(unUniforme);
    }
}
