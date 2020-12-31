package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */


class Exercise01Controller {

    public static void main(String[] args) {

        String[] investmentTypes = {"A", "B"};

        for(String typeOfInvestment : investmentTypes) {

            InvestmentRunnable investment = new InvestmentRunnable(typeOfInvestment);
            investment.setInvestmentAmount(100000);
            investment.start();
        }

        System.out.println("--- Another Process Running ---"); // This will not wait for the above to complete

    }
}

class InvestmentRunnable implements Runnable {

    Thread thread;

    private int investmentAmount;
    private int interestRate;
    private int tenure;

    private int investmentReturn;

    /**
     * Constructor
     */
    public InvestmentRunnable(String threadName) {
        this.thread = new Thread(this, threadName);

        switch (threadName) {
            case "A":
                this.interestRate = 8;
                this.tenure = 10;
                break;
            case "B":
                this.interestRate = 20;
                this.tenure = 10;
                break;
        }

        this.investmentReturn = 0;
    }

    public void start() {
        this.thread.start();
    }

    private int getInvestmentAmount() {
        return this.investmentReturn + this.investmentAmount;
    }

    public void setInvestmentAmount(int investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    private void calculate() {
        System.out.println("Calculating Investment " + this.thread.getName());
        this.investmentReturn += (this.investmentAmount * this.interestRate) / 100;
    }

    public int getInvestmentReturn() {
        return investmentReturn;
    }

    @Override
    public void run() {
        System.out.println("Running Investment : " + this.thread.getName());

        try {

            for (int year = 1 ; year <= this.tenure ; year++) {

                if (this.thread.getName() == "A") {
                    Thread.sleep(year * 500);
                } else {
                    Thread.sleep(year * 100);
                }

                this.calculate();
                System.out.println("Interest received for investment " + this.thread.getName() + " in year " + year + " - " + this.getInvestmentReturn() );
                if (year == this.tenure) {
                    System.out.println("Your final fund for " + this.thread.getName() + " is : " + this.getInvestmentAmount());
                }
            }

        } catch (InterruptedException e) {
            System.out.println(this.thread.getName() + " is interrupted");
            System.out.println(e.getMessage());
        }


    }
}