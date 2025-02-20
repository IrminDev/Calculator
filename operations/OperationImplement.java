package operations;

public class OperationImplement implements Division {
    @Override
    public float division(int a, int b){
        if(b != 0)
            return a / b;
        else
            return 0;
    }
}