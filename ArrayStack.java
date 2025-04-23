public class ArrayStack {
	int[] values;
	int topIndex;

	public ArrayStack(int size) {
		this.values = new int[size];
		this.topIndex = -1;
	}

	public boolean isEmpty() {
		return this.topIndex == -1;
	}

	public void push(int value) {
		this.topIndex++;
		values[this.topIndex] = value;
	}

	public void pop() {
		if(this.topIndex > -1) {
			this.topIndex--;
		}
	}

	public void print() {
		if(!this.isEmpty())
		for(int i = this.topIndex; i > 0; i--)
			System.out.print(Integer.toString(this.values[i]) + ", ");
		System.out.print(Integer.toString(this.values[0]) + "\n");
	}

	public int peek() {
		if(!this.isEmpty())
			return this.values[this.topIndex];
		return -9999;
	}
}