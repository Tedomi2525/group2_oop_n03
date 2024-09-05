package InitializationCleanUp.InterfacesExercise22;

public class bTap22 {

    // Tạo enum cho các loại tiền giấy ít giá trị nhất
    enum Currency {
        ONE_DOLLAR, TWO_DOLLARS, FIVE_DOLLARS, TEN_DOLLARS, TWENTY_DOLLARS, FIFTY_DOLLARS
    }

    public static void main(String[] args) {
        // Lặp qua tất cả các giá trị của enum Currency
        for (Currency c : Currency.values()) {
            // Sử dụng câu lệnh switch để in ra mô tả của từng loại tiền giấy
            switch (c) {
                case ONE_DOLLAR:
                    System.out.println("ONE_DOLLAR: A one-dollar bill.");
                    break;
                case TWO_DOLLARS:
                    System.out.println("TWO_DOLLARS: A two-dollar bill.");
                    break;
                case FIVE_DOLLARS:
                    System.out.println("FIVE_DOLLARS: A five-dollar bill.");
                    break;
                case TEN_DOLLARS:
                    System.out.println("TEN_DOLLARS: A ten-dollar bill.");
                    break;
                case TWENTY_DOLLARS:
                    System.out.println("TWENTY_DOLLARS: A twenty-dollar bill.");
                    break;
                case FIFTY_DOLLARS:
                    System.out.println("FIFTY_DOLLARS: A fifty-dollar bill.");
                    break;
                default:
                    System.out.println("Unknown currency.");
                    break;
            }
        }
    }
}

