public class TanqueNafta {
    private Double capacidadTotal;
    private Double naftaRestante;

    public TanqueNafta(Double litrosNafta) {
        capacidadTotal = litrosNafta;
        naftaRestante = litrosNafta;
    }

    public boolean estaEnReservaOProximo() {
        return estaEnReserva() || estaProximoAReserva();
    }

    public void encender() {
        naftaRestante *= 0.999;
    }

    public void consumirNaftaPorKmph(Double kmph) {
        Double consumicion = kmph * 0.133;
        if (naftaRestante > consumicion) {
            naftaRestante -= consumicion;
        } else {
            naftaRestante = 0D;
        }
    }

    private boolean estaProximoAReserva() {
        return (capacidadTotal * 0.15) >= naftaRestante;
    }

    private boolean estaEnReserva() {
        return (capacidadTotal * 0.10) >= naftaRestante;
    }
}