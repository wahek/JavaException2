import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        App4 app4 = new App4();
        try {
            System.out.println(app4.inpuString());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("Пустая строка");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("end");
        }
    }
    public String inpuString(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        if (str.equals("")){ 
            throw new NullPointerException();
        }
        return str;
    }
}