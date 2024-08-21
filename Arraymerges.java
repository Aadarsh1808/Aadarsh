package arraymerge;

public class Arraymerges {
	    public static void main(String[] args) {
	        String[] array1 = {"J", "P", "C"};
	        String[] array2 = {"Java", "Python", "C++"};

	        String[] mergedArray = mergeArrays(array1, array2);

	        System.out.println("Merged Array: ");
	        for (String s : mergedArray) {
	            System.out.println(s);
	        }
	    }

	    public static String[] mergeArrays(String[] array1, String[] array2) {
	        String[] result = new String[array1.length + array2.length];

	        System.arraycopy(array1, 0, result, 0, array1.length);
	        System.arraycopy(array2, 0, result, array1.length, array2.length);

	        return result;
	    }
	}


