public class Population {
    private int n_investment;
    private int n_prizes;

    public Population(int n_investment, int n_prizes) {
        this.n_investment = n_investment;
        this.n_prizes = n_prizes;
    }

    public int getN_investment() {
        return n_investment;
    }

    public int getN_prizes() {
        return n_prizes;
    }

    public String toString() {
        return n_investment + " - " + n_prizes;
    }
}
