package InterfacesExercise8;

public class ConnectionManager {
    private static final int SIZE = 5; // Kích thước mảng cố định
    private static Connection[] connections = new Connection[SIZE];
    private static int index = 0;

    static {
        for (int i = 0; i < SIZE; i++) {
            connections[i] = Connection.create();
        }
    }

    // Phương thức tĩnh để lấy một Connection từ mảng
    public static Connection getConnection() {
        if (index < SIZE) {
            return connections[index++];
        } else {
            return null; // Trả về null nếu không còn Connection nào
        }
    }
    
    public static void main(String[] args) {
    	for(int i=0; i < 7; i++) {
    		Connection connection = ConnectionManager.getConnection();
    		if(connection != null) {
    			System.out.println("Connection: " +(i+1));
    		}else {
    			System.out.println("No more connections");
    		}
    	}
    }
}
