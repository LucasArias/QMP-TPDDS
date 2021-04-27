package domain.guardarropas;

import java.util.List;

public class Usuario {
    private String nombre;
    private List<Prenda> prendas;

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public void agregarPrenda(Prenda unaPrenda){
        this.prendas.add(unaPrenda);
    }
}
