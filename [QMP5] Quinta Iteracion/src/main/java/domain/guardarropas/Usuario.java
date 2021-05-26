package domain.guardarropas;

import java.util.List;

public class Usuario {
    private String nombre;
    private List<Guardarropas> listaGuardarropas;
    private List<Uniforme> uniformes;
    private Clima clima = new Clima();

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public void agregarPrenda(Guardarropas unGuardarropas, Prenda unaPrenda) {
        unGuardarropas.agregarPrenda(unaPrenda);
    }

    public void sugerenciaUniforme(Uniforme unUniforme) {
        this.uniformes.add(unUniforme);
    }

    public Atuendo generarUnAtuendo(Guardarropas unGuardarropas) {
        Integer temperaturaActual = (Integer) clima.condicionClimaticaBuenosAires().get(0).get("WeatherIcon");
        Atuendo unAtuendo = new Atuendo();
        return unAtuendo.generarUnAtuendoClima(unGuardarropas.obtenerPrendasGuardarropa(), temperaturaActual);
    }

    public void generarUnGuardarropas(Guardarropas unGuardarropas) {
        listaGuardarropas.add(unGuardarropas);
    }
}
