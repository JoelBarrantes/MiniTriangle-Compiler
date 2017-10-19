/**
 * 
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrantes
 *
 */
public class RecursiveDeclaration extends Declaration {

	public RecursiveDeclaration(ProcFuncS pfsAST,SourcePosition thePosition) {
		super(thePosition);
		// TODO Auto-generated constructor stub
		PFS = pfsAST;
		
	}
	
	
	public Object visit(Visitor v, Object o) {
		// TODO Auto-generated method stub
		return v.visitRecursiveDeclaration(this, o);
	}
	
	public ProcFuncS PFS;

}
