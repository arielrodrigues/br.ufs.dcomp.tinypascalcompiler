package abstractSyntax.Exp;

import visitor.PasVisitor;

public abstract class Expression {
    public abstract void accept(PasVisitor visitor);
}