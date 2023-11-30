package App;

class DeviceTypeB extends Device {

    private static final double COEFFICIENT = 17.9;

    double numA;
    double numB;

    double result;

    public DeviceTypeB(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
    }
    //------------------------------------------------------------------------------------------------------------------
    @Override
    double сalculation() {
        result = (numA + numB) * COEFFICIENT;
        return result;
    }
    //------------------------------------------------------------------------------------------------------------------
    public String getDeviceMsg() {
        String roundNum1 = Utils.roundValue(numA);
        String roundNum2 = Utils.roundValue(numB);
        String roundCoeff = Utils.roundValue(COEFFICIENT);
        String roundRes = Utils.roundValue(result);

        return String.format("Result from the DeviceTypeB: (%s + %s) * %s = %s", roundNum1, roundNum2, roundCoeff, roundRes);
    }
    //------------------------------------------------------------------------------------------------------------------
}
