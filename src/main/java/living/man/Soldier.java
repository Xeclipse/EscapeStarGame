package living.man;
import Interface.Attacker;
import Interface.Defenser;
import equipment.Equipment;
import equipment.Shield;
import equipment.Weapon;
import living.LivingObject;

public class Soldier extends Human {
    private Weapon weapon = new Weapon();
    private Shield shield = new Shield();
    public void equip(Equipment e){
        Class c=e.getClass();
        if(c.isInstance(weapon)){
            this.weapon=(Weapon)e;
        }
        else if(c.isInstance(shield)){
            this.shield=(Shield)e;
        }
    }

    @Override
    public double getAttackParam(Object obj) {
        return super.getAttackParam(obj)*this.weapon.attackParam;
    }

    @Override
    public double getAgainstParam(Object obj) {
        return super.getAgainstParam(obj)*this.weapon.attackParam;
    }

    @Override
    public double getDefensetParam(Object para) {
        return super.getDefensetParam(para)+shield.defenseParam;
    }
}
