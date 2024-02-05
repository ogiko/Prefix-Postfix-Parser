interface Visitor {
  public int visit(Exp e);
  public int visit(Plus e);
  public int visit(Minus e);
  public int visit(Times e);
  public int visit(Divide e);
  public int visit(Power e);
  public int visit(Num e);
}
