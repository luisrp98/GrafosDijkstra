/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoGrafo;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 *
 * @author josse
 */
public class Metodos extends Canvas {

    //Dibuja un circulo en la posicion del mouse al hacer click
    //Añade el nombre del nodo que se dio
    public void ciruclo(Graphics g, int x, int y, char[] c) {
        g.drawOval(x - 25, y - 25, 50, 50);
        g.drawChars(c, 0, c.length, x, y);
    }

    public void linea(Graphics g, int x, int y, int x2, int y2) {
    }
}
