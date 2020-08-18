package rennsyuuyou;

public class test1 {

	public static void main(String[] args) {

		System.out.println(f(2));
	}

	public static int f(int n) {

		System.out.println(n);

		int r;

		if (n == 0)

			r = 1;

		else

			r = f(n - 1) + 1;

		return r;

	}
}
