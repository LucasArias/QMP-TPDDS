package domain.guardarropas;

import java.time.LocalDate;
import java.util.*;

public class Clima {
  AccuWeatherAPI apiClima = new AccuWeatherAPI();
  LocalDate ultimaFechallamada = new LocalDate();
  Boolean quedanMenosDe10Intentos = true;
  Integer cantidadDeIntentos = 0;
  List<Map<String, Object>> ultimoLlamadoApi;


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
