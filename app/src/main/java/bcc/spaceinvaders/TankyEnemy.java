package bcc.spaceinvaders;
import java.awt.Graphics;
public class TankyEnemy extends EnemyShip {
    
    int dirSwitchTimer = 0;
    int dirSwitchInterval = 100; // Time in milliseconds to switch direction
    public TankyEnemy(double x, double y, GamePanel game) {
        super(x, y, 100, 100, Utilities.TANK_ENEMY_IMAGE,30, 40,game);
        this.xVelocity = 2; 
        this.yVelocity = .5; 
        this.rotation = 180;
        pointValue = 20; // Set point value for TankyEnemy
        dirSwitchTimer = dirSwitchInterval/2;
    }

    @Override
    public void update() {
       if(dirSwitchTimer >= dirSwitchInterval) {
            xVelocity = -xVelocity; 
            dirSwitchTimer = 0;
        } else {
            dirSwitchTimer += 1;
        }
        super.update();
    }

    @Override
    public void display(Graphics g) {
        displayHealthBar(g);
        super.display(g);
        // Additional display logic for TankyEnemy can be added here
    }

   
}
