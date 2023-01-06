package designpattern.composite;

public abstract class Component {
	protected String name;

	public Component(String name) {
		this.name = name;
	}

	public abstract void describe();

	public void add(Component c) throws SinglePartException {
		if (this instanceof SinglePart)
			throw new SinglePartException();
	}

	public void remove(Component c) throws SinglePartException {
		if (this instanceof SinglePart)
			throw new SinglePartException();
	}

	public Component getChild(int n) {
		return null;
	}
}