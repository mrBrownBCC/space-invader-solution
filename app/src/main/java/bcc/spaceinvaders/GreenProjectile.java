package bcc.spaceinvaders;

import java.awt.Graphics;
public class GreenProjectile extends Projectile{
    public GreenProjectile(double x, double y, GamePanel game) {
        super(x, y, 0,10, Utilities.BOSS_PROJECTILE_IMAGE, false,  game);
    }

    @Override
    public void update() {
        super.update();
       if(game.getPlayer().getX() > x + width){
          xVelocity += .3;
        } else if(game.getPlayer().getX() < x){
          xVelocity -= .3;
        }
    }

    @Override 
    public void display(Graphics g){
      this.rotation += 5;
      super.display(g);
    }
}
