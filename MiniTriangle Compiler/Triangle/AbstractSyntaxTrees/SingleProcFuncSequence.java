/**
 * 
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrantes
 *
 */
public class SingleProcFuncSequence extends ProcFuncS {

	
	public SingleProcFuncSequence(ProcFunc pfAST, SourcePosition thePosition) {
		super(thePosition);
		PF = pfAST;
		// TODO Auto-generated constructor stub
	}

	public Object visit(Visitor v, Object o) {
		// TODO Auto-generated method stub
		return v.visitSingleProcFuncSequence(this,o);
	}
	public ProcFunc PF;
}
