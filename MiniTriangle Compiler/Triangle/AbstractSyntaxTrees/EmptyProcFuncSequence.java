/**
 * 
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrantes
 *
 */
public class EmptyProcFuncSequence extends ProcFuncSequence {

	public EmptyProcFuncSequence(SourcePosition thePosition) {
		super(thePosition);

	}

	
	public Object visit(Visitor v, Object o) {
		
		return v.visitEmptyProcFuncSequence(this, o);
	}
	
	

}
