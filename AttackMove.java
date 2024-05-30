public class AttackMove
{

    int basePower;
    int type;

    /**
     * @ class constructor
     * @param basePower determines bp of a move
     * @param type determines typing of a move
     */
    public AttackMove(int basePower, int type)
    {
        this.basePower = basePower;
        this.type = type;
    }

    /**
     * @return basePower
     */
    public int getBasePower() {
        return basePower;
    }

    /**
     * @return type
     */
    public int getType() {
        return type;
    }

}
