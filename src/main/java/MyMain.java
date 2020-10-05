public class MyMain {

    public static double probabilityOneSix() {
        double six_posibility = 0;
        double dice = 0;
        int total = 0;
        for (int u = 0;u < 9999; u++){
            for (int i = 0;i < 6;i ++){
                dice =  (int)(Math.random() * 6 + 1);
                if (dice == 6){
                    total += 1;
                    break;
                }
                else {
                    total += 0;
            }
        }
        }

        six_posibility = (double)total / 100;
        return six_posibility;
    }

    public static double probabilityTwoSixes() {
        double six_posibility = 0;
        double dice = 0;
        int total = 0;
        int times = 0;
        for (int u = 0;u < 9999; u++){
            for (int i = 0;i < 12;i ++){
                dice =  (int)(Math.random() * 6 + 1);
                if (dice == 6){
                    times += 1;
                    if (times == 2) {
                        total += 1;
                        break;
                    }
                }
                else {
                    total += 0;
                }
            }
            times = 0;
        }
        six_posibility = (double)total / 100;
        return six_posibility;
    }

    public static double probabilityThreeSixes(){
        double six_posibility = 0;
        double dice = 0;
        int total = 0;
        int times = 0;
        for (int u = 0;u < 9999; u++){
            for (int i = 0;i < 18;i ++){
                dice =  (int)(Math.random() * 6 + 1);
                if (dice == 6){
                    times += 1;
                    if(times == 3){
                        total += 1;
                        break;
                    }
                }
                else {
                    total += 0;
                }
            }
            times = 0;
        }

        six_posibility = (double)total / 100;
        return six_posibility;
    }
    public static void main(String arg[]){
    probabilityOneSix();
    probabilityTwoSixes();
    probabilityThreeSixes();
    }
}
