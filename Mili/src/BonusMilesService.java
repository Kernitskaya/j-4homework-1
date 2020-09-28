public class BonusMilesService {
    static final long BONUS_FACTOR = 1;
    static final long BONUS_COST = 20;

    public int calculate(int ticketCost) {
        return (int) (ticketCost/BONUS_COST*BONUS_FACTOR);
    }
}
