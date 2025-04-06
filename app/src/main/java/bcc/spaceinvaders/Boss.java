package bcc.spaceinvaders;
import java.awt.Graphics;
public class Boss extends EnemyShip {
    
    public Boss(double x, double y, GamePanel game) {
        super(x, y, 200, 200, Utilities.BOSS_IMAGE, 100, 40,game);
        this.xVelocity = 4; 
        this.yVelocity = 1; 
        this.rotation = 180;
        pointValue = 100; // Set point value for Boss
    }

    @Override
    public void update() {
       if(y > 0){
            yVelocity = 0; // Stop moving down after reaching a certain height
       }

       super.update();
    }

    @Override
    public void shoot() {
        // Boss has a different shooting pattern
        Projectile p = new GreenProjectile(x + width / 2 - Utilities.PROJECTILE_SIZE/2, y + height - Utilities.PROJECTILE_SIZE/2, game);
        game.addProjectile(p);
    }
   
    @Override
    public void display(Graphics g) {
        displayHealthBar(g);
        super.display(g);
        // Additional display logic for TankyEnemy can be added here
    }
}
