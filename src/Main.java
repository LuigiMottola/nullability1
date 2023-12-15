public class Main {
    public static void main(String[] args) {
        Integer x = 10;
        Integer y = 5;

        divisionMethodErrorCatch(x, y);

    }
    public static void divisionMethodErrorCatch(Integer num, Integer den){
        if (num != null && den!= null){
            try {
                Integer result = num / den;
                System.out.println(result);
            } catch (NullPointerException e){
                System.out.println("ERROR: null value detected");
            }
        }
    }
}
