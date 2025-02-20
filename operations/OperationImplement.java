

public class OperationImplement implements Division {
    @override
    public float division(int a, int b){
        if(b != 0)
            return a / b;
        else
            return 0;
    }
}