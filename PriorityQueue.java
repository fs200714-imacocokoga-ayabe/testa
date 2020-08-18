package rennsyuuyou;

import java.util.ArrayList;

public class PriorityQueue {

	ArrayList<Value_Priority> list = new ArrayList<Value_Priority>();

	public PriorityQueue() {};//コンストラクタ

	public void push(String str,int priority) {

		Value_Priority val_pri = new Value_Priority(priority, str);

		list.add(val_pri);
	}

	public String pop() {

		int max = 0;
		int index = 0;
		int counter = 0;

		for(Value_Priority valuePriority : list){
			if(max < valuePriority.Getpriority()){

			max = valuePriority.Getpriority();
			index = counter;
		}
		counter++;
}
	Value_Priority popView = list.get(index);

	list.remove(index);

	return popView.Getvalue();
	}
}


