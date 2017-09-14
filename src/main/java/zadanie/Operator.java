package zadanie;

public enum Operator {
    ADD("+"),
    MULTIPLY("-"),
    DIVIDE("/"),
    SUBTRACT("*");

    private final String op;

    Operator(String op){
        this.op = op;
    }
}
