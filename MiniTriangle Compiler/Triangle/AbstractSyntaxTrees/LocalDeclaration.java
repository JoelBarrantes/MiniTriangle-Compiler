/**
 * @author Joel Barrantes
 *
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class LocalDeclaration extends Declaration {

	public LocalDeclaration(Declaration d1AST, Declaration d2AST, SourcePosition thePosition) {
		super(thePosition);
		D1 = d1AST;
		D2 = d2AST;
		// TODO Auto-generated constructor stub
	}

	public Object visit(Visitor v, Object o) {
		// TODO Auto-generated method stub
		return v.visitLocalDeclaration(this, o);
	}
	
	public Declaration D1,D2;

}
