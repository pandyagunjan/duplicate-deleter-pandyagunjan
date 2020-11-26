package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        String[] tempArray = new String[array.length];
        int j = 0;
        String currentString = array[0];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (currentString.equals(array[i])) {
                counter++;
            }else{
                if (counter < maxNumberOfDuplications){
                    while(counter > 0){
                        tempArray[j++] = currentString;
                        counter--;
                    }
                }
                currentString = array[i];
                counter = 1;
            }
        }
        String[] results = new String[j];
        for (int i = 0; i < results.length; i++) {
            results[i] = tempArray[i];
        }
        return results;

    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String[] tempArray = new String[array.length];
        int j = 0;
        String currentString = array[0];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (currentString.equals(array[i])) {
                counter++;
            }else{
                if (counter != exactNumberOfDuplications){
                    while(counter > 0){
                        tempArray[j++] = currentString;
                        counter--;
                    }
                }
                currentString = array[i];
                counter = 1;
            }
        }
        if (counter != exactNumberOfDuplications){
            while(counter > 0){
                tempArray[j++] = currentString;
                counter--;
            }
        }

        String[] results = new String[j];
        for (int i = 0; i < results.length; i++) {
            results[i] = tempArray[i];
        }
        return results;



    }
}
