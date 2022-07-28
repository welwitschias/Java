package collection;

// E → Element(아무거나 가능), K → Key, N → Number, T → Type, V → Value
public class Wrapper<E> {

	private E object;

	public void set(E object) {
		this.object = object;
	}

	public E get() {
		return object;
	}

}
