public class Operators {
    private static int countOfObjects;
    private String operationType;

    //arithmetic operators +, -, *, /, %
    int a, b = 1, c = 2;
    a = b + c;
    System.out.println();

    //equality operators +, -, ++, --, !
    int i = 1;
    i++;

    i = i +1;
    if (i == 3){};   //the same
    boolean flag = !(i == 3)   // the same

    boolean u = false;
    System.out.println(u);
    System.out.println(!u);  // negation of variable a

//conditional operators


//comparison operator 'instant of'

}






    public Operators(String operationType){
        this.operationType=operationType;
        countOfObjects++;
    }

    public static int getCountOfObjects(){
        return countOfObjects;
    }

    public String getOperationType(){
        return operationType;
    }

}
