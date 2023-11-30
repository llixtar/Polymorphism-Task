package App;

public class DeviceTypeA extends Device {
    double numA;
    double numB;
    double result;

    public DeviceTypeA(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
    }
    //------------------------------------------------------------------------------------------------------------------
    @Override
    double сalculation() {
        result = numA * numB;
        return result;
    }
    //------------------------------------------------------------------------------------------------------------------
    public String getDeviceMsg() {
        String roundNum1 = Utils.roundValue(numA);
        String roundNum2 = Utils.roundValue(numB);
        String roundRes = Utils.roundValue(result);

        return String.format("Result from the DeviceTypeA: %s * %s = %s", roundNum1, roundNum2, roundRes);
    }
    //------------------------------------------------------------------------------------------------------------------
}
