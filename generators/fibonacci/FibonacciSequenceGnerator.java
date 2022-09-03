package generators.fibonacci;

import java.util.List;

public class FibonacciSequenceGnerator {
    static List<Integer> generateSequence(final int max){
        List<Integer> result = null;

        result.add(0);
        result.add(1);

        for(int i = 2; i <= max; i++){
            result.add(result.get(i-1)+result.get(i-2));
        }

        return result;
    }
}
