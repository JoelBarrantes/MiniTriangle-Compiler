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
		// TODO Auto-generated constructor stub
		I = iAST;
		E = eAST;
	}

	/* (non-Javadoc)
	 * @see Triangle.AbstractSyntaxTrees.AST#visit(Triangle.AbstractSyntaxTrees.Visitor, java.lang.Object)
	 */
	public Object visit(Visitor v, Object o) {
		// TODO Auto-generated method stub
		return null;
	}
	public Identifier I;
	public Expression E;
}
