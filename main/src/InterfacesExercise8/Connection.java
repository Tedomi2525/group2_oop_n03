package InterfacesExercise8;

public class Connection {
    // Constructor private ngăn không cho tạo đối tượng từ bên ngoài
    private Connection() {
        System.out.println("Connection created");
    }

    // Phương thức tĩnh để tạo đối tượng Connection
    static Connection create() {
        return new Connection();
    }
}
