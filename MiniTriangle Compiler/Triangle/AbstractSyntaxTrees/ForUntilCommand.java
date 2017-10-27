package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForUntilCommand extends Command {

  public ForUntilCommand (InitializedVarDeclarationFor eAST,Expression pTo, Expression pUn,Command pC, SourcePosition thePosition) {
    super (thePosition);
    var = eAST;
    to = pTo;
    un = pUn;
    c = pC;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitForUntilCommand(this, o);
  }

  public InitializedVarDeclarationFor var;
  public Expression to;
  public Expression un;//Until
  public Command c;
}