package domain.guardarropas;
import java.util.*;

public class Atuendo {
  private Prenda unaParteSuperior;
  private Prenda unaParteInferior;
  private Prenda unCalzado;
  private Prenda unAccesorio;

  public Atuendo generarUnAtuendoClima(List<Prenda> listadoDePrendas, Integer unaTemperatura) {
    unaParteSuperior = listadoDePrendas.stream().filter(unaPrenda -> unaPrenda.esSuperior() && unaPrenda.esTemperaturaAdecuada(unaTemperatura)).findFirst().get();
    unaParteInferior = listadoDePrendas.stream().filter(unaPrenda -> unaPrenda.esInferior() && unaPrenda.esTemperaturaAdecuada(unaTemperatura)).findFirst().get();
    unCalzado = listadoDePrendas.stream().filter(unaPrenda -> unaPrenda.esCalzado() && unaPrenda.esTemperaturaAdecuada(unaTemperatura)).findFirst().get();
    unAccesorio = listadoDePrendas.stream().filter(unaPrenda -> unaPrenda.esAccesorio() && unaPrenda.esTemperaturaAdecuada(unaTemperatura)).findFirst().get();
    return this;
  }

}
