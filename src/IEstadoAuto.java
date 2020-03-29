public interface IEstadoAuto {
    void encender(Auto auto);
    void apagar(Auto auto);
    void acelerar(Double kph, Auto auto) throws Exception;
    void detenerse(Auto auto);
    boolean estaEnReservaOProximo(Auto auto) throws Exception;
}
