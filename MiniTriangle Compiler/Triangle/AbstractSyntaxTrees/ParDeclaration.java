package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ParDeclaration extends Declaration {

	public ParDeclaration(SingleDeclarationSequence sdsAST, SourcePosition thePosition) {
		super(thePosition);
		SDS = sdsAST;
		// TODO Auto-generated constructor stub
	}

	public Object visit(Visitor v, Object o) {
		// TODO Auto-generated method stub
		return v.visitParDeclaration(this, o);
	}
	
	public SingleDeclarationSequence SDS;

}
