
public class LCMandGCD {

	public static void main(String[] args) {
int num1 = 15;
int num2 = 25;
int gcd = findGCD(num1, num2);
int lcm = (num1 * num2) / gcd;
System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

}

// Method to find the Greatest Common Divisor (GCD) using Euclid's Algorithm
static int findGCD(int a, int b) {
if (b == 0) {
    return a;
} else {
return findGCD(b, a % b);
}
}


	}
