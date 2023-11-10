
public class CompoundInterest {

	public static void main(String[] args) {
        double p = 1200;
        double r = 5.4;
        double t = 2;

        double compoundInterest = p * Math.pow(1 + r / 100, t);
        System.out.println("Compound Interest = " + compoundInterest);
    }

	}

