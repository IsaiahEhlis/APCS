package lab23f_recursion_garbage;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  - 

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class GarbageCollector extends JPanel implements MouseListener {

    private int mouseX, mouseY;
    private boolean mouseClicked;
    private Grid trashMap;
    private final static int rows = 20;
    private final static int cols = 20;

    public GarbageCollector() {
        mouseClicked = false;
        trashMap = new Grid(rows, cols);
        for (int r = 0; r < trashMap.getNumRows(); r++) {
            for (int c = 0; c < trashMap.getNumCols(); c++) {
                int num = (int) (Math.random() * 2);
                if (num == 1) {
                    trashMap.setSpot(r, c, new ColoredCell(r * rows + 10, c * cols + 10, 10, 10, true, Color.ORANGE));
                }
                //else
                //load in a different Cell
            }
        }

        setBackground(Color.white);
        setVisible(true);

        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        mouseClicked = true;
        repaint();
    }

    public void paintComponent(Graphics window) {
        super.paintComponent(window);
        window.setFont(new Font("TAHOMA", Font.BOLD, 12));
        window.setColor(Color.blue);
        window.drawString("Lab24c", 420, 40);
        window.drawString("THE GARBAGE COLLECTOR LAB", 420, 55);
        if (mouseClicked) {
            int c = mouseY / cols;
            int r = mouseX / rows;
            pickUpTrash(r, c);
            mouseClicked = false;
        }
        drawTrashMap(window);
    }

    public void drawTrashMap(Graphics window) {
    }

    public void pickUpTrash(int r, int c) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }
}
