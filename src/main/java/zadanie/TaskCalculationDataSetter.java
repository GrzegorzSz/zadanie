package zadanie;

import java.util.List;

public interface TaskCalculationDataSetter {

    /**
     * gets numers and operator for arithmetic operation
     * @param operator single char refers one of four basic arithmetic
     *                 operation (+, -, *, /)
     */
    void setOperator(Operator operator, int taskId);

    /**
     *
     * @param numbers
     */
    void setNumbers(List<Double> numbers, int taskId);
}
