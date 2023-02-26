package javapoint;

 class Calculate
{
    public int multiply(int a, int b) {
        return a*b;
    };
    int minus(int a, int b){
       return a - b;
    }
}

class Main111
{
    public static void main(String[] args)
    {
        int result = new Calculate()
        {
            @Override
            public int multiply(int a, int b)
            {
                return a*b;
            }
            @Override
            int minus (int a, int b){
                return  b - a;
            }
        }.minus(12,32);



        System.out.println("result = "+result);
    }
}
// 384

//start at qn 125