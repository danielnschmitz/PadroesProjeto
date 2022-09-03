package generators.erastothenes;

import java.util.Arrays;
import java.util.List;

public class ErastothenesSievePrimeGenerator {

    private boolean[] isPrime;
    private List<Integer> result = null;
    private int limit;

    private void init(int max){
        Arrays.fill(this.isPrime,true);
        this.limit = max;
    }

    private void verifyPrime(){
        for (int i = 2; i <= Math.sqrt(this.limit); i++) {
            if (this.isPrime[i]) {
                for (int j = 2; i * j <= this.limit; j++) {
                    this.isPrime[i * j] = false;
                }
            }
        }
    }

    private void makeResult(){
        for (int i = 2; i <= this.limit; i++) {
            if (this.isPrime[i]) {
                this.result.add(i);
            }
        }
    }

    public List generateSequence(final int max) {
        init(max);
        verifyPrime();
        makeResult();

        return result;
    }
}
