package bcc.spaceinvaders;

import java.awt.Image;



public class EnemyShip extends Ship {
    
    protected int timerCooldown;
    protected int maxCooldown;
    protected int pointValue = 10;
    public EnemyShip(double x, double y,int width, int height,  Image image, int health, int shotCooldown, GamePanel game) {
        super(x, y, width, height, image, health, game);
        maxCooldown = shotCooldown;
        timerCooldown = (int)(Math.random()*shotCooldown);
        
    }

    @Override
    public void update() {
        if(timerCooldown > 0){
            timerCooldown--;
        } else {
            shoot();
            timerCooldown = maxCooldown;
        }

        if(x < 0){
            x = 0;
            xVelocity = Math.abs(xVelocity);
        } else if (x > Utilities.SCREEN_WIDTH - width){
            x = Utilities.SCREEN_WIDTH - width;
            xVelocity = -Math.abs(xVelocity);
        }
        if(y > Utilities.SCREEN_HEIGHT){
            y = -100;
        }
        super.update();
    }

    @Override
    public void handleCollision(GameObject other) {
        if(other instanceof Projectile) {
            Projectile projectile = (Projectile) other;
            if(projectile.isFriendly()) {
                takeDamage(projectile.getDamage());
            }
        }
    }
    
    @Override
    public void shoot(){
        Image bulletImage = null;
        double r = Math.random();
        if(r < .33){
            bulletImage = Utilities.ENEMY_PROJECTILE_1_IMAGE;
        } else if (r < .66){
            bulletImage = Utilities.ENEMY_PROJECTILE_2_IMAGE;
        } else {
            bulletImage = Utilities.ENEMY_PROJECTILE_3_IMAGE;
        }
        Projectile p = new Projectile(x + width / 2 - Utilities.PROJECTILE_SIZE/2, y + height - Utilities.PROJECTILE_SIZE/2, 0, 10,bulletImage, false, game);
        game.addProjectile(p);
    }

    public int getPointValue() {
        return pointValue;
    }
}