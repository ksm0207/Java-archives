package Blog_part04;


public class TelevisionRun02 {
    int channel;
    int volume;
    String model = "";
    boolean onOff;

    public static void main(String [] args){

        TelevisionRun02 tv = new TelevisionRun02();
        TelevisionRun02 tvE = tv;
        TelevisionRun02 tvN = new TelevisionRun02();
        tvE = tvN;

        tv.channel = 100;

        System.out.println("참조변수 tv : "  +tv.channel);
        System.out.println("참조변수 tvE : " +tvE.channel);
        System.out.println("참조변수 tvN : " +tvN.channel);
    }
}