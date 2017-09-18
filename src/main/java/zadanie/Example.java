package zadanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Example {
    Map<Integer, List<XX>> map;


    public void addEquasions(int taskId, List<XX> ops){
        map.put(taskId,ops);


    }

    public Calculation getCalculation(int taskId){
        List<XX> equasions = map.get(taskId);

        Object a1 = equasions.get(0);
        Object a2 = equasions.get(1);

        a1.getEquasion();
        a1.getNextEquasionOperator();


        Calculation calculation = null;
        calculation.calc();

    }

    interface  Calculation{

        double calc();
    }

   static class DecoratorCalculation implements Calculation{

        XX xx;
        private Calculation c1;
        private Calculation c2;
        Operator operator;

       @Override
       public double calc() {
           final double a1 = c1.calc();
           double a2 = c2.calc();

           // return a1 operation a2

           return new SingleCalculation(Arrays.asList(a1,a2), operator).calc();
       }
   }
    static class SingleCalculation implements Calculation{

        Equasion equasion;

        public SingleCalculation(List<Double> doubles, Operator operator) {
            equasion.data = doubles;
            equasion.operator = operator;
        }

        @Override
        public double calc() {
            Operator operator = equasion.getOperator();
            List<Double> data = equasion.getData();

            Task singleCalculation = new Task(1, "single calculation");
            singleCalculation.numbers = (ArrayList<Double>)data;
            singleCalculation.operator = operator;
            singleCalculation.calculate();



            return singleCalculation.result;
        }
    }

    static class  Equasion{
        public Operator operator;
        public List data;

        public Operator getOperator() {
            return operator;
        }

        public List getData() {
            return data;
        }
    }
}


