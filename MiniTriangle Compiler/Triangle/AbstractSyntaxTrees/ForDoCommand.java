package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForDoCommand extends Command {

  public ForDoCommand (InitializedVarDeclarationFor eAST,Expression pTo,Command pC, SourcePosition thePosition) {
    super (thePosition);
    var = eAST;
    c = pC;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitForDoCommand(this, o);
  }

  public InitializedVarDeclarationFor var;
  public Expression to;
  public Command c;
}