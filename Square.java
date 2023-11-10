
public class Square {

	public static void main(String[] args) {
		int n = 10; 

        double squareOfSum = Math.pow((n * (n + 1) / 2.0), 2);

        double sumOfSquares = (n * (n + 1) * (2 * n + 1)) / 6.0;

        double difference = squareOfSum - sumOfSquares;

        System.out.println("The difference is: " + difference);
    }

	}
