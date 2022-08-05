package Service;

import Model.Subsequences;

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
        return 0;
    }


}
