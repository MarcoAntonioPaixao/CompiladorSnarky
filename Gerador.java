/**
 * Gerador
 */
public class Gerador {

    public static void gerarEstados(Tabela tabela) {
        EstadoSintatico estado0 = new EstadoSintatico();
        estado0.acoes.add(new AcaoSintatica("TIPO", new Acao("empilhar", 7)));
        estado0.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 8)));
        estado0.acoes.add(new AcaoSintatica("IF", new Acao("empilhar", 9)));
        estado0.acoes.add(new AcaoSintatica("WHILE", new Acao("empilhar", 10)));
        estado0.acoes.add(new AcaoSintatica("DO", new Acao("empilhar", 11)));
        estado0.acoes.add(new AcaoSintatica("READ", new Acao("empilhar", 12)));
        estado0.acoes.add(new AcaoSintatica("WRITE", new Acao("empilhar", 13)));
        estado0.transicoes.add(new Transicao("EXPR", 1));
        estado0.transicoes.add(new Transicao("DV", 2));
        estado0.transicoes.add(new Transicao("ASS", 3));
        estado0.transicoes.add(new Transicao("DE", 4));
        estado0.transicoes.add(new Transicao("ER", 5));
        estado0.transicoes.add(new Transicao("PROC", 6));
        tabela.estados.add(estado0);

        EstadoSintatico estado1 = new EstadoSintatico();
        estado1.acoes.add(new AcaoSintatica("$", new Acao("acc", null)));
        tabela.estados.add(estado1);

        EstadoSintatico estado2 = new EstadoSintatico();
        estado2.acoes.add(new AcaoSintatica("TIPO", new Acao("empilhar", 7)));
        estado2.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 8)));
        estado2.acoes.add(new AcaoSintatica("IF", new Acao("empilhar", 9)));
        estado2.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 1)));
        estado2.acoes.add(new AcaoSintatica("WHILE", new Acao("empilhar", 10)));
        estado2.acoes.add(new AcaoSintatica("DO", new Acao("empilhar", 11)));
        estado2.acoes.add(new AcaoSintatica("READ", new Acao("empilhar", 12)));
        estado2.acoes.add(new AcaoSintatica("WRITE", new Acao("empilhar", 13)));
        estado2.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 1)));
        estado2.transicoes.add(new Transicao("EXPR", 14));
        estado2.transicoes.add(new Transicao("DV", 2));
        estado2.transicoes.add(new Transicao("ASS", 3));
        estado2.transicoes.add(new Transicao("DE", 4));
        estado2.transicoes.add(new Transicao("ER", 5));
        estado2.transicoes.add(new Transicao("PROC", 6));
        tabela.estados.add(estado2);

        EstadoSintatico estado3 = new EstadoSintatico();
        estado3.acoes.add(new AcaoSintatica("TIPO", new Acao("empilhar", 7)));
        estado3.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 8)));
        estado3.acoes.add(new AcaoSintatica("IF", new Acao("empilhar", 9)));
        estado3.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 1)));
        estado3.acoes.add(new AcaoSintatica("WHILE", new Acao("empilhar", 10)));
        estado3.acoes.add(new AcaoSintatica("DO", new Acao("empilhar", 11)));
        estado3.acoes.add(new AcaoSintatica("READ", new Acao("empilhar", 12)));
        estado3.acoes.add(new AcaoSintatica("WRITE", new Acao("empilhar", 13)));
        estado3.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 3)));
        estado3.transicoes.add(new Transicao("EXPR", 15));
        estado3.transicoes.add(new Transicao("DV", 2));
        estado3.transicoes.add(new Transicao("ASS", 3));
        estado3.transicoes.add(new Transicao("DE", 4));
        estado3.transicoes.add(new Transicao("ER", 5));
        estado3.transicoes.add(new Transicao("PROC", 6));
        tabela.estados.add(estado3);

        EstadoSintatico estado4 = new EstadoSintatico();
        estado4.acoes.add(new AcaoSintatica("TIPO", new Acao("empilhar", 7)));
        estado4.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 8)));
        estado4.acoes.add(new AcaoSintatica("IF", new Acao("empilhar", 9)));
        estado4.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 1)));
        estado4.acoes.add(new AcaoSintatica("WHILE", new Acao("empilhar", 10)));
        estado4.acoes.add(new AcaoSintatica("DO", new Acao("empilhar", 11)));
        estado4.acoes.add(new AcaoSintatica("READ", new Acao("empilhar", 12)));
        estado4.acoes.add(new AcaoSintatica("WRITE", new Acao("empilhar", 13)));
        estado4.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 5)));
        estado4.transicoes.add(new Transicao("EXPR", 16));
        estado4.transicoes.add(new Transicao("DV", 2));
        estado4.transicoes.add(new Transicao("ASS", 3));
        estado4.transicoes.add(new Transicao("DE", 4));
        estado4.transicoes.add(new Transicao("ER", 5));
        estado4.transicoes.add(new Transicao("PROC", 6));
        tabela.estados.add(estado4);

        EstadoSintatico estado5 = new EstadoSintatico();
        estado5.acoes.add(new AcaoSintatica("TIPO", new Acao("empilhar", 7)));
        estado5.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 8)));
        estado5.acoes.add(new AcaoSintatica("IF", new Acao("empilhar", 9)));
        estado5.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 1)));
        estado5.acoes.add(new AcaoSintatica("WHILE", new Acao("empilhar", 10)));
        estado5.acoes.add(new AcaoSintatica("DO", new Acao("empilhar", 11)));
        estado5.acoes.add(new AcaoSintatica("READ", new Acao("empilhar", 12)));
        estado5.acoes.add(new AcaoSintatica("WRITE", new Acao("empilhar", 13)));
        estado5.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 7)));
        estado5.transicoes.add(new Transicao("EXPR", 17));
        estado5.transicoes.add(new Transicao("DV", 2));
        estado5.transicoes.add(new Transicao("ASS", 3));
        estado5.transicoes.add(new Transicao("DE", 4));
        estado5.transicoes.add(new Transicao("ER", 5));
        estado5.transicoes.add(new Transicao("PROC", 6));
        tabela.estados.add(estado5);

        EstadoSintatico estado6 = new EstadoSintatico();
        estado6.acoes.add(new AcaoSintatica("TIPO", new Acao("empilhar", 7)));
        estado6.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 8)));
        estado6.acoes.add(new AcaoSintatica("IF", new Acao("empilhar", 9)));
        estado6.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 1)));
        estado6.acoes.add(new AcaoSintatica("WHILE", new Acao("empilhar", 10)));
        estado6.acoes.add(new AcaoSintatica("DO", new Acao("empilhar", 11)));
        estado6.acoes.add(new AcaoSintatica("READ", new Acao("empilhar", 12)));
        estado6.acoes.add(new AcaoSintatica("WRITE", new Acao("empilhar", 13)));
        estado6.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 9)));
        estado6.transicoes.add(new Transicao("EXPR", 18));
        estado6.transicoes.add(new Transicao("DV", 2));
        estado6.transicoes.add(new Transicao("ASS", 3));
        estado6.transicoes.add(new Transicao("DE", 4));
        estado6.transicoes.add(new Transicao("ER", 5));
        estado6.transicoes.add(new Transicao("PROC", 6));
        tabela.estados.add(estado6);

        EstadoSintatico estado7 = new EstadoSintatico();
        estado7.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 19)));
        tabela.estados.add(estado7);

        EstadoSintatico estado8 = new EstadoSintatico();
        estado8.acoes.add(new AcaoSintatica("ATRIBUICAO", new Acao("empilhar", 21)));
        estado8.transicoes.add(new Transicao("ATR", 20));
        tabela.estados.add(estado8);

        EstadoSintatico estado9 = new EstadoSintatico();
        estado9.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 22)));
        tabela.estados.add(estado9);

        EstadoSintatico estado10 = new EstadoSintatico();
        estado10.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 23)));
        tabela.estados.add(estado10);

        EstadoSintatico estado11 = new EstadoSintatico();
        estado11.acoes.add(new AcaoSintatica("ABRE_CHAVE", new Acao("empilhar", 25)));
        estado11.transicoes.add(new Transicao("BK", 24));
        tabela.estados.add(estado11);

        EstadoSintatico estado12 = new EstadoSintatico();
        estado12.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 26)));
        tabela.estados.add(estado12);

        EstadoSintatico estado13 = new EstadoSintatico();
        estado13.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 27)));
        tabela.estados.add(estado13);

        EstadoSintatico estado14 = new EstadoSintatico();
        estado14.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 2)));
        estado14.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 2)));
        tabela.estados.add(estado14);

        EstadoSintatico estado15 = new EstadoSintatico();
        estado15.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 4)));
        estado15.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 4)));
        tabela.estados.add(estado15);

        EstadoSintatico estado16 = new EstadoSintatico();
        estado16.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 6)));
        estado16.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 6)));
        tabela.estados.add(estado16);

        EstadoSintatico estado17 = new EstadoSintatico();
        estado17.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 8)));
        estado17.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 8)));
        tabela.estados.add(estado17);

        EstadoSintatico estado18 = new EstadoSintatico();
        estado18.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 10)));
        estado18.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 10)));
        tabela.estados.add(estado18);

        EstadoSintatico estado19 = new EstadoSintatico();
        estado19.acoes.add(new AcaoSintatica("ATRIBUICAO", new Acao("empilhar", 29)));
        estado19.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("empilhar", 30)));
        estado19.transicoes.add(new Transicao("EV", 28));
        tabela.estados.add(estado19);

        EstadoSintatico estado20 = new EstadoSintatico();
        estado20.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("empilhar", 31)));
        tabela.estados.add(estado20);

        EstadoSintatico estado21 = new EstadoSintatico();
        estado21.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 37)));
        estado21.acoes.add(new AcaoSintatica("VALOR", new Acao("empilhar", 32)));
        estado21.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 36)));
        estado21.transicoes.add(new Transicao("OP_AR", 33));
        estado21.transicoes.add(new Transicao("MID", 34));
        estado21.transicoes.add(new Transicao("INF", 35));
        tabela.estados.add(estado21);

        EstadoSintatico estado22 = new EstadoSintatico();
        estado22.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 42)));
        estado22.acoes.add(new AcaoSintatica("VALOR_BOOLEANO", new Acao("empilhar", 39)));
        estado22.acoes.add(new AcaoSintatica("NOT", new Acao("empilhar", 40)));
        estado22.transicoes.add(new Transicao("BOOL_S", 38));
        estado22.transicoes.add(new Transicao("OP", 41));
        estado22.transicoes.add(new Transicao("OP_REL", 43));
        estado22.transicoes.add(new Transicao("OP_LO", 44));
        tabela.estados.add(estado22);

        EstadoSintatico estado23 = new EstadoSintatico();
        estado23.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 42)));
        estado23.acoes.add(new AcaoSintatica("VALOR_BOOLEANO", new Acao("empilhar", 39)));
        estado23.acoes.add(new AcaoSintatica("NOT", new Acao("empilhar", 40)));
        estado23.transicoes.add(new Transicao("BOOL_S", 45));
        estado23.transicoes.add(new Transicao("OP", 41));
        estado23.transicoes.add(new Transicao("OP_REL", 43));
        estado23.transicoes.add(new Transicao("OP_LO", 44));
        tabela.estados.add(estado23);

        EstadoSintatico estado24 = new EstadoSintatico();
        estado24.acoes.add(new AcaoSintatica("WHILE", new Acao("empilhar", 46)));
        tabela.estados.add(estado24);

        EstadoSintatico estado25 = new EstadoSintatico();
        estado25.acoes.add(new AcaoSintatica("TIPO", new Acao("empilhar", 7)));
        estado25.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 8)));
        estado25.acoes.add(new AcaoSintatica("IF", new Acao("empilhar", 9)));
        estado25.acoes.add(new AcaoSintatica("WHILE", new Acao("empilhar", 10)));
        estado25.acoes.add(new AcaoSintatica("DO", new Acao("empilhar", 11)));
        estado25.acoes.add(new AcaoSintatica("READ", new Acao("empilhar", 12)));
        estado25.acoes.add(new AcaoSintatica("WRITE", new Acao("empilhar", 13)));
        estado25.transicoes.add(new Transicao("EXPR", 47));
        estado25.transicoes.add(new Transicao("DV", 2));
        estado25.transicoes.add(new Transicao("ASS", 3));
        estado25.transicoes.add(new Transicao("DE", 4));
        estado25.transicoes.add(new Transicao("ER", 5));
        estado25.transicoes.add(new Transicao("PROC", 6));
        tabela.estados.add(estado25);

        EstadoSintatico estado26 = new EstadoSintatico();
        estado26.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 48)));
        tabela.estados.add(estado26);

        EstadoSintatico estado27 = new EstadoSintatico();
        estado27.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 49)));
        estado27.acoes.add(new AcaoSintatica("VALOR", new Acao("empilhar", 50)));
        tabela.estados.add(estado27);

        EstadoSintatico estado28 = new EstadoSintatico();
        estado28.acoes.add(new AcaoSintatica("TIPO", new Acao("reduzir", 11)));
        estado28.acoes.add(new AcaoSintatica("ID", new Acao("reduzir", 11)));
        estado28.acoes.add(new AcaoSintatica("IF", new Acao("reduzir", 11)));
        estado28.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 11)));
        estado28.acoes.add(new AcaoSintatica("WHILE", new Acao("reduzir", 11)));
        estado28.acoes.add(new AcaoSintatica("DO", new Acao("reduzir", 11)));
        estado28.acoes.add(new AcaoSintatica("READ", new Acao("reduzir", 11)));
        estado28.acoes.add(new AcaoSintatica("WRITE", new Acao("reduzir", 11)));
        estado28.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 11)));
        tabela.estados.add(estado28);

        EstadoSintatico estado29 = new EstadoSintatico();
        estado29.acoes.add(new AcaoSintatica("VALOR", new Acao("empilhar", 51)));
        estado29.acoes.add(new AcaoSintatica("VALOR_BOOLEANO", new Acao("empilhar", 52)));
        tabela.estados.add(estado29);

        EstadoSintatico estado30 = new EstadoSintatico();
        estado30.acoes.add(new AcaoSintatica("TIPO", new Acao("reduzir", 14)));
        estado30.acoes.add(new AcaoSintatica("ID", new Acao("reduzir", 14)));
        estado30.acoes.add(new AcaoSintatica("IF", new Acao("reduzir", 14)));
        estado30.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 14)));
        estado30.acoes.add(new AcaoSintatica("WHILE", new Acao("reduzir", 14)));
        estado30.acoes.add(new AcaoSintatica("DO", new Acao("reduzir", 14)));
        estado30.acoes.add(new AcaoSintatica("READ", new Acao("reduzir", 14)));
        estado30.acoes.add(new AcaoSintatica("WRITE", new Acao("reduzir", 14)));
        estado30.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 14)));
        tabela.estados.add(estado30);

        EstadoSintatico estado31 = new EstadoSintatico();
        estado31.acoes.add(new AcaoSintatica("TIPO", new Acao("reduzir", 17)));
        estado31.acoes.add(new AcaoSintatica("ID", new Acao("reduzir", 17)));
        estado31.acoes.add(new AcaoSintatica("IF", new Acao("reduzir", 17)));
        estado31.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 17)));
        estado31.acoes.add(new AcaoSintatica("WHILE", new Acao("reduzir", 17)));
        estado31.acoes.add(new AcaoSintatica("DO", new Acao("reduzir", 17)));
        estado31.acoes.add(new AcaoSintatica("READ", new Acao("reduzir", 17)));
        estado31.acoes.add(new AcaoSintatica("WRITE", new Acao("reduzir", 17)));
        estado31.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 17)));
        tabela.estados.add(estado31);

        EstadoSintatico estado32 = new EstadoSintatico();
        estado32.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 15)));
        tabela.estados.add(estado32);

        EstadoSintatico estado33 = new EstadoSintatico();
        estado33.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 16)));
        estado33.acoes.add(new AcaoSintatica("MAIS", new Acao("empilhar", 53)));
        estado33.acoes.add(new AcaoSintatica("MENOS", new Acao("empilhar", 54)));
        tabela.estados.add(estado33);

        EstadoSintatico estado34 = new EstadoSintatico();
        estado34.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 38)));
        estado34.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 38)));
        estado34.acoes.add(new AcaoSintatica("MAIS", new Acao("reduzir", 38)));
        estado34.acoes.add(new AcaoSintatica("MENOS", new Acao("reduzir", 38)));
        estado34.acoes.add(new AcaoSintatica("VEZES", new Acao("empilhar", 55)));
        estado34.acoes.add(new AcaoSintatica("DIVIDIR", new Acao("empilhar", 56)));
        tabela.estados.add(estado34);

        EstadoSintatico estado35 = new EstadoSintatico();
        estado35.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 41)));
        estado35.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 41)));
        estado35.acoes.add(new AcaoSintatica("MAIS", new Acao("reduzir", 41)));
        estado35.acoes.add(new AcaoSintatica("MENOS", new Acao("reduzir", 41)));
        estado35.acoes.add(new AcaoSintatica("VEZES", new Acao("reduzir", 41)));
        estado35.acoes.add(new AcaoSintatica("DIVIDIR", new Acao("reduzir", 41)));
        tabela.estados.add(estado35);

        EstadoSintatico estado36 = new EstadoSintatico();
        estado36.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 37)));
        estado36.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 36)));
        estado36.transicoes.add(new Transicao("OP_AR", 57));
        estado36.transicoes.add(new Transicao("MID", 34));
        estado36.transicoes.add(new Transicao("INF", 35));
        tabela.estados.add(estado36);

        EstadoSintatico estado37 = new EstadoSintatico();
        estado37.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 43)));
        estado37.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 43)));
        estado37.acoes.add(new AcaoSintatica("MAIS", new Acao("reduzir", 43)));
        estado37.acoes.add(new AcaoSintatica("MENOS", new Acao("reduzir", 43)));
        estado37.acoes.add(new AcaoSintatica("VEZES", new Acao("reduzir", 43)));
        estado37.acoes.add(new AcaoSintatica("DIVIDIR", new Acao("reduzir", 43)));
        tabela.estados.add(estado37);

        EstadoSintatico estado38 = new EstadoSintatico();
        estado38.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilhar", 58)));
        estado38.acoes.add(new AcaoSintatica("OP_REL", new Acao("empilhar", 59)));
        estado38.acoes.add(new AcaoSintatica("OP_LO", new Acao("empilhar", 60)));
        tabela.estados.add(estado38);

        EstadoSintatico estado39 = new EstadoSintatico();
        estado39.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 20)));
        estado39.acoes.add(new AcaoSintatica("OP_REL", new Acao("reduzir", 20)));
        estado39.acoes.add(new AcaoSintatica("OP_LO", new Acao("reduzir", 20)));
        tabela.estados.add(estado39);

        EstadoSintatico estado40 = new EstadoSintatico();
        estado40.acoes.add(new AcaoSintatica("ABRE_NOT", new Acao("empilha", 61)));
        tabela.estados.add(estado40);

        EstadoSintatico estado41 = new EstadoSintatico();
        estado41.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 22)));
        estado41.acoes.add(new AcaoSintatica("OP_REL", new Acao("reduzir", 22)));
        estado41.acoes.add(new AcaoSintatica("OP_LO", new Acao("reduzir", 22)));
        tabela.estados.add(estado41);

        EstadoSintatico estado42 = new EstadoSintatico();
        estado42.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 24)));
        estado42.acoes.add(new AcaoSintatica("OP_REL", new Acao("reduzir", 24)));
        estado42.acoes.add(new AcaoSintatica("OP_LO", new Acao("reduzir", 24)));
        tabela.estados.add(estado42);

        EstadoSintatico estado43 = new EstadoSintatico();
        estado43.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 29)));
        estado43.acoes.add(new AcaoSintatica("FECHA_NOT", new Acao("reduzir", 29)));
        estado43.acoes.add(new AcaoSintatica("OP_REL", new Acao("reduzir", 29)));
        estado43.acoes.add(new AcaoSintatica("OP_LO", new Acao("reduzir", 29)));
        tabela.estados.add(estado43);

        EstadoSintatico estado44 = new EstadoSintatico();
        estado44.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 30)));
        estado44.acoes.add(new AcaoSintatica("FECHA_NOT", new Acao("reduzir", 30)));
        estado44.acoes.add(new AcaoSintatica("OP_REL", new Acao("reduzir", 30)));
        estado44.acoes.add(new AcaoSintatica("OP_LO", new Acao("reduzir", 30)));
        tabela.estados.add(estado44);

        EstadoSintatico estado45 = new EstadoSintatico();
        estado45.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilha", 62)));
        estado45.acoes.add(new AcaoSintatica("OP_REL", new Acao("empilha", 59)));
        estado45.acoes.add(new AcaoSintatica("OP_LO", new Acao("empilha", 60)));
        tabela.estados.add(estado45);

        EstadoSintatico estado46 = new EstadoSintatico();
        estado46.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilha", 63)));
        tabela.estados.add(estado46);

        EstadoSintatico estado47 = new EstadoSintatico();
        estado47.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("empilha", 64)));
        tabela.estados.add(estado47);

        EstadoSintatico estado48 = new EstadoSintatico();
        estado48.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilha", 65)));
        tabela.estados.add(estado48);

        EstadoSintatico estado49 = new EstadoSintatico();
        estado49.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilha", 66)));
        tabela.estados.add(estado49);

        EstadoSintatico estado50 = new EstadoSintatico();
        estado50.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilha", 67)));
        tabela.estados.add(estado50);

        EstadoSintatico estado51 = new EstadoSintatico();
        estado51.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("empilha", 68)));
        tabela.estados.add(estado51);

        EstadoSintatico estado52 = new EstadoSintatico();
        estado52.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("empilha", 69)));
        tabela.estados.add(estado52);

    }

    public static void gerarReducoes(Tabela tabela) {

    }
}