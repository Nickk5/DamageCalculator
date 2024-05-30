public class Damage
{

    double[][] type = new double[19][19];

    /**
     * @ Class constructor
     */
    public Damage()
    {
        initializeTypeChart();
    }

    /**
     * @ Takes in no param and sets up the type chart
     * defending type is the col and attacking type is the row
     * numbers corresponding to type:
     * 0: typeless (Yes this is a real thing in pokemon but can be used for no second type)
     * 1: normal
     * 2: fighting
     * 3: flying
     * 4: poison
     * 5: ground
     * 6: rock
     * 7: bug
     * 8: ghost
     * 9: steel
     * 10: fire
     * 11: water
     * 12: grass
     * 13: electric
     * 14: psychic
     * 15: ice
     * 16: dragon
     * 17: dark
     * 18: fairy
     */
    public void initializeTypeChart() {
        for (int i = 0; i < 19; i++) {
            type[0][i] = 1;
            type[i][0] = 1;
        }
        typeAdding();
    }
    /**
     * @ manually adds in all the typing information
     */
    public void typeAdding()
    {
        type[1][1] = 1;
        type[1][2] = 1;
        type[1][3] = 1;
        type[1][4] = 1;
        type[1][5] = 1;
        type[1][6] = 0.5;
        type[1][7] = 1;
        type[1][8] = 0;
        type[1][9] = 0.5;
        type[1][10] = 1;
        type[1][11] = 1;
        type[1][12] = 1;
        type[1][13] = 1;
        type[1][14] = 1;
        type[1][15] = 1;
        type[1][16] = 1;
        type[1][17] = 1;
        type[1][18] = 1;
        type[2][1] = 2;
        type[2][2] = 1;
        type[2][3] = 0.5;
        type[2][4] = 0.5;
        type[2][5] = 1;
        type[2][6] = 2;
        type[2][7] = 0.5;
        type[2][8] = 0;
        type[2][9] = 2;
        type[2][10] = 1;
        type[2][11] = 1;
        type[2][12] = 1;
        type[2][13] = 1;
        type[2][14] = 0.5;
        type[2][15] = 2;
        type[2][16] = 1;
        type[2][17] = 2;
        type[2][18] = 0.5;
        type[3][1] = 1;
        type[3][2] = 2;
        type[3][3] = 1;
        type[3][4] = 1;
        type[3][5] = 1;
        type[3][6] = 0.5;
        type[3][7] = 2;
        type[3][8] = 1;
        type[3][9] = 0.5;
        type[3][10] = 1;
        type[3][11] = 1;
        type[3][12] = 2;
        type[3][13] = 0.5;
        type[3][14] = 1;
        type[3][15] = 1;
        type[3][16] = 1;
        type[3][17] = 1;
        type[3][18] = 1;
        type[4][1] = 1;
        type[4][2] = 1;
        type[4][3] = 1;
        type[4][4] = 0.5;
        type[4][5] = 0.5;
        type[4][6] = 0.5;
        type[4][7] = 1;
        type[4][8] = 0.5;
        type[4][9] = 0;
        type[4][10] = 1;
        type[4][11] = 1;
        type[4][12] = 2;
        type[4][13] = 1;
        type[4][14] = 1;
        type[4][15] = 1;
        type[4][16] = 1;
        type[4][17] = 1;
        type[4][18] = 2;
        type[5][1] = 1;
        type[5][2] = 1;
        type[5][3] = 0;
        type[5][4] = 2;
        type[5][5] = 1;
        type[5][6] = 2;
        type[5][7] = 0.5;
        type[5][8] = 1;
        type[5][9] = 2;
        type[5][10] = 2;
        type[5][11] = 1;
        type[5][12] = 0.5;
        type[5][13] = 2;
        type[5][14] = 1;
        type[5][15] = 1;
        type[5][16] = 1;
        type[5][17] = 1;
        type[5][18] = 1;
        type[6][1] = 1;
        type[6][2] = 0.5;
        type[6][3] = 2;
        type[6][4] = 1;
        type[6][5] = 0.5;
        type[6][6] = 1;
        type[6][7] = 2;
        type[6][8] = 1;
        type[6][9] = 0.5;
        type[6][10] = 2;
        type[6][11] = 1;
        type[6][12] = 1;
        type[6][13] = 1;
        type[6][14] = 1;
        type[6][15] = 2;
        type[6][16] = 1;
        type[6][17] = 1;
        type[6][18] = 1;
        type[7][1] = 1;
        type[7][2] = 0.5;
        type[7][3] = 0.5;
        type[7][4] = 0.5;
        type[7][5] = 1;
        type[7][6] = 1;
        type[7][7] = 1;
        type[7][8] = 0.5;
        type[7][9] = 0.5;
        type[7][10] = 0.5;
        type[7][11] = 1;
        type[7][12] = 2;
        type[7][13] = 1;
        type[7][14] = 2;
        type[7][15] = 1;
        type[7][16] = 1;
        type[7][17] = 2;
        type[7][18] = 0.5;
        type[8][1] = 0;
        type[8][2] = 1;
        type[8][3] = 1;
        type[8][4] = 1;
        type[8][5] = 1;
        type[8][6] = 1;
        type[8][7] = 1;
        type[8][8] = 2;
        type[8][9] = 1;
        type[8][10] = 1;
        type[8][11] = 1;
        type[8][12] = 1;
        type[8][13] = 1;
        type[8][14] = 2;
        type[8][15] = 1;
        type[8][16] = 1;
        type[8][17] = 0.5;
        type[8][18] = 1;
        type[9][1] = 1;
        type[9][2] = 1;
        type[9][3] = 1;
        type[9][4] = 1;
        type[9][5] = 1;
        type[9][6] = 2;
        type[9][7] = 1;
        type[9][8] = 1;
        type[9][9] = 0.5;
        type[9][10] = 0.5;
        type[9][11] = 0.5;
        type[9][12] = 1;
        type[9][13] = 0.5;
        type[9][14] = 1;
        type[9][15] = 2;
        type[9][16] = 1;
        type[9][17] = 1;
        type[9][18] = 2;
        type[10][1] = 1;
        type[10][2] = 1;
        type[10][3] = 1;
        type[10][4] = 1;
        type[10][5] = 1;
        type[10][6] = 0.5;
        type[10][7] = 2;
        type[10][8] = 1;
        type[10][9] = 2;
        type[10][10] = 0.5;
        type[10][11] = 0.5;
        type[10][12] = 2;
        type[10][13] = 1;
        type[10][14] = 1;
        type[10][15] = 2;
        type[10][16] = 0.5;
        type[10][17] = 1;
        type[10][18] = 1;
        type[11][1] = 1;
        type[11][2] = 1;
        type[11][3] = 1;
        type[11][4] = 1;
        type[11][5] = 2;
        type[11][6] = 2;
        type[11][7] = 1;
        type[11][8] = 1;
        type[11][9] = 1;
        type[11][10] = 2;
        type[11][11] = 0.5;
        type[11][12] = 0.5;
        type[11][13] = 1;
        type[11][14] = 1;
        type[11][15] = 1;
        type[11][16] = 0.5;
        type[11][17] = 1;
        type[11][18] = 1;
        type[12][1] = 1;
        type[12][2] = 1;
        type[12][3] = 0.5;
        type[12][4] = 0.5;
        type[12][5] = 2;
        type[12][6] = 2;
        type[12][7] = 0.5;
        type[12][8] = 1;
        type[12][9] = 0.5;
        type[12][10] = 0.5;
        type[12][11] = 2;
        type[12][12] = 0.5;
        type[12][13] = 1;
        type[12][14] = 1;
        type[12][15] = 1;
        type[12][16] = 0.5;
        type[12][17] = 1;
        type[12][18] = 1;
        type[13][1] = 1;
        type[13][2] = 1;
        type[13][3] = 2;
        type[13][4] = 1;
        type[13][5] = 0;
        type[13][6] = 1;
        type[13][7] = 1;
        type[13][8] = 1;
        type[13][9] = 1;
        type[13][10] = 1;
        type[13][11] = 2;
        type[13][12] = 0.5;
        type[13][13] = 0.5;
        type[13][14] = 1;
        type[13][15] = 1;
        type[13][16] = 0.5;
        type[13][17] = 1;
        type[13][18] = 1;
        type[14][1] = 1;
        type[14][2] = 2;
        type[14][3] = 1;
        type[14][4] = 2;
        type[14][5] = 1;
        type[14][6] = 1;
        type[14][7] = 1;
        type[14][8] = 1;
        type[14][9] = 0.5;
        type[14][10] = 1;
        type[14][11] = 1;
        type[14][12] = 1;
        type[14][13] = 1;
        type[14][14] = 0.5;
        type[14][15] = 1;
        type[14][16] = 1;
        type[14][17] = 0;
        type[14][18] = 1;
        type[15][1] = 1;
        type[15][2] = 1;
        type[15][3] = 2;
        type[15][4] = 1;
        type[15][5] = 2;
        type[15][6] = 1;
        type[15][7] = 1;
        type[15][8] = 1;
        type[15][9] = 0.5;
        type[15][10] = 0.5;
        type[15][11] = 0.5;
        type[15][12] = 2;
        type[15][13] = 1;
        type[15][14] = 1;
        type[15][15] = 0.5;
        type[15][16] = 2;
        type[15][17] = 1;
        type[15][18] = 1;
        type[16][1] = 1;
        type[16][2] = 1;
        type[16][3] = 1;
        type[16][4] = 1;
        type[16][5] = 1;
        type[16][6] = 1;
        type[16][7] = 1;
        type[16][8] = 1;
        type[16][9] = 0.5;
        type[16][10] = 1;
        type[16][11] = 1;
        type[16][12] = 1;
        type[16][13] = 1;
        type[16][14] = 1;
        type[16][15] = 1;
        type[16][16] = 2;
        type[16][17] = 1;
        type[16][18] = 0;
        type[17][1] = 1;
        type[17][2] = 0.5;
        type[17][3] = 1;
        type[17][4] = 1;
        type[17][5] = 1;
        type[17][6] = 1;
        type[17][7] = 1;
        type[17][8] = 2;
        type[17][9] = 1;
        type[17][10] = 1;
        type[17][11] = 1;
        type[17][12] = 1;
        type[17][13] = 1;
        type[17][14] = 2;
        type[17][15] = 1;
        type[17][16] = 1;
        type[17][17] = 0.5;
        type[17][18] = 0.5;
        type[18][1] = 1;
        type[18][2] = 2;
        type[18][3] = 1;
        type[18][4] = 0.5;
        type[18][5] = 1;
        type[18][6] = 1;
        type[18][7] = 1;
        type[18][8] = 1;
        type[18][9] = 0.5;
        type[18][10] = 0.5;
        type[18][11] = 1;
        type[18][12] = 1;
        type[18][13] = 1;
        type[18][14] = 1;
        type[18][15] = 1;
        type[18][16] = 2;
        type[18][17] = 2;
        type[18][18] = 1;
    }

    /**
     * @param attack attack of a pokemon
     * @param defense defense of a pokemon
     * @param level the level of a pokemon
     * @param attackerType the attacking pokemon's type
     * @param defenderType the defending pokemon's type
     * @param defenderType2 the defending pokemon's type if there is one
     * @param move the move used
     * @return the damage (integer) that a move would deal in a pokemon game, formula is 2 times level dived by 5 + 2 multiplied
     * by base power also multiplied by attack and defense then add 2 then multiply by type interaction and multiply by 1.5 if the attacking pokemon is the same type as the move
     */
    public int damageCalculator(int attack, int defense, int level, int attackerType, int defenderType, int defenderType2, AttackMove move)
    {
        if(attackerType == move.getType()) {
            return (int) (((((((2 * level) / 5) + 2) * move.getBasePower() * (attack / defense)) / 50) + 2) * type[move.getType()][defenderType] * type[move.getType()][defenderType2] * 1.5);
        }
        else
        {
            return (int) (((((((2 * level) / 5) + 2) * move.getBasePower() * (attack / defense)) / 50) + 2) * type[move.getType()][defenderType] * type[move.getType()][defenderType2]);
        }
    }

    /**
     *
     * @param attack attack of a pokemon
     * @param defense defense of a pokemon
     * @param level the level of a pokemon
     * @param attackerType the attacking pokemon's type
     * @param defenderType the defending pokemon's type
     * @param defenderType2 the defending pokemon's type if there is one
     * @param move the move used
     * @return the damage (integer) that a move would deal in a pokemon game the randomness
     * formula is 2 times level dived by 5 + 2 multiplied
     * by base power also multiplied by attack and defense then add 2 then multiply by type interaction and multiply by 1.5 if the attacking pokemon is the same type as the move
     */
    public int damageCalculator(int attack, int defense, int level, int attackerType, int defenderType, int defenderType2, SpecialMove move)
    {
        if(attackerType == move.getType()) {
            return (int) (((((((2 * level) / 5) + 2) * move.getBasePower() * (attack / defense)) / 50) + 2) * type[move.getType()][defenderType] * type[move.getType()][defenderType2] * 1.5 * move.getRandom());
        }
        else
        {
            return (int) (((((((2 * level) / 5) + 2) * move.getBasePower() * (attack / defense)) / 50) + 2) * type[move.getType()][defenderType] * type[move.getType()][defenderType2] * move.getRandom());
        }
    }
}
