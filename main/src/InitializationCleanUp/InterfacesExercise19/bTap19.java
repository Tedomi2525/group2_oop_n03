package InitializationCleanUp.InterfacesExercise19;

public class bTap19 {

	public static void printString(String...strings) {
		for(String s: strings) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Passing comma-separated list of Strings:");
        printString("One", "Two", "Three", "Four");

        // Truyền vào một mảng String[]
        System.out.println("\nPassing a String[] array:");
        String[] stringArray = {"Five", "Six", "Seven", "Eight"};
        printString(stringArray);
	}
}

//Danh sách các chuỗi: Các chuỗi "One", "Two", "Three", "Four" 
//được truyền vào như các đối số riêng lẻ và được in ra.
//Mảng String[]: Mảng stringArray chứa các chuỗi "Five", "Six", "Seven", "Eight"
//được truyền vào như một đối số duy nhất, và các phần tử trong mảng cũng được in ra.