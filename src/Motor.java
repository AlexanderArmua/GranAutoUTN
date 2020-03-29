public class Motor {
    private double temperaturaMotor;
    private double velocidad;

    public Motor() {
        temperaturaMotor = 0d;
        velocidad = 0d;
    }

    public void encender() {
        aumentarTemperatura(70);
    }

    public void apagar() {
        disminuirTemperatura(temperaturaMotor);
    }

    public double getTemperatura() {
        return temperaturaMotor;
    }

    public void detenerse() {
        aumentarTemperatura(0.04 * velocidad);
        velocidad = 0;
    }

    public void acelerar(Double kmph) {
        aumentarTemperatura(0.2 * kmph);
        velocidad = kmph;
    }
    private void enfriarSiEsNecesario() {
        if (estaCaliente()) {
            disminuirTemperatura(15);
        }
    }

    private void aumentarTemperatura(double temperatura) {
        temperaturaMotor += Math.abs(temperatura);
        enfriarSiEsNecesario();
    }

    private void disminuirTemperatura(double temperatura) {
        temperaturaMotor -= Math.abs(temperatura);
        enfriarSiEsNecesario();
    }

    private boolean estaCaliente() {
        return temperaturaMotor > 95;
    }
}
