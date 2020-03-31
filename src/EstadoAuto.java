public enum EstadoAuto implements IEstadoAuto{
    ESTADO_ENCENDIDO {
        @Override
        public void encender(Auto auto) throws Exception {
            throw new Exception("El auto debe estar apagado para poder encenderlo");
        }

        @Override
        public void apagar(Auto auto) {
            auto.setNewEstado(EstadoAuto.ESTADO_APAGADO);
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

        @Override
        public boolean estaEncendido() {
            return true;
        }
    },
    ESTADO_APAGADO {
        @Override
        public void encender(Auto auto) {
            auto.setNewEstado(EstadoAuto.ESTADO_ENCENDIDO);
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

        @Override
        public boolean estaEncendido() {
            return false;
        }
    }
}
