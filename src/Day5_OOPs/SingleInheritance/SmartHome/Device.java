package Day5_OOPs.SingleInheritance.SmartHome;


public class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}