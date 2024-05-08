package House_rental_system.bean;

public class House {
    //房屋id
    private Integer houseId;
    //房屋计数
    public static int count;
    //租客姓名
    private String lesseeName;
    //租客电话
    private String lesseeNumber;
    //房屋地址
    private String address;
    //月租金
    private Integer monthlyRent;
    //状态
    private String status;

    @Override
    public String toString() {
        return
                "房屋编号:" + houseId +
                ", 租客::'" + lesseeName + '\'' +
                ", 租客电话:'" + lesseeNumber + '\'' +
                ", 地址:'" + address + '\'' +
                ", 月租费用:" + monthlyRent +
                ", 是否空闲:'" + status + '\'';
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getLesseeName() {
        return lesseeName;
    }

    public void setLesseeName(String lesseeName) {
        this.lesseeName = lesseeName;
    }

    public String getLesseeNumber() {
        return lesseeNumber;
    }

    public void setLesseeNumber(String lesseeNumber) {
        this.lesseeNumber = lesseeNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(Integer monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public House(String lesseeName, String lesseeNumber, String address, Integer monthlyRent, String status) {
        this.houseId = ++count;
        this.lesseeName = lesseeName;
        this.lesseeNumber = lesseeNumber;
        this.address = address;
        this.monthlyRent = monthlyRent;
        this.status = status;
    }
}
