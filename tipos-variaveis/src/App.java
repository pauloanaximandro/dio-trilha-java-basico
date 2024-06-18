public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SmartTV tvControl1 = new SmartTV();

        System.out.println(tvControl1.isOn);
        System.out.println(tvControl1.channel);
        System.out.println(tvControl1.volume);

        tvControl1.turnTVOn();

        System.out.println(tvControl1.isOn);

    }
}
