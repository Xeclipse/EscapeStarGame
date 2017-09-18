package Interface;

public interface LivingThing extends Attacker, Defenser, Mover, Reproducer, Die {
    double getNowNumber();
    double setNowNumber(double number);
}
