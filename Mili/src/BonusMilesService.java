public class BonusMilesService {
    static final int BONUS_FACTOR = 1;
    static final int BONUS_COST = 20;

    public int calculate(int ticketCost) {
        return (ticketCost / BONUS_COST * BONUS_FACTOR);
    }
}
