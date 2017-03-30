package abstractSyntax.Stm;

import abstractSyntax.Exp.Expression;
import visitor.PascalVisitor;

public class WhileStatement extends Statement {
	public Expression condition;
	public Statement body;
	
	public WhileStatement(Expression condition, Statement body) {
		super();
		this.condition = condition;
		this.body = body;
	}

	@Override
	public void accept(PascalVisitor visitor) {
		visitor.VisitWhileStm(this);
	}
}