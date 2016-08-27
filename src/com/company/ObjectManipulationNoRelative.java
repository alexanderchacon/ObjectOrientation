package com.company;

public class ObjectManipulationNoRelative {

    public static void main(String args[]) {

        Taxi taxiUno = new Taxi();
        taxiUno.setCiudad("Colombia");
        taxiUno.setMatricula("YQE52D");
        taxiUno.setDistrito("Cundinamarca");
        taxiUno.setTipoMotor(16);

        //System.out.println(taxiUno.setTipoMotor() * 8 );

    }

    public static class Taxi {
        private String ciudad;
        private String matricula;
        private String distrito;
        private int tipoMotor;

        public void setCiudad(String valorCiudad) {
            System.out.println("La ciudad es " + valorCiudad);
        }

        public void setMatricula(String valorMatricula) {
            System.out.println("la marticula es " + valorMatricula);
        }

        public void setDistrito(String valorDistrito) {
            System.out.println("la marticula es " + valorDistrito);
        }

        public void setTipoMotor(int valorTipoMotor) {
            System.out.println("la marticula es " + valorTipoMotor);
        }

    }


}
