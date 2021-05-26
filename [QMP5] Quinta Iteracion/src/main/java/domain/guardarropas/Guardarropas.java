package domain.guardarropas;

import java.util.List;

public class Guardarropas {
  private List<Prenda> listaDePrendas;
  private List<Prenda> prendasTentativasAgregar;
  private List<Prenda> prendasTentativasQuitar;

  public Guardarropas(Prenda ... unaPrenda) {
    for(Prenda prenda : unaPrenda){
      listaDePrendas.add(prenda);
    }
  }

  public void agregarPrenda(Prenda unaPrenda) {
    listaDePrendas.add(unaPrenda);
  }

  public List<Prenda> obtenerPrendasGuardarropa() {
    return listaDePrendas;
  }

  public void agregarPrendaTentativaAgregar(Prenda unaPrenda) {
    prendasTentativasAgregar.add(unaPrenda);
  }

  public void agergarPrendaTentativaQuitar(Prenda unaPrenda) {
    prendasTentativasQuitar.add(unaPrenda);
  }

  public List<Prenda> listarPrendasTentativasAgregar() {
    return prendasTentativasAgregar;
  }

  public List<Prenda> listarPrendasTentativasQuitar() {
    return prendasTentativasAgregar;
  }

  public void quitarSubmissionAgregar(Prenda unaPrenda) {
    prendasTentativasAgregar.remove(unaPrenda);
  }

  public void quitarSubmissionQuitar(Prenda unaPrenda) {
    prendasTentativasQuitar.remove(unaPrenda);
  }

  public void aceptarPropuestaAgregar(Prenda unaPrenda) {
    agregarPrenda(unaPrenda);
  }

  public void aceptarPropuestaQuitar(Prenda unaPrenda) {
    listaDePrendas.remove(unaPrenda);
  }

  public void deshacerAgregado(Prenda unaPrenda) {
    listaDePrendas.remove(unaPrenda);
  }

  public void deshacerQuitado(Prenda unaPrenda) {
    agregarPrenda(unaPrenda);
  }
}
