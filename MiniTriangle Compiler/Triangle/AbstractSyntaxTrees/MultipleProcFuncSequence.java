/**
 * 
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrantes
 *
 */
public class MultipleProcFuncSequence extends ProcFuncS {

	public MultipleProcFuncSequence(ProcFunc pfAST, ProcFuncS pfsAST,
            SourcePosition thePosition) {
			super (thePosition);
			PF = pfAST;
			PFS = pfsAST;
	}

	public Object visit(Visitor v, Object o) {
		return v.visitMultipleProcFuncSequence(this,o);
	
	}

	public ProcFunc PF;
	public ProcFuncS PFS;

}
