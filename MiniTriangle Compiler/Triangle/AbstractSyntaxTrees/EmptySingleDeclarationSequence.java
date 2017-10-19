/**
 * 
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrantes
 *
 */
public class EmptySingleDeclarationSequence extends SingleDeclarationSequence {

	public EmptySingleDeclarationSequence(SourcePosition thePosition) {
		super(thePosition);
	}

	public Object visit(Visitor v, Object o) {
		return v.visitEmptySingleDeclarationSequence(this,o);
	}

}
