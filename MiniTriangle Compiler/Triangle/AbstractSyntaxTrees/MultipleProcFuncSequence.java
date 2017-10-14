/**
 * 
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrantes
 *
 */
public class MultipleProcFuncSequence extends ProcFuncSequence {

	public MultipleProcFuncSequence(ProcFunc pfAST, ProcFuncSequence pfsAST,
            SourcePosition thePosition) {
			super (thePosition);
			PF = pfAST;
			PFS = pfsAST;
	}

	public Object visit(Visitor v, Object o) {
		return null;
	
	}

	public ProcFunc PF;
	public ProcFuncSequence PFS;

}
