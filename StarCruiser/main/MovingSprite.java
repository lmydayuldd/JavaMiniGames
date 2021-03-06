package main;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class MovingSprite extends Sprite {

    // Direction
    private double dx;
    private double dy;
    private double speed;

    public MovingSprite(double x, double y) {
        super(x, y);
    }

    public MovingSprite(double x, double y, double size) {
        super(x, y, size, size);
    }  

    public MovingSprite(double x, double y, double xSize, double ySize) {
        super(x, y, xSize, ySize);
    }  
    
    public MovingSprite(double x, double y, double xSize, double ySize, double dx, double dy) {
        super(x, y, xSize, ySize);
        this.dx = dx;
        this.dy = dy;
    }  
    
    
    public void move() {
        x += dx;
        y += dy;
        dx *= 1.005;
        dy *= 1.005;
    }
    
    public void grow() {
        xSize += 1.005;
        ySize += 1.005;
    }
}