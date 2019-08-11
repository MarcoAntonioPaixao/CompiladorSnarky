class Token {
  String conteudo;
  String tipoToken;
  int numLinha;

  public Token(String conteudo, String tipoToken) {
    this.conteudo = conteudo;
    this.tipoToken = tipoToken;
  }

  public static Token identificaTipoToken(char conteudo) {
    String tipo = "";

    if (conteudo == '{')
      tipo = "ABRE_CHAVE";
    else if (conteudo == '}')
      tipo = "FECHA_CHAVE";
    else if (conteudo == '[')
      tipo = "ABRE_NOT";
    else if (conteudo == ']')
      tipo = "FECHA_NOT";
    else if (conteudo == '(')
      tipo = "ABRE_PARENTESE";
    else if (conteudo == ')')
      tipo = "FECHA_PARENTESE";
    else if (conteudo == ';')
      tipo = "PONTO_VIRGULA";
    else if (ehOpAritmetico(conteudo))
      tipo = "OP_ARITMETICO";

    return new Token(Character.toString(conteudo), tipo);
  }

  public static Token retornaIdentificador(String conteudoArquivo, int indiceAtual) {
    String conteudoToken = "";

    while (ehElementoValidoID(conteudoArquivo.charAt(indiceAtual))) {
      conteudoToken += conteudoArquivo.charAt(indiceAtual);
      indiceAtual++;
    }

    if (ehPalavraReservada(conteudoToken)) {
      if (ehProc(conteudoToken)) {
        if (conteudoToken.equals("read"))
          return new Token(conteudoToken, "READ");
        else
          return new Token(conteudoToken, "WRITE");
      } else if (ehTipo(conteudoToken)) {
        return new Token(conteudoToken, "TIPO");
      } else if (conteudoToken.equals("while")) {
        return new Token(conteudoToken, "WHILE");
      } else if (conteudoToken.equals("do")) {
        return new Token(conteudoToken, "DO");
      } else if (conteudoToken.equals("if")) {
        return new Token(conteudoToken, "IF");
      } else {
        return new Token(conteudoToken, "ELSE");
      }
    } else if (ehValorBooleano(conteudoToken)) {
      return new Token(conteudoToken, "VALOR_BOOLEANO");
    } else {
      return new Token(conteudoToken, "ID");
    }
  }

  public static Token retornaNumero(String conteudoArquivo, int indiceAtual) throws NumeroInvalidoException {
    String conteudoToken = "";
    boolean flagNumeroReal = false;

    while (ehElementoValidoNumero(conteudoArquivo.charAt(indiceAtual))) {
      if (conteudoArquivo.charAt(indiceAtual) == '.') {
        flagNumeroReal = true;
        if (!Character.isDigit(conteudoArquivo.charAt(indiceAtual + 1))) {
          throw new NumeroInvalidoException(
              "O caractere " + conteudoArquivo.charAt(indiceAtual + 1) + " nao pode compor um numero real.");
        }

      }

      conteudoToken += conteudoArquivo.charAt(indiceAtual);
      indiceAtual++;
    }

    if (flagNumeroReal) {
      // VALOR_REAL
      return new Token(conteudoToken, "VALOR");
    } else {
      // VALOR_INTEIRO
      return new Token(conteudoToken, "VALOR");
    }

  }

  public static Token retornaOpLogico(String conteudoArquivo, int indiceAtual) throws OpLogicoInvalidoException {
    String conteudoToken = "";

    if (conteudoArquivo.charAt(indiceAtual) == '!')
      conteudoToken = "!";
    else if (conteudoArquivo.charAt(indiceAtual) == '&' && conteudoArquivo.charAt(indiceAtual + 1) == '&')
      conteudoToken = "&&";
    else if (conteudoArquivo.charAt(indiceAtual) == '|' && conteudoArquivo.charAt(indiceAtual + 1) == '|')
      conteudoToken = "||";
    else
      throw new OpLogicoInvalidoException("O operador logico " + conteudoArquivo.charAt(indiceAtual)
          + conteudoArquivo.charAt(indiceAtual + 1) + " nao eh um operador valido.");

    if (conteudoArquivo.charAt(indiceAtual) == '!')
      return new Token(conteudoToken, "NOT");
    else
      return new Token(conteudoToken, "OP_LOGICO");

  }

  public static Token retornaOpRelacional(String conteudoArquivo, int indiceAtual) throws OpLogicoInvalidoException {
    String conteudoToken = "";

    if (conteudoArquivo.charAt(indiceAtual) == '=' && conteudoArquivo.charAt(indiceAtual + 1) != '=')
      return new Token("=", "ATRIBUICAO");
    else {
      if (conteudoArquivo.charAt(indiceAtual) == '=' && conteudoArquivo.charAt(indiceAtual + 1) == '=')
        conteudoToken = "==";
      else if (conteudoArquivo.charAt(indiceAtual) == '<' && conteudoArquivo.charAt(indiceAtual + 1) == '=')
        conteudoToken = "<=";
      else if (conteudoArquivo.charAt(indiceAtual) == '>' && conteudoArquivo.charAt(indiceAtual + 1) == '=')
        conteudoToken = ">=";
      else if (conteudoArquivo.charAt(indiceAtual) == '<' && conteudoArquivo.charAt(indiceAtual + 1) != '=')
        conteudoToken = "<";
      else if (conteudoArquivo.charAt(indiceAtual) == '>' && conteudoArquivo.charAt(indiceAtual + 1) != '=')
        conteudoToken = ">";
      else
        throw new OpLogicoInvalidoException("O operador relacional " + conteudoArquivo.charAt(indiceAtual)
            + conteudoArquivo.charAt(indiceAtual + 1) + " nao eh um operador valido.");
      return new Token(conteudoToken, "OP_RELACIONAL");
    }

  }

  private static boolean ehElementoValidoID(char elemento) {
    return (Character.isLetter(elemento) || elemento == '_');
  }

  private static boolean ehPalavraReservada(String palavra) {
    return (palavra.equals("else") || palavra.equals("if") || palavra.equals("do") || palavra.equals("while")
        || palavra.equals("read") || palavra.equals("write") || palavra.equals("int") || palavra.equals("float")
        || palavra.equals("boolean"));
  }

  private static boolean ehValorBooleano(String palavra) {
    return (palavra.equals("true") || palavra.equals("false"));
  }

  private static boolean ehProc(String palavra) {
    return (palavra.equals("read") || palavra.equals("write"));
  }

  private static boolean ehTipo(String palavra) {
    return (palavra.equals("int") || palavra.equals("float") || palavra.equals("boolean"));
  }

  private static boolean ehElementoValidoNumero(char elemento) {
    return (Character.isDigit(elemento) || elemento == '.');
  }

  private static boolean ehOpAritmetico(char elemento) {
    return (elemento == '+' || elemento == '-' || elemento == '*' || elemento == '/');
  }
}
