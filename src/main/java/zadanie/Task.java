package zadanie;

import java.util.ArrayList;

public class Task {
    public int id;
    public String descrpition;
    public double result;
    public boolean isCalculated;
    public Operator operator;
    public ArrayList<Double> numbers;
    Task(int id, String descrpition){
        this.id = id;
        this.descrpition = descrpition;
        //this.result = 0;
        this.isCalculated = false;
        this.operator = null;
        this.numbers = null;
    }
    void calculate(){
        switch (operator) {
            case ADD:
                for (Double number: numbers
                     ) {
                    result += number;
                }
                break;
            case MULTIPLY:
                result = 1d;
                for (Double number : numbers
                     ) {
                    result *= number;
                }
                break;
            case DIVIDE:
                result = numbers.get(0);
                for (int index = 1; index < numbers.size(); index++) {
                    result /= numbers.get(index);
                }

                break;
            case SUBTRACT:
                for (int index = 1; index < numbers.size(); index++) {
                    if(numbers.get(index) == 0){
                        System.out.println("Can't divide by 0");
                        return;
                    }
                }
                result = numbers.get(0);
                for (int index = 1; index < numbers.size(); index++) {
                    result -= numbers.get(index);
                }
                break;
        }
        isCalculated = true;
    }
}
