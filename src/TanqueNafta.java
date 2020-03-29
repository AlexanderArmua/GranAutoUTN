public class TanqueNafta {
    private Double capacidadTotal;
    private Double naftaRestante;

    public TanqueNafta(Double litrosNafta) {
        capacidadTotal = litrosNafta;
        naftaRestante = litrosNafta;
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

    public boolean estaProximoAReserva() {
        return (capacidadTotal * 0.15) >= naftaRestante;
    }

    public boolean estaEnReserva() {
        return (capacidadTotal * 0.10) >= naftaRestante;
    }

    public void cargarCombustible(Double litros) {
        Double naftaFinal = naftaRestante + litros;

        if (naftaFinal > capacidadTotal) {
            naftaRestante = capacidadTotal;
        } else {
            naftaRestante = naftaFinal;
        }
    }
}