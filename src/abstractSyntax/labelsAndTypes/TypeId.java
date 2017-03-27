package abstractSyntax.labelsAndTypes;

import visitor.PasVisitor;

public class TypeId extends TypeIdOrOrdinal {
	String id;

	public TypeId(String id) {
		super();
		this.id = id;
	}

	@Override
	public void accept(PasVisitor visitor) {
		// nothing to do here
	}
}