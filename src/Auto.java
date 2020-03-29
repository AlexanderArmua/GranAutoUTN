public class Auto {

    private Motor motor;
    private TanqueNafta tanqueNafta;
    private IEstadoAuto estadoAuto;

    public Auto(Double litrosNafta) {
        motor = new Motor();
        tanqueNafta = new TanqueNafta(litrosNafta);
        estadoAuto = new EstadoAuto.EstadoApagado();
    }

    public void encender() throws Exception {
        estadoAuto.encender(this);
    }

    public void apagar() throws Exception {
        estadoAuto.apagar(this);
    }

    public void acelerar(Double xmh) throws Exception {
        estadoAuto.acelerar(xmh, this);
    }

    public void detenerse() throws Exception {
        estadoAuto.detenerse(this);
    }

    public void cargarCombustible(Double litros) {
        tanqueNafta.cargarCombustible(litros);
    }

    public boolean estaEnReserva() throws Exception {
        return estadoAuto.estaEnReserva(this);
    }

    public boolean estaProximoAReserva() throws Exception {
        return estadoAuto.estaProximoAReserva(this);
    }

    public double temperaturaMotor() {
        return motor.getTemperatura();
    }

    public void setNewEstado(IEstadoAuto estadoAuto) {
        this.estadoAuto = estadoAuto;
    }

    public Motor getMotor() {
        return motor;
    }

    public TanqueNafta getTanqueNafta() {
        return tanqueNafta;
    }
}
