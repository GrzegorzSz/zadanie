package zadanie;

import java.util.List;

public class DefaultMultiTaskResultCollector extends Decorator implements MultiTaskResultCollector{

    double result;
    public double getResult(int taskID){
        result = super.getResult(taskID);
        return result;
    }

    @Override
    public double getResult(List NumersAndOperators) {
        return 0;
    }
}
