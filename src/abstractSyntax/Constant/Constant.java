package abstractSyntax.Constant;

import visitor.PrettyprintVisitor;

public abstract class Constant {
    public abstract void prettyPrint(PrettyprintVisitor prettyprintVisitor);
}