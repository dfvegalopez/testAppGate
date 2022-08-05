package Service;

import Model.Subsequences;
import shared.Util;

public class DistinctSubsequenceService {

    Subsequences subsequences;

    public DistinctSubsequenceService(Subsequences subsequences) {
        this.subsequences = subsequences;
    }

    public String getFirstString() {
        return this.subsequences.getFirstString();
    }

    public String getSecondString() {
        return this.subsequences.getSecondString();
    }

    public int getDistinctSubsequence() {
        int firsStringLength = getFirstString().length();
        int secondStringLength = getSecondString().length();
        if (secondStringLength > firsStringLength) throw new IllegalArgumentException("The second string can't be higher than first string");
        if (secondStringLength == 0 || firsStringLength == 0) throw new IllegalArgumentException("The first and second string must have values");

        int [][] controlValueArray = createInitialArray(firsStringLength, secondStringLength);
        String [] firstArray = Util.getStringArray(getFirstString());
        String [] secondArray = Util.getStringArray(getSecondString());

        for (int i = 0; i < firsStringLength; i++) {
            for (int j = 0; j < secondStringLength; j++) {
                if (firstArray[i].equals(secondArray[j])) {
                    controlValueArray[i+1][j+1] = controlValueArray[i][j]+ controlValueArray[i][j+1];
                } else {
                    controlValueArray[i+1][j+1] = controlValueArray[i][j+1];
                }
            }
        }
        return controlValueArray[firsStringLength][secondStringLength];
    }

    private int[][] createInitialArray(int firstStringLength, int secondStringLength) {
        int[][] initArray = new int[firstStringLength+1][secondStringLength+1];
        for (int i = 0; i < firstStringLength+1; i++) {
            for (int j = 0; j < secondStringLength+1; j++) {
                if (j == 0) initArray[i][j] = 1;
                else initArray[i][j] = 0;
            }
        }
        return initArray;
    }


}
