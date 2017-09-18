package zadanie;

import java.util.List;

public interface MultiTaskResultCollector {

    /**
     * Calculates many with many operators
     * @param numersAndOperators List of tasks
     * @return calculated result
     */
    double getResult(List numersAndOperators);
}
