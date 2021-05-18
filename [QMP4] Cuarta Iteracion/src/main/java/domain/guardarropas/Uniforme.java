package domain.guardarropas;

public class Uniforme {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda prendaCalzado;

  public Uniforme(ParteSuperior unaParteSuperior, ParteInferior unaParteInferior, Calzado unCalzado) {
    this.prendaSuperior = unaParteSuperior;
    this.prendaInferior = unaParteInferior;
    this.prendaCalzado = unCalzado;
  }

}
