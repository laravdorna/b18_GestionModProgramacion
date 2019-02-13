/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_gestionmodulo;

import personal.*;

/**
 *
 * @author lvazquezdorna
 */
public class Academica {
      static private int numReferencia=2018; //numReferencia  variable  de clase correlativa ( a primeira referencia ten valor  2018 )
         private String  nome;
          private Notas nota ; //( o valor debe estar entre 1 e 10 )   
         private Personal  alumno;
          

    public Academica() {
        numReferencia+=numReferencia;
    }

    public Academica(String nome, Notas nota, Personal alumno) {
        this.nome = nome;
        this.nota = nota;
        this.alumno = alumno;
         numReferencia+=numReferencia;
    }

    
    
    
    public static int getNumReferencia() {
        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia) {
        Academica.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Notas getNota() {
        return nota;
    }

    public void setNota(Notas nota) {
        this.nota = nota;
    }

    public Personal getAlumno() {
        return alumno;
    }

    public void setAlumno(Personal alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Academica{" + "nome=" + nome + ", nota=" + nota + ", alumno=" + alumno + '}';
    }
          
          

}
