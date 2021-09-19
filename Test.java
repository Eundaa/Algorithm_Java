import java.util.*;

public class Test{

    public static void main(String[] args){
        int[] prices = {5, 3, 7, 9, 5, 2, 4, 9, 10, 6};
        // List<Integer> answer = new ArrayList<>();
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            int now = prices[i];
            int number = 0;
            int[] temp = Arrays.copyOfRange(prices, i, prices.length);
            Arrays.sort(temp);
            // for(int j = 0; j < temp.length; j++){
            //     if(temp[j] >= now){
            //         number = temp.length - j;
            //         break;

            //     }
            // }
            // while(temp)
            int index = Arrays.binarySearch(temp,now);
            // int index = Arrays.asList(temp).indexOf(now);
            number = temp.length - index+1;
            // for (int j = i; j < prices.length - 1; j++){
            //     if(prices[j + 1] > now){
            //         number += 1;
            //     }
            // }
            // answer.add(number);
            answer[i] = number;
        }
        for(int value : answer){
            System.out.print(value + " ");
        }
    }

}