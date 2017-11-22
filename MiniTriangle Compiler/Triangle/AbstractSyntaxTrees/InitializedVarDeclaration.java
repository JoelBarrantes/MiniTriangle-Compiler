/**
 * 
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrante
 *
 */
public class InitializedVarDeclaration extends Declaration {

	public InitializedVarDeclaration(Identifier iAST, Expression eAST, Vname vAST, SourcePosition thePosition) {
		super(thePosition);
	
		I = iAST;
		E = eAST;
		V = vAST;
	}

	public Object visit(Visitor v, Object o) {
		return v.visitInitializedVarDeclaration(this,o);
	}
	public Identifier I;
	public Expression E;
	public Vname V;
}
