package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrantes
 *
 */

public class FuncProcFunc extends ProcFunc {

	public FuncProcFunc(Identifier iAST, FormalParameterSequence fpsAST, 
						TypeDenoter tAST, Expression eAST, SourcePosition thePosition) {
		super(thePosition);
		I = iAST;
		FPS = fpsAST;
		T = tAST;
		E = eAST;
		// TODO Auto-generated constructor stub
	}

	public Object visit(Visitor v, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public Identifier I;
	public FormalParameterSequence FPS;
	public TypeDenoter T;
	public Expression E;
}
