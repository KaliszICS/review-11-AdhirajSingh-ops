public class PracticeProblem {

	public static void main(String args[]) {
    
	}
 public static int[] createIntArray() {
        int[] intArray = new int[5];
        for (int i = 0; i < 5; i++) {
            
            intArray[i] = i + 1;
        }
        return intArray;
    }

	public static String[] createArray(String str1, String str2, String str3, String str4) {
        String[] newArray = new String[4];
        newArray[0] = str1;
        newArray[1] = str2;
        newArray[2] = str3;
        newArray[3] = str4;
        return newArray;
	}

	public static int findValue(int value, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static int findThirdValue(String value, String[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(value)) {
				count++;
				if (count == 3) {
					return i;
				}
			}
		}
		return -1;
	}

}
