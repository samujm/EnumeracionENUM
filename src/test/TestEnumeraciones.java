package test;

import enumeracion.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {
        //Acceder es como si fuera un atributo
        System.out.println("Dia 1 = " + Dias.LUNES);
        indicarDiaSemana(Dias.MARTES); //No se puede mandar cadena ya que es tipo enumeración
    }

    public static void indicarDiaSemana(Dias dias) {
        switch(dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;

        }
    }

}
