class KeyValue {
	public String key;
	public int value;

	public KeyValue(String key, int value) {
		this.key = key;
		this.value = value;
	}
}

public class Map {
	KeyValue[] arr;
	int length;
	int size;

	public Map(int size) {
		this.length = 0;
		this.size = size;
		this.arr = new KeyValue[this.size];
	}

	public void add(String key, int value) {
		if(!this.containsKey(key)) {
			if (this.length < this.size) {
				arr[this.length] = new KeyValue(key, value);
				this.length++;
			}
		}
	}

	public boolean containsKey(String key) {
		for(int i = 0; i < this.length; i++) {
			if(key == arr[i].key) return true;
		}
		return false;
	}

	public void print() {
		for(int i = 0; i < this.length; i++) {
			System.out.println(arr[i].key + ": " + Integer.toString(arr[i].value));
		}
	}
}