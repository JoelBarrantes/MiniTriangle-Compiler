/**
 * 
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrantes
 *
 */
public class MultipleSingleDeclarationSequence extends SingleDeclarationSequence {

	public MultipleSingleDeclarationSequence(Declaration d1AST,SingleDeclarationSequence d2AST,SourcePosition thePosition) {
		super(thePosition);
		// TODO Auto-generated constructor stub
		D = d1AST;
		SDS = d2AST;
	}

	/* (non-Javadoc)
	 * @see Triangle.AbstractSyntaxTrees.AST#visit(Triangle.AbstractSyntaxTrees.Visitor, java.lang.Object)
	 */
	public Object visit(Visitor v, Object o) {
		// TODO Auto-generated method stub
		return v.visitMultipleSingleDeclarationSequence(this,o);
	}
	
	public Declaration D;
	public SingleDeclarationSequence SDS;

}
