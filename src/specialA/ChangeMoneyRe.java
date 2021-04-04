package specialA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChangeMoneyRe {
    public static void main(String[] args) throws Exception {

        // BufferedReader
        // 메모리   : 14604 KB
        // 시간     : 140ms
        // 코드길이 : 794B 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int resCoin = 0;
        int changeMoney;
        changeMoney = Integer.parseInt(br.readLine());

        while (changeMoney > 0) {

            if (changeMoney % 5 == 0) {
                changeMoney = changeMoney / 5;
                resCoin = resCoin + changeMoney;
                break;
            }else {
                changeMoney -=2;
                resCoin ++;
            }
        } // end of while

        if (changeMoney < 0) {
            System.out.println(-1);
        }else{
            System.out.println("반환 코인 개수 : " + resCoin);
        }
    }
}

//