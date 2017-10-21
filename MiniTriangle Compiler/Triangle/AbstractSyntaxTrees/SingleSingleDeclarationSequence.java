/**
 * 
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrantes
 *
 */
public class SingleSingleDeclarationSequence extends SingleDeclarationSequence {

	public SingleSingleDeclarationSequence(Declaration dAST, SourcePosition thePosition) {
		super(thePosition);
		// TODO Auto-generated constructor stub
		D = dAST;
	}

	/* (non-Javadoc)
	 * @see Triangle.AbstractSyntaxTrees.AST#visit(Triangle.AbstractSyntaxTrees.Visitor, java.lang.Object)
	 */
	public Object visit(Visitor v, Object o) {
		// TODO Auto-generated method stub
		return v.visitSingleSingleDeclarationSequence(this,o);
	}
	public Declaration D;

}
