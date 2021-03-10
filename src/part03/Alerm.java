package part03;

import java.util.Scanner;

public class Alerm {
    public static void main( String [] args) {

        int h = 0;
        int m = 0;
        int alerm = 45;

        Scanner scan = new Scanner(System.in);
        h = scan.nextInt();
        m = scan.nextInt();

        if (m < alerm) {
            h --;
            m = 60 - (alerm - m);

            if (h < 0) {
                h = 23;
                System.out.println(""+ h + " " +  m);
            }else{
                System.out.println(""+ h + " " +  m);
            }
        }else{
            if ( m >= alerm) {
                m = m - alerm;
                System.out.println(" 45분 저장 결과 : "+ h + " " +  m);
            }
        }
    }
}