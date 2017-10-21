package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @author Joel Barrantes
 *
 */
public class ProcProcFunc extends ProcFunc {

	public ProcProcFunc(Identifier iAST, FormalParameterSequence fpsAST,Command cAST, SourcePosition thePosition) {
		super(thePosition);
		I = iAST;
		FPS = fpsAST;
		C = cAST;
		// TODO Auto-generated constructor stub
	}

	public Object visit(Visitor v, Object o) {
		// TODO Auto-generated method stub
		return v.visitProcProcFunc(this,o);
	}

	public Identifier I;
	public FormalParameterSequence FPS;
	public Command C;
}
