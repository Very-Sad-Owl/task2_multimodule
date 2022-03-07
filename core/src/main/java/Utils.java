import ru.clevertec.tasks.olga.utils.Library;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str){
        Library library = new Library();
        for (String num : str){
            if (!library.isPositiveNumber(num)){
                return false;
            }
        }
        return true;
    }
}
