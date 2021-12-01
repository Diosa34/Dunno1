package object;

public enum Money {
    HALF_SANTIC(0.5),
    ONE_SANTIC(1.0),
    TWO_SANTIC(2.0),
    THREE_SANTIC(3.0);

    private final double nominal;

    Money(double nominal) {
        this.nominal = nominal;
    }

    public double getNominal() {
        return this.nominal;
    }
}
