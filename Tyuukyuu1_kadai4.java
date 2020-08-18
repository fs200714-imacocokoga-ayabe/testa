package rennsyuuyou;

public class Tyuukyuu1_kadai4 {

	public static void main(String[] args) throws Exception {

		PriorityQueue priorityqueue = new PriorityQueue();

		priorityqueue.push("１番目",10);
		priorityqueue.push("２番目",10);
		priorityqueue.push("３番目",100);
		priorityqueue.push("４番目",50);

		//System.out.println("キュー表示");
		System.out.println(priorityqueue.pop());
		System.out.println(priorityqueue.pop());
		System.out.println(priorityqueue.pop());
		System.out.println(priorityqueue.pop());
		System.out.println("");
	}
}

