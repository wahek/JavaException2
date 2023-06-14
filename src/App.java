import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        App app = new App();
        boolean valid = false;
        while (!valid){
            try{
            app.check();
            valid = true;
            }catch (InputMismatchException e){
                System.out.println(" Введена строка, либо дробная часть введена через точку\n Попробуйте снова");
            }
            finally{
                System.out.println("end");
            }
        }
}

    public void check()throws InputMismatchException{
        float number = inputFloat();
        System.out.println(number);
    }

    public float inputFloat()throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число");
        float number = scanner.nextFloat();
        scanner.close();
        return number;
    }
}
