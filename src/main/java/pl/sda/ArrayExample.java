package pl.sda;

public class ArrayExample {

    public static String[] removeDuplicates(String[] strings) {
        String[] removedDuplicatesArray = new String[0];
        for (String original : strings) {
            boolean isAlreadyInArray = false;
            for (String string : removedDuplicatesArray){
                if (original.equals(string)){
                    isAlreadyInArray = true;
                    break;
                }
            }
            if (!isAlreadyInArray) {
                int current = removedDuplicatesArray.length;
                removedDuplicatesArray = new String[current + 1];
                removedDuplicatesArray[current] = original;
            }
        }
        return removedDuplicatesArray;
    }

}
