public class ArrayQueue {
	int[] values;
	int maxCapacity;
	int currentSize;

	public ArrayQueue(int maxCapacity) {
		this.maxCapacity = maxCapacity;
		this.values = new int[this.maxCapacity];
		this.currentSize = 0;
	}

	public void enqueue(int value) {
		if(this.currentSize < this.maxCapacity) {
			this.values[this.currentSize] = value;
			this.currentSize++;
		}
	}

	public void dequeue() {
		if(this.currentSize > 0) {
			for(int i = 1; i < this.currentSize; i++) {
				values[i - 1] = values[i];
			}
			this.currentSize--;
		}
	}

	public void print() {
		for(int i = 0; i < this.currentSize - 1; i++) {
			System.out.print(Integer.toString(values[i]) + ", ");
		}

		System.out.println(Integer.toString(values[this.currentSize - 1]));
	}
}