package com.zipcodewilmington.looplabs;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }
//    public Integer[] countRepeats(){
//        Integer[] numOfDupes = new Integer[array.length];
//        for (int i=0; i<array.length; i++){
//            int counter = 1;
//            for (int j=0; j<array.length; j++){
//                if (i != j){
//                    if (array[i] == array[j]){
//                        counter++;
//                    }
//                }
//            }
//            numOfDupes[i] = counter;
//        }
//        return numOfDupes;
//    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] tempArray = new Integer[array.length];
        int j = 0;
        Integer currentNumber = array[0];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (currentNumber.equals(array[i])) {
                counter++;
            }else{
                if (counter < maxNumberOfDuplications){
                    while(counter > 0){
                        tempArray[j++] = currentNumber;
                        counter--;
                    }
                }
                currentNumber = array[i];
                counter = 1;
            }
        }
        Integer[] results = new Integer[j];
        for (int i = 0; i < results.length; i++) {
            results[i] = tempArray[i];
        }
        return results;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] tempArray = new Integer[array.length];
        int j = 0;
        Integer currentNumber = array[0];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (currentNumber.equals(array[i])) {
                counter++;
            }else{
                if (counter !=exactNumberOfDuplications) {
                    while (counter > 0) {
                        tempArray[j++] = currentNumber;
                        counter--;
                    }

                }
                currentNumber = array[i];
                counter = 1;
            }
        }
        if (counter !=exactNumberOfDuplications) {
            while (counter > 0) {
                tempArray[j++] = currentNumber;
                counter--;
            }
        }

        Integer[] results = new Integer[j];
        for (int i = 0; i < results.length; i++) {
            results[i] = tempArray[i];
        }
        return results;
    }
}
