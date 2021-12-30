class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}
class Altimeter {
     @Override
     public String toString() {
         return  "Measure height";
    }
    public void a() {
         System.out.println("Measure height");
    }
}
class AirGauge {
     @Override
     public String toString() {
         return "Measure air pressure";
   }
    public void b() {
        System.out.println("Measure air pressure");
    }
}
class ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();
    public void control() {
        altimeter.a();
        airGauge.b();
    }
}
