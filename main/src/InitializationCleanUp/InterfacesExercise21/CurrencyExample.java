package InitializationCleanUp.InterfacesExercise21;

public class CurrencyExample {

    enum Currency {
        ONE_DOLLAR, TWO_DOLLARS, FIVE_DOLLARS, TEN_DOLLARS, TWENTY_DOLLARS, FIFTY_DOLLARS
    }

    public static void main(String[] args) {
        // Lặp qua tất cả các giá trị của enum Currency
        for (Currency c : Currency.values()) {
            // In ra tên và chỉ số thứ tự (ordinal) của mỗi giá trị
            System.out.println(c + " ordinal: " + c.ordinal());
        }
    }
}



