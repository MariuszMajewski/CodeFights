import java.lang.reflect.Array;

public class ArrayReplace {

	int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
	    for(int i=0; i<inputArray.length;i++){
	    	if(inputArray[i]==elemToReplace){
	    		Array.setInt(inputArray, i,substitutionElem);
	    	}
	    }
	    return inputArray;
	}
}

/*
 * Beter solution from darek_1
 * 
 * int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
    return Arrays.stream(inputArray).map(o -> o == elemToReplace ? substitutionElem : o).toArray();
}

 */
