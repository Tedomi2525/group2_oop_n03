package InitializationCleanUp.InterfacesExercise18;

public class bTap18 {

	bTap18(String message) {
		System.out.println("Dem so: "+message);
	}
	
	public static void main(String[] args) {
		bTap18[] mang = new bTap18[5];
		for(int i = 0; i < mang.length; i++) {
			mang[i] = new bTap18("" +(i + 1));
		}
	}
}

//Dem so: 1
//Dem so: 2
//Dem so: 3
//Dem so: 4
//Dem so: 5