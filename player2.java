import java.lang.reflect.Constructor;

public class player2 extends player1 {

    private int health;
    private boolean armour;

    public player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damage_gun1() {
        // TODO Auto-generated method stub
        if (armour) {
            this.health -= 20;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("armour is on got hit by gun 1.health is reduced by 20" + "new health is " + this.health);

        }
        if (!armour) {
            this.health -= 30;
            if (this.health <= 0)
                this.health = 0;
            System.out
                    .println("armour is off got hit by gun 1.health is reduced by 40" + "new health is " + this.health);
        }
        if (this.health == 0) {
            System.out.println(getName() + "player is dead");
        }
    }

    @Override
    public void damage_gun2() {
        if (armour) {
            this.health -= 40;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("armour is on got hit by gun 1.health is reduced by 40" + "new health is " + this.health);
        }
        if (!armour) {
            this.health -= 50;
            if (this.health <= 0)
                this.health = 0;
            System.out.println("armour is off got hit by gun 1.health is reduced by 50" + "new health is " + this.health);
        }
        if (this.health == 0) {
            System.out.println(getName() + "player is dead");
        }
    }
    @Override
    public void heal() {
        // TODO Auto-generated method stub
        super.heal();
    }
}
