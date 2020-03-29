public class Auto {

    private Motor motor;
    private TanqueNafta tanqueNafta;
    private IEstadoAuto estadoAuto;

    public Auto(Double litrosNafta) {
        motor = new Motor();
        tanqueNafta = new TanqueNafta(litrosNafta);
        estadoAuto = new EstadoAuto.EstadoApagado();
    }

    public void encender() {
        estadoAuto.encender(this);
    }

    public void apagar() {
        estadoAuto.apagar(this);
    }

    public void acelerar(Double xmh) throws Exception {
        estadoAuto.acelerar(xmh, this);
    }

    public void detenerse() {
        estadoAuto.detenerse(this);
    }

    public boolean estaEnReservaOProximo() throws Exception {
        return estadoAuto.estaEnReservaOProximo(this);
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
