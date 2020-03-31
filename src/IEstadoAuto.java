public interface IEstadoAuto {
    void encender(Auto auto) throws Exception;
    void apagar(Auto auto) throws Exception;
    void acelerar(Double kph, Auto auto) throws Exception;
    void detenerse(Auto auto) throws Exception;
    boolean estaEnReserva(Auto auto) throws Exception;
    boolean estaProximoAReserva(Auto auto) throws Exception;
    boolean estaEncendido();
}
