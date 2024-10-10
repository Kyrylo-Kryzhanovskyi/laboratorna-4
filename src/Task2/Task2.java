package Task2;
import java.util.Arrays;

public class Task2 {
    public void printParameters(Object parameter1, Object parameter2, Object parameter3, Object parameter4, Object parameter5){
        System.out.println("Parameters:");
        Object [] parameters = {parameter1, parameter2, parameter3, parameter4, parameter5};
        for (Object parameter : parameters){
            System.out.println("Тип: " + parameter.getClass().getSimpleName() + ", значення: " + parameter + ", поля:" + Arrays.toString(parameter.getClass().getDeclaredFields()));

        }
    }
    public void printParameters(Object[] parameters){
        System.out.println("Parameters:");
        for (Object parameter : parameters){
            System.out.println("Тип: " + parameter.getClass().getSimpleName() + ", значення: " + parameter + ", поля:" + Arrays.toString(parameter.getClass().getDeclaredFields()));
        }
    }
    public void printParameters1(Object... parameters){
        System.out.println("Parameters:");
        for (Object parameter : parameters){
            System.out.println("Тип: " + parameter.getClass().getSimpleName() + ", значення: " + parameter + ", поля:" + Arrays.toString(parameter.getClass().getDeclaredFields()));
        }
    }

}
