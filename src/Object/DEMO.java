package Object;

class Computer {
    public void PlayMusic() {
        System.out.println("Playingh Music.......");
    }

    public String GetInfo(int num) {
        if (num >= 10) {
            return "Data Transferd";
        } else {
            return "NOthing";
        }
    }
}

public class DEMO {
    public static void main(String[] args) {
        Computer cm = new Computer();
        String result1 = cm.GetInfo(2);
        cm.PlayMusic();
        System.out.println(result1);
    }
}
