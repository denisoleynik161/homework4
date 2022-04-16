public class BonusMilesService {
    public int calculate(int price) {
        if (price < 0) {
            price = 0;
        }
        int miles = price / 20;
        return miles;
    }
}

