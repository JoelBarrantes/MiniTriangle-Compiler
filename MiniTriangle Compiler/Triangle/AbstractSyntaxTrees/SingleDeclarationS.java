/**
 * 
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrantes
 *
 */
public class SingleDeclarationS extends Declaration {

	public SingleDeclarationS(Declaration d1AST, Declaration d2AST, SingleDeclarationSequence sdsAST, SourcePosition thePosition) {
		super(thePosition);
		D1 = d1AST;
		D2 = d2AST;
		SDS = sdsAST;

	}


	public Object visit(Visitor v, Object o) {

		return v.visitSingleDeclarationS(this,o);
	}
	public Declaration D1, D2;
	public SingleDeclarationSequence SDS;
	
}
