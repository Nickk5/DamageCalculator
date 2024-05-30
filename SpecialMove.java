public class SpecialMove extends AttackMove
{
    /**
     * @ class constructor
     */
    double random;
    public SpecialMove(int basePower, int type, double random)
    {
        super(basePower, type);
        this.random = random;
    }

    /**
     * @return random
     */
    public double getRandom() {
        return random;
    }


}
