public class Motor {
    private double temperaturaMotor;
    private double velocidad;

    public Motor() {
        temperaturaMotor = 0d;
        velocidad = 0d;
    }

    public void encender() {
        alterarTemperaturaMotor(70);
    }

    public void apagar() {
        alterarTemperaturaMotor(-temperaturaMotor);
    }

    public double getTemperatura() {
        return temperaturaMotor;
    }

    public void detenerse() {
        alterarTemperaturaMotor(0.04 * velocidad);
        velocidad = 0;
    }

    public void acelerar(Double kmph) {
        alterarTemperaturaMotor(0.2 * kmph);
        velocidad = kmph;
    }

    private void alterarTemperaturaMotor(double temperatura) {
        temperaturaMotor += temperatura;
        enfriarSiEsNecesario();
    }

    private void enfriarSiEsNecesario() {
        if (estaCaliente()) {
            alterarTemperaturaMotor(-15);
        }
    }

    private boolean estaCaliente() {
        return temperaturaMotor > 95;
    }
}
