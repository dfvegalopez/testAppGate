package Service;

import Model.Subsequences;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class DistinctSubsequenceServiceTest {

    private Subsequences subsequences;
    private DistinctSubsequenceService distinctSubsequenceService;


    @Test
    public void validateDistinctValidSubsequences() {
        whenSubsequencesAreValid();
        assertTrue(distinctSubsequenceService.getDistinctSubsequence()==3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateDistinctNotValidSubsequences() {
        whenSubsequencesAreNotValid();
        assertTrue(distinctSubsequenceService.getDistinctSubsequence()==3);
    }

    private void whenSubsequencesAreValid() {
        subsequences = new Subsequences();
        subsequences.setFirstString("rabbbit");
        subsequences.setSecondString("rabbit");
        distinctSubsequenceService = new DistinctSubsequenceService(subsequences);
    }

    private void whenSubsequencesAreNotValid() {
        subsequences = new Subsequences();
        subsequences.setFirstString("rabit");
        subsequences.setSecondString("rabbit");
        distinctSubsequenceService = new DistinctSubsequenceService(subsequences);
    }

}