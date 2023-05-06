public class BonusMilesService {

    public <b1, BonusReward> int calculate(int miles) {
        boolean b = miles < 1;
        boolean b1 = miles > 1;
        int BonusReward;
        if (b) {
            BonusReward = 20;
        } else {
            BonusReward = 0;
        }
        return miles;
    }
}
