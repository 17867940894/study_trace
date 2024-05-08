package Work;
//电车
public class trolleyBus extends Car{
    public String getLicencePlateColor() {
        return licencePlateColor;
    }

    public void setLicencePlateColor(String licencePlateColor) {
        this.licencePlateColor = licencePlateColor;
    }

    private String licencePlateColor;//汽车牌照颜色

    public trolleyBus() {
    }

    public trolleyBus(String licencePlateColor) {
        this.licencePlateColor = licencePlateColor;
    }

    public trolleyBus(String name,String color, int wheel, String licencePlateColor) {
        super(name, color, wheel);
        this.licencePlateColor = licencePlateColor;
    }
}
