package arraymerge;

public class ArrayMerge {
	    public static void main(String[] args) {
	        String[] array1 = {"Aa", "Pu", "Ru"};
	        String[] array2 = {"Bittu", "Go", "Swift"};

	        String[] mergedArray = mergeArrays(array1, array2);

	        System.out.println("Merged Array: ");
	        for (String s : mergedArray) {
	            System.out.println(s);
	        }
	    }

	    public static String[] mergeArrays(String[] array1, String[] array2) {
	        String[] result = new String[array1.length + array2.length];

	        int i = 0;
	        for (String s : array1) {
	            result[i++] = s;
	        }
	        for (String s : array2) {
	            result[i++] = s;
	        }

	        return result;
	    }
	}
