package living;

import Interface.Attacker;
import Interface.Defenser;
import Interface.LivingThing;

public class LivingObject implements LivingThing {

    double number = 2.0;
    double attackParam = 1.0;
    double aginstParam = 0.5;
    double defenseParam = 0.01;


    public Object attack(Defenser defenser) {
        defenser.defense(this);
        setNowNumber(getNowNumber() - defenser.getAgainstParam(defenser));
        return null;
    }

    public double getAttackParam(Object para) {
        return number * attackParam;
    }

    public Object defense(Attacker attacker) {
        setNowNumber(getNowNumber() - attacker.getAttackParam(attacker)*(1-getDefensetParam(attacker)));
        return null;
    }

    public double getAgainstParam(Object para) {
        return number * aginstParam * attackParam;
    }

    public double getDefensetParam(Object para) {
        return defenseParam;
    }

    public Object die(Object param) {
        return null;
    }

    public Object move(Object o) {
        return null;
    }

    public Object produce(Object param) {
        setNowNumber(getNowNumber() / 2 + getNowNumber());
        return null;
    }

    public double getNowNumber() {
        return number;
    }

    public double setNowNumber(double number) {
        int n = (int) number;
        this.number = n < 0 ? 0 : n;
        return this.number;
    }
}
