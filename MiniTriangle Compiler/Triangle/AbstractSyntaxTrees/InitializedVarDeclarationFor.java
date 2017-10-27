package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Katerine Molina
 *
 */
public class InitializedVarDeclarationFor extends Declaration {

	public InitializedVarDeclarationFor(Identifier iAST, Expression eAST, SourcePosition thePosition) {
		super(thePosition);
	
		I = iAST;
		E = eAST;
	}

	public Object visit(Visitor v, Object o) {
		return v.visitInitializedVarDeclarationFor(this,o);
	}
	public Identifier I;
	public Expression E;
}