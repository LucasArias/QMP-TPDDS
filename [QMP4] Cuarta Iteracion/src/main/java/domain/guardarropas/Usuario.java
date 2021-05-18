package domain.guardarropas;

import java.util.List;

public class Usuario {
    private String nombre;
    private List<Prenda> prendas;
    private List<Uniforme> uniformes;
    private Clima clima = new Clima();

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public void agregarPrenda(Prenda unaPrenda) {
        this.prendas.add(unaPrenda);
    }

    public void sugerenciaUniforme(Uniforme unUniforme) {
        this.uniformes.add(unUniforme);
    }

    public Atuendo generarUnAtuendo() {
        Integer temperaturaActual = (Integer) clima.condicionClimaticaBuenosAires().get(0).get("WeatherIcon");
        Atuendo unAtuendo = new Atuendo();
        return unAtuendo.generarUnAtuendoClima(prendas, temperaturaActual);
    }
}
