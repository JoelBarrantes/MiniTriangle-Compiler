package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Katerine Molina
 *
 */
public class InitializedVarDeclarationFor extends Declaration {

	public InitializedVarDeclarationFor(Identifier iAST, Expression eAST, Vname vAST, SourcePosition thePosition) {
		super(thePosition);
	
		I = iAST;
		E = eAST;
		V = vAST;
	}

	public Object visit(Visitor v, Object o) {
		return v.visitInitializedVarDeclarationFor(this,o);
	}
	public Identifier I;
	public Expression E;
	public Vname V;
}