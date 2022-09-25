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
                String[] newTable = new String[current + 1];
                for (int i = 0; i < current; i++) {
                    newTable[i] = removedDuplicatesArray[i];
                }
                newTable[current] = original;
                removedDuplicatesArray = newTable;
            }
        }
        return removedDuplicatesArray;
    }

}
