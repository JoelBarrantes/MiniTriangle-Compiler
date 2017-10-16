/**
 * 
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrantes
 *
 */
public class ProcFuncS extends AST {

	public ProcFuncS(ProcFunc pf1AST, ProcFunc pf2AST, ProcFuncSequence pfsAST,  SourcePosition thePosition) {
		super(thePosition);
		PF1 = pf1AST;
		PF2 = pf2AST;
		PFS = pfsAST;
		// TODO Auto-generated constructor stub
	}

	public Object visit(Visitor v, Object o) {
		// TODO Auto-generated method stub
		return v.visitProcFuncS(this,o);
	}
	
	public ProcFunc PF1,PF2;
	public ProcFuncSequence PFS;

}
