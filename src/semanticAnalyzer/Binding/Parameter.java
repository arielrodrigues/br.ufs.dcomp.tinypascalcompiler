package semanticAnalyzer.Binding;

import abstractSyntax.FormalParameter.RefOrValue;

public abstract class Parameter  {
    RefOrValue mechanism;

    public Parameter(RefOrValue mechanism) {
        super();
        this.mechanism = mechanism;
    }
}
