package semanticAnalyzer.Binding;

import java.util.List;

public class Procedure implements Binding {
	List<Parameter> parameters;

	public Procedure(List<Parameter> parameters) {
		super();
		this.parameters = parameters;
	}
}
