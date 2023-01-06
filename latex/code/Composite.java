
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




public class CompoundPart extends Component {
	private Vector<Component> children;

	public CompoundPart(String name) {
		super(name);
		children = new Vector<Component>();
	}

	@Override
	public void describe() {
		System.out.println("Component: " + name);
		System.out.println("Composed by:");
		System.out.println("{");
		int vLength = children.size();
		for (int i = 0; i < vLength; i++) {
			Component c = (Component) children.get(i);
			c.describe();
		}
		System.out.println("}");
	}

	public void add(Component c) throws SinglePartException {
		children.addElement(c);
	}

	public void remove(Component c) throws SinglePartException {
		children.removeElement(c);
	}

	public Component getChild(int n) {
		return (Component) children.elementAt(n);
	}
}


public class SinglePart extends Component{

	public SinglePart(String name) {
		super(name);
		
	}

	@Override
	public void describe() {
		 System.out.println( "Component: " + name ); 
		
	}

}



public class SinglePartException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SinglePartException() {
		super("Not supported method");
	}
}
