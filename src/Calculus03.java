public class Calculus03 {
    public static void main(String[] args){
        Method calculus = new Method();
        boolean result = calculus.isEven(5);
        System.out.println(result);
        System.out.println(calculus.isEven(20));

        boolean odd = calculus.isOdd(2);
        System.out.println(odd);
        System.out.println(calculus.isOdd(15));

        double circle = calculus.circleField(1);
        System.out.println(circle);
        System.out.println(calculus.circleField(2));

        int power = calculus.power(10);
        System.out.println(power);
        System.out.println(calculus.power(25));
    }
}
