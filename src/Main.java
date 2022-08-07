import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(pink(20,-13));
        System.out.println(pink(11,40));
        System.out.println(pink(23,34));
        System.out.println(pink(56,31));
        System.out.println(pink(22,35));

        System.out.println(pink(generateRandomAge(), 21));
        System.out.println(pink(generateRandomAge(), -13));
        System.out.println(pink(generateRandomAge(),32));

    }
    public static int generateRandomAge(){
        Random random=new Random();
        int randomAge=random.nextInt(100)+1;
        return randomAge;
    }

    public static String pink(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature >= -10 && temperature < 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");


        }
        return "age" + age + "temperature" + temperature;

    }
}
