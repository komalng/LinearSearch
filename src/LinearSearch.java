import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int userInput = Integer.parseInt(args[0]);
        List <Integer> listOfElements = new ArrayList<>(List.of(12,13,15,18,19,10,11));
        int count = 0;
        for(int i = 0;i < listOfElements.size();i++){
            if(listOfElements.get(i) == userInput){
                System.out.println("Index number is "+i);
                count = count + 1;
                break;
            }
        }
        if(count == 0){
            System.out.println(userInput+" is not present in the list");
        }
    }

}
