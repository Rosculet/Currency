import java.util.spi.CurrencyNameProvider;

public enum MyCurrency {
    EUR(1),
    AUD(0.67),
    CAD(0.75),
    CHN(0.14),
    RUB(0.013),
    USD(0.95);

    double title;

    MyCurrency(double title) {
        this.title = title;
    }

    public double getTitle() {
        return title;
    }
}
