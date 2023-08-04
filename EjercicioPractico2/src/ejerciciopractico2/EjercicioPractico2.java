/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico2;

import javax.swing.JOptionPane;

/**
 *
 * @author 11alp
 */
public class EjercicioPractico2 {

    
   public static void main(String[] args) {
        int numeroCanciones = 10;
        SpotifyTop10 spotify = new SpotifyTop10(numeroCanciones);

        for (int i = 0; i < numeroCanciones; i++) {
            int id = i + 1;
            String titulo = JOptionPane.showInputDialog("Cancion " + id + "\nTítulo:");
            String autor = JOptionPane.showInputDialog("autor:");
            double duracion = Double.parseDouble(JOptionPane.showInputDialog("duracion:"));
            int anoCreacion = Integer.parseInt(JOptionPane.showInputDialog("año de creacion:"));

            spotify.agregarCancion(i, id, titulo, autor, duracion, anoCreacion);
        }

        JOptionPane.showMessageDialog(null, spotify.cancionesAnterioresAlAnoActual());
        JOptionPane.showMessageDialog(null, spotify.cancionesDelAnoActual());
        JOptionPane.showMessageDialog(null, spotify.cancionesPosterioresAlAnoActual());
        JOptionPane.showMessageDialog(null, spotify.cancionDeMayorDuracion());
        JOptionPane.showMessageDialog(null, spotify.autorDePrimeraCancion());
        JOptionPane.showMessageDialog(null, spotify.mostrarTodasCanciones());
    }
}