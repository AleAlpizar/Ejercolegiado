/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico2;

/**
 *
 * @author 11alp
 */
public class SpotifyTop10 {
    private int numeroCanciones;
    private int[] ids;
    private String[] titulos;
    private String[] autores;
    private double[] duraciones;
    private int[] anosCreacion;

    public SpotifyTop10(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
        ids = new int[numeroCanciones];
        titulos = new String[numeroCanciones];
        autores = new String[numeroCanciones];
        duraciones = new double[numeroCanciones];
        anosCreacion = new int[numeroCanciones];
    }

    public void agregarCancion(int indice, int id, String titulo, String autor, double duracion, int anoCreacion) {
        if (indice >= 0 && indice < numeroCanciones) {
            ids[indice] = id;
            titulos[indice] = titulo;
            autores[indice] = autor;
            duraciones[indice] = duracion;
            anosCreacion[indice] = anoCreacion;
        } 
    }

    public String cancionesAnterioresAlAnoActual() {
        int anoActual = java.time.Year.now().getValue();
        StringBuilder resultado = new StringBuilder("canciones de años anteriores al actual \n");
        for (int i = 0; i < numeroCanciones; i++) {
            if (anosCreacion[i] < anoActual) {
                resultado.append("id: ").append(ids[i]).append(", titulo: ").append(titulos[i]).append(", autor: ").append(autores[i])
                        .append(", duracion: ").append(duraciones[i]).append(", año de creacion: ").append(anosCreacion[i]).append("\n");
            }
        }
        return resultado.toString();
    }

    public String cancionesDelAnoActual() {
        int anoActual = java.time.Year.now().getValue();
        StringBuilder resultado = new StringBuilder("canciones de este año:\n");
        for (int i = 0; i < numeroCanciones; i++) {
            if (anosCreacion[i] == anoActual) {
                resultado.append("id: ").append(ids[i]).append(", titulo: ").append(titulos[i]).append(", autor: ").append(autores[i])
                        .append(", duracion: ").append(duraciones[i]).append(", año de creacion: ").append(anosCreacion[i]).append("\n");
            }
        }
        return resultado.toString();
    }

    public String cancionesPosterioresAlAnoActual() {
        int anoActual = java.time.Year.now().getValue();
        StringBuilder resultado = new StringBuilder("cancione despues de este año: \n");
        for (int i = 0; i < numeroCanciones; i++) {
            if (anosCreacion[i] > anoActual) {
                resultado.append("ID: ").append(ids[i]).append(", Título: ").append(titulos[i]).append(", Autor: ").append(autores[i])
                        .append(", Duración: ").append(duraciones[i]).append(", Año de creación: ").append(anosCreacion[i]).append("\n");
            }
        }
        return resultado.toString();
    }

    public String cancionDeMayorDuracion() {
        double maxDuracion = 0;
        int indiceMaxDuracion = -1;
        for (int i = 0; i < numeroCanciones; i++) {
            if (duraciones[i] > maxDuracion) {
                maxDuracion = duraciones[i];
                indiceMaxDuracion = i;
            }
        }
        if (indiceMaxDuracion != -1) {
            return "cancion de mayor duracinn:\n" +
                    "id: " + ids[indiceMaxDuracion] + ", titulo: " + titulos[indiceMaxDuracion] +
                    ", autor: " + autores[indiceMaxDuracion] + ", duracion: " + duraciones[indiceMaxDuracion] +
                    ", año de creacion: " + anosCreacion[indiceMaxDuracion];
        } 
        return null;
    }
    public String autorDePrimeraCancion() {
        if (autores[0] != null) {
            return "autor en la primera posicion: " + autores[0];
        } 
        return null;
    }

    public String mostrarTodasCanciones() {
        StringBuilder resultado = new StringBuilder("aqui se muestra todas las canciones :\n");
        for (int i = 0; i < numeroCanciones; i++) {
            if (titulos[i] != null) {
                resultado.append("id: ").append(ids[i]).append(", titulo: ").append(titulos[i]).append(", autor: ").append(autores[i])
                        .append(", duracion: ").append(duraciones[i]).append(", año de creacion: ").append(anosCreacion[i]).append("\n");
            }
        }
        return resultado.toString();
    }
}