/*
 * ejercicio extra que calcula la nota media para clase de programacion
 */
package personal;

import java.util.Scanner;

/**
 *
 * @author lara vazquez dorna
 */
public class Notas {

    //leer por teclado
    Scanner teclado = new Scanner(System.in);
    //atributos
    private double notaTeoria;
    private double notaPractica;
    private int notaBoletin;

    public double pedirNota() {

        double nota;
        do {
            System.out.println("Introduce la nota:");
            nota = teclado.nextInt();
            teclado.nextLine();

            if (nota < 1 || nota > 10) {
                System.out.println("La nota no es valida");
            }
        } while (nota < 1 || nota > 10);
        return nota;

    }

    public double calcularNotaTeoria() {

        int nExamenes;
        double nota;
        double sumaNotas = 0;
        int contador;

        System.out.println("\nNumero d examenes teoricos realizados: \n");
        nExamenes = teclado.nextInt();

        for (contador = 0; contador < nExamenes; contador++) {
            nota = pedirNota();
            sumaNotas += nota;
        }

        this.notaTeoria = sumaNotas / nExamenes;
        System.out.println("La nota media teorica es " + notaTeoria);
        return notaTeoria;
    }

    public double calcularNotaPractica() {
        int nExamenes;
        double nota;
        double sumaNotas = 0;
        int contador;

        System.out.println("\nNumero d examenes practicos realizados: \n");
        nExamenes = teclado.nextInt();

        for (contador = 0; contador < nExamenes; contador++) {
            nota = pedirNota();
            sumaNotas += nota;
        }
        this.notaPractica = sumaNotas / nExamenes;
        System.out.println("La nota media de los examenes practicos son " + notaPractica);
        return notaPractica;
    }

    public double calcularNotaBoletines() {
        int nBoletines;
        int realizados;
        int porcentaje;
        System.out.println("\nNumero de boletines totales: \n");
        nBoletines = teclado.nextInt();
        System.out.println("\nNumero de boletines realizados: \n");
        realizados = teclado.nextInt();

        porcentaje = (realizados / nBoletines) * 100;
        if (porcentaje > 90) {
            this.notaBoletin = 2;
        } else if (porcentaje > 70) {
            this.notaBoletin = 1;
        } else {
            this.notaBoletin = 0;
        }
        System.out.println("La nota de los boletines es "+this.notaBoletin);
        return notaBoletin;
    }

    public void calcularNotaFinal() {

        notaTeoria = (calcularNotaTeoria() * 40) / 100;
        notaPractica = (calcularNotaPractica() * 40) / 100;
        notaBoletin = (int) ((calcularNotaBoletines() * 20) / 100);
        int notaFinal = (int) (this.notaTeoria + this.notaPractica + this.notaBoletin);
        System.out.println("\n La Nota final es de :" + notaFinal);
    }
}
