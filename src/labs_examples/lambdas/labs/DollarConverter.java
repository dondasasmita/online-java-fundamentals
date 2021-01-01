package labs_examples.lambdas.labs;

@FunctionalInterface
public interface DollarConverter {
    public double convert(double amount, String currency);
}
