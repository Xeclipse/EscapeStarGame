import equipment.Shield;
import equipment.Weapon;
import living.LivingObject;
import living.bugs.Bug;
import living.man.Human;
import living.man.Soldier;

public class test {
    public static void main(String[] args){
        LivingObject s1=new Soldier();
        Weapon gun= new Weapon();
        gun.attackParam= 1.5;
        Shield shield = new Shield();
        shield.defenseParam = 0.9;
        ((Soldier) s1).equip(gun);
        ((Soldier) s1).equip(shield);
        s1.setNowNumber(10);
        LivingObject s2=new Bug();
        s2.setNowNumber(5);
        s2.produce(null);
        s2.produce(null);
        s2.produce(null);
        s2.produce(null);
        s2.produce(null);
        s2.produce(null);
        System.out.println(s1.getNowNumber());
        System.out.println(s2.getNowNumber());
        s2.attack(s1);
        System.out.println(s1.getNowNumber());
        System.out.println(s2.getNowNumber());
    }
}
