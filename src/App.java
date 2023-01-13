import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(findDuplicates());
    }

    public static List findDuplicates(){
        List<String> duplicatesArray = new ArrayList<>();
        String[] firstArray = {"Maca", "Pera", "Uva", "Melancia"};
        String[] secondArray = {"Maca", "Pera", "Laranja", "Tomate", "Manga", "Uva"};
        for(int i = 0; i < firstArray.length; i++){
            String element = firstArray[i];
            for(int j = 0; j < secondArray.length; j++){
                String comparedElement = secondArray[j];
                Boolean isEqual = element == comparedElement;
                Boolean isInArray = duplicatesArray.contains(comparedElement);
                if(isEqual && !isInArray){
                    duplicatesArray.add(comparedElement);
                }
            }
        }

        return duplicatesArray;
    }
}
