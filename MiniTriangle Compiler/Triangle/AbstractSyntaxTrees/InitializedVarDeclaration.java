/**
 * 
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrantes
 *
 */
public class InitializedVarDeclaration extends Declaration {

	public InitializedVarDeclaration(Identifier iAST, Expression eAST, SourcePosition thePosition) {
		super(thePosition);
	
		I = iAST;
		E = eAST;
	}

	public Object visit(Visitor v, Object o) {
		return v.visitInitializedVarDeclaration(this,o);
	}
	public Identifier I;
	public Expression E;
}
