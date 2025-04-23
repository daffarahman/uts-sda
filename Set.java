public class Set {
	public int[] arr;
	public int length;
	public int size;

	public Set(int size) {
		this.arr = new int[size];
		this.size = size;
		this.length = 0;
	}

	public boolean isEmpty() {
		return this.length <= 0;
	} 

	public int length() {
		return this.length;
	}

	public void add(int value) {
		if(!this.isIn(value) && this.length < this.size) {
			this.arr[this.length] = value;
			this.length++;
		}
	}

	public boolean isIn(int value) {
		for(int i = 0; i < length; i++) {
			if (value == this.arr[i]) return true;
		}

		return false;
	}

	public void print() {
		System.out.print("{");
		for(int i = 0; i < length - 1; i++) {
			System.out.print(Integer.toString(this.arr[i]) + ", ");
		}

		if(this.length > 0) {
			System.out.print(this.arr[length - 1]);
		}

		System.out.println("}");
	}

	public boolean isEqual(Set anotherSet) {
		if(anotherSet.length != this.length) return false;

		boolean equal = true;
		for(int i = 0; i < this.length && equal; i++) {
			equal &= anotherSet.isIn(this.arr[i]);
		}
		return equal;
	}

	public Set union(Set anotherSet) {
		int newSize = (this.size > anotherSet.size)? this.size : anotherSet.size;
		Set newSet = new Set(anotherSet.size);
		for(int i = 0; i < this.length; i++) {
			newSet.add(this.arr[i]);
		}
		for(int i = 0; i < anotherSet.length; i++) {
			newSet.add(anotherSet.arr[i]);
		}
		return newSet;
	}

	public Set intersection(Set anotherSet) {
		Set newSet = new Set(this.size);
		for(int i = 0; i <= this.length; i++) {
			if(anotherSet.isIn(this.arr[i])) {
				newSet.add(this.arr[i]);
			}
		}
		return newSet;
	}
}