package Service;

import Model.Subsequences;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DistinctSubsequenceServiceTest {

    private Subsequences subsequences;
    private DistinctSubsequenceService distinctSubsequenceService;


    @Test
    public void validateDistinctSubsequences() {
        whenSubsequencesAreValid();
        assertTrue(distinctSubsequenceService.getDistinctSubsequence()==0);
    }

    private void whenSubsequencesAreValid() {
        subsequences = new Subsequences();
        subsequences.setFirstString("rabbbit");
        subsequences.setSecondString("rabbit");
        distinctSubsequenceService = new DistinctSubsequenceService(subsequences);
    }

}