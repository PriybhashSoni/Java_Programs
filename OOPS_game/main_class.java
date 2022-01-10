import java.util.jar.Attributes.Name;

public class main_class {
 public static void main(String[] args) {
     player1 player=new player1("py","sword",100);
    //  System.out.println(player.getName());
    //  System.out.println(player.getWeapon());
    //  System.out.println(player.getHealth());
    // player.damage_gun1();
    // player.damage_gun1();
    // player.damage_gun2();

    player2 betterplayer=new player2("hero","hammer", 80, true);
    betterplayer.damage_gun1();
    betterplayer.damage_gun1();
    player.heal();
 }
}
