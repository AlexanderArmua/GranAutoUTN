class EstadoAuto {
    public static class EstadoApagado implements IEstadoAuto {

        @Override
        public void encender(Auto auto) {
            auto.setNewEstado(new EstadoEncendido());
            auto.getMotor().encender();
            auto.getTanqueNafta().encender();
        }

        @Override
        public void apagar(Auto auto) throws Exception {
            throw new Exception("El auto debe estar encendido para poder apagarlo");
        }

        @Override
        public void acelerar(Double _kph, Auto auto) throws Exception {
            throw new Exception("El auto debe estar encendido para poder acelerarlo");
        }

        @Override
        public void detenerse(Auto auto) throws Exception {
            throw new Exception("El auto debe estar encendido para poder detenerlo");
        }

        @Override
        public boolean estaEnReserva(Auto _auto) throws Exception {
            throw new Exception("El auto debe estar encendido para poder preguntar sobre su tanque");
        }

        @Override
        public boolean estaProximoAReserva(Auto _auto) throws Exception {
            throw new Exception("El auto debe estar encendido para poder preguntar sobre su tanque");
        }
    }

    public static class EstadoEncendido implements IEstadoAuto {

        @Override
        public void encender(Auto auto) throws Exception {
            throw new Exception("El auto debe estar apagado para poder encenderlo");
        }

        @Override
        public void apagar(Auto auto) {
            auto.setNewEstado(new EstadoApagado());
            auto.getMotor().apagar();
        }

        @Override
        public void acelerar(Double kph, Auto auto) {
            auto.getMotor().acelerar(kph);
        }

        @Override
        public void detenerse(Auto auto) {
            auto.getMotor().detenerse();
        }

        @Override
        public boolean estaEnReserva(Auto auto)  {
            return auto.getTanqueNafta().estaEnReserva();
        }

        @Override
        public boolean estaProximoAReserva(Auto auto) {
            return auto.getTanqueNafta().estaProximoAReserva();
        }
    }
}