package rennsyuuyou;

class test2 {

	public static void main(String[] args) {

		test2 sample = new test2();

		sample.up(0);

	}

	public int up(int i) {

		if (i < 3) {

			System.out.println(i);

			up(i + 1);

		}

		return i;

	}
}
