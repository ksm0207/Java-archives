package Blog_part04;

public class TelevisionRun {
    public static void main(String [] args){

        Television tv = new Television();

        tv.channel = 7;
        tv.volume = 30;
        tv.onOff = true;
        String tvOnOff = "";

        if (tv.onOff){
            tvOnOff = "On";
        }else{
            tvOnOff = "Off";
        }

        System.out.println(" 채널상태 : " + tvOnOff +
                           "\n 채널 번호 : " + tv.channel +
                           "\n 볼륨 :" + tv.volume);
    }
}
