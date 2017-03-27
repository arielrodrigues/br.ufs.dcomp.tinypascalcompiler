package abstractSyntax.Exp;

import visitor.PasVisitor;

public class StringLiteral extends Expression {
	public String value;

	public StringLiteral(String value) {
		super();
		this.value = value;
	}

	@Override
	public void accept(PasVisitor visitor) {
		// nothing to do here
	}
}