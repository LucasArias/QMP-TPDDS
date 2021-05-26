package domain.guardarropas;

import java.time.LocalDate;
import java.util.*;

public class Clima {
  private AccuWeatherAPI apiClima = new AccuWeatherAPI();
  private LocalDate ultimaFechallamada = new LocalDate();
  private Boolean quedanMenosDe10Intentos = true;
  private Integer cantidadDeIntentos = 0;
  private List<Map<String, Object>> ultimoLlamadoApi;


  public List<Map<String, Object>> condicionClimaticaBuenosAires() {
    if(this.puedeSerUtilizadaLaApi()) {
      ultimoLlamadoApi = apiClima.getWeather("Buenos Aires, Argentina");
    }
    return ultimoLlamadoApi;
  }

  public Boolean puedeSerUtilizadaLaApi() {
    LocalDate fechaActual = new LocalDate();
    if(this.quedanIntentos(fechaActual)) {
      cantidadDeIntentos ++;
      ultimaFechallamada = fechaActual;
      return quedanMenosDe10Intentos;
    } else {
      quedanMenosDe10Intentos = false;
      return false;
    }
  }

  public Boolean quedanIntentos(LocalDate unaFecha) {
    if (unaFecha == ultimaFechallamada && cantidadDeIntentos < 10) {
      return true;
    } else if (unaFecha != ultimaFechallamada) {
      cantidadDeIntentos = 0;
      return true;
    } else {
      return false;
    }
  }
}
