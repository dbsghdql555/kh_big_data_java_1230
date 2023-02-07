package 게임만들기;

public interface GameAction {
    double pAttack(); // 물리 공격력
    double mAttack(); // 마법 공격력
    int ultimate();
    boolean setDamage(double damage);

}
