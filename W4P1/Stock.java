public class Stock {

    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String symbol,String name) {
        this.symbol = symbol;
        this.name = name;
        // this.previousClosingPrice = previousClosingPrice;
        // this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return ((this.currentPrice-this.previousClosingPrice)/this.previousClosingPrice) * 100;
    }
}