package Arrays;

import java.util.stream.Stream;

/**
 * https://www.geeksforgeeks.org/stock-buy-sell/
 */
public class StockBuySellMultipleTimes {

    public static void main(String[] args) {
        int a[] = {886,2777,6915,7793,8335,5386,492,6649,1421,2362,27,8690,59,7763,3926,540,3426,9172,5736,5211,5368,2567,6429,5782,1530,2862,5123,4067,3135,3929,9802,4022,3058,3069,8167,1393,8456,5011,8042,6229,7373,4421,4919,3784,8537,5198,4324,8315,4370,6413,3526,6091,8980,9956,1873,6862,9170,6996,7281,2305,925,7084,6327,336,6505,846,1729,1313,5857,6124,3895,9582,545,8814,3367,5434,364,4043,3750,1087,6808,7276,7178,5788};//{100, 180, 260, 310, 40, 535, 695}; //{23,13,25,29,33,19,34,45,40,67};
        getMaxProfitBS(a);
    }

    private static void getMaxProfitBS(int[] a) {

        int buy =0;
        int sell=0;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<a.length;i++){

            if(a[i] > a[i-1]){
                sell = i;
            }else{
                if(buy != sell) sb.append("(").append(buy).append(" ").append(sell).append(") ");
                buy=i;
                sell=i;
            }
        }
        if(buy != sell) {
            sb.append("(").append(buy).append(" ").append(sell).append(")");



        }
        if(sb.toString().length() ==0 && buy==sell){
            System.out.print("No Profit");
            return;
        }
        System.out.print(sb.toString().trim());
    }
}



