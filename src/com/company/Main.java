package com.company;

public class Main {

    public static void main(String args[]) {

        Taxi taxiUno = new Taxi();
        taxiUno.setCiudad("Colombia");
        taxiUno.setMatricula("YQE52D");°
        taxiUno.setDistrito("Cundinamarca");
        taxiUno.setTipoMotor(15);

        System.out.println("La ciudad es " + taxiUno.getCiudad() + " la matricula " + taxiUno.getMatricula()
                + " con distrito en " + taxiUno.getDistrito() + " y el tipo de motor es " + taxiUno.getTipoMotor());

        System.out.println("Uso de datos " + taxiUno.getTipoMotor() * 5 );

    }

    public static class Taxi {
        private String ciudad;
        private String matricula;
        private String distrito;
        private int tipoMotor;

        public void setCiudad(String valorCiudad) {
            ciudad = valorCiudad;
        }

        public void setMatricula(String valorMatricula) {
            matricula = valorMatricula;
        }

        public void setDistrito(String valorDistrito) {
            distrito = valorDistrito;
        }

        public void setTipoMotor(int valorTipoMotor) {
            tipoMotor = valorTipoMotor;
        }

        public String getCiudad() {
            return ciudad;
        }

        public String getMatricula() {
            return matricula;
        }

        public String getDistrito() {
            return distrito;
        }

        public int getTipoMotor() {
            return tipoMotor;
        }
    }

}
