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
        estado1.acoes.add(new AcaoSintatica("$", new Acao("acc", 0)));
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
        estado3.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 3)));
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
        estado4.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 5)));
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
        estado5.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 7)));
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
        estado6.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 9)));
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
        estado21.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 38)));
        estado21.acoes.add(new AcaoSintatica("VALOR", new Acao("empilhar", 32)));
        estado21.acoes.add(new AcaoSintatica("VALOR_BOOLEANO", new Acao("empilhar", 34)));
        estado21.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 37)));
        estado21.transicoes.add(new Transicao("OP_AR", 33));
        estado21.transicoes.add(new Transicao("MID", 35));
        estado21.transicoes.add(new Transicao("INF", 36));
        tabela.estados.add(estado21);

        EstadoSintatico estado22 = new EstadoSintatico();
        estado22.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 43)));
        estado22.acoes.add(new AcaoSintatica("VALOR_BOOLEANO", new Acao("empilhar", 40)));
        estado22.acoes.add(new AcaoSintatica("NOT", new Acao("empilhar", 41)));
        estado22.transicoes.add(new Transicao("BOOL_S", 39));
        estado22.transicoes.add(new Transicao("OP", 42));
        estado22.transicoes.add(new Transicao("OP_REL", 44));
        estado22.transicoes.add(new Transicao("OP_LO", 45));
        tabela.estados.add(estado22);

        EstadoSintatico estado23 = new EstadoSintatico();
        estado23.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 43)));
        estado23.acoes.add(new AcaoSintatica("VALOR_BOOLEANO", new Acao("empilhar", 40)));
        estado23.acoes.add(new AcaoSintatica("NOT", new Acao("empilhar", 41)));
        estado23.transicoes.add(new Transicao("BOOL_S", 46));
        estado23.transicoes.add(new Transicao("OP", 42));
        estado23.transicoes.add(new Transicao("OP_REL", 44));
        estado23.transicoes.add(new Transicao("OP_LO", 45));
        tabela.estados.add(estado23);

        EstadoSintatico estado24 = new EstadoSintatico();
        estado24.acoes.add(new AcaoSintatica("WHILE", new Acao("empilhar", 47)));
        tabela.estados.add(estado24);

        EstadoSintatico estado25 = new EstadoSintatico();
        estado25.acoes.add(new AcaoSintatica("TIPO", new Acao("empilhar", 7)));
        estado25.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 8)));
        estado25.acoes.add(new AcaoSintatica("IF", new Acao("empilhar", 9)));
        estado25.acoes.add(new AcaoSintatica("WHILE", new Acao("empilhar", 10)));
        estado25.acoes.add(new AcaoSintatica("DO", new Acao("empilhar", 11)));
        estado25.acoes.add(new AcaoSintatica("READ", new Acao("empilhar", 12)));
        estado25.acoes.add(new AcaoSintatica("WRITE", new Acao("empilhar", 13)));
        estado25.transicoes.add(new Transicao("EXPR", 48));
        estado25.transicoes.add(new Transicao("DV", 2));
        estado25.transicoes.add(new Transicao("ASS", 3));
        estado25.transicoes.add(new Transicao("DE", 4));
        estado25.transicoes.add(new Transicao("ER", 5));
        estado25.transicoes.add(new Transicao("PROC", 6));
        tabela.estados.add(estado25);

        EstadoSintatico estado26 = new EstadoSintatico();
        estado26.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 49)));
        tabela.estados.add(estado26);

        EstadoSintatico estado27 = new EstadoSintatico();
        estado27.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 50)));
        estado27.acoes.add(new AcaoSintatica("VALOR", new Acao("empilhar", 51)));
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
        estado29.acoes.add(new AcaoSintatica("VALOR", new Acao("empilhar", 52)));
        estado29.acoes.add(new AcaoSintatica("VALOR_BOOLEANO", new Acao("empilhar", 53)));
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
        estado33.acoes.add(new AcaoSintatica("MAIS", new Acao("empilhar", 54)));
        estado33.acoes.add(new AcaoSintatica("MENOS", new Acao("empilhar", 55)));
        tabela.estados.add(estado33);

        // 34
        EstadoSintatico estado98 = new EstadoSintatico();
        estado98.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 44)));
        tabela.estados.add(estado98);

        // 35 -- etc.
        EstadoSintatico estado34 = new EstadoSintatico();
        estado34.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 38)));
        estado34.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 38)));
        estado34.acoes.add(new AcaoSintatica("MAIS", new Acao("reduzir", 38)));
        estado34.acoes.add(new AcaoSintatica("MENOS", new Acao("reduzir", 38)));
        estado34.acoes.add(new AcaoSintatica("VEZES", new Acao("empilhar", 56)));
        estado34.acoes.add(new AcaoSintatica("DIVIDIR", new Acao("empilhar", 57)));
        tabela.estados.add(estado34);

        // 36
        EstadoSintatico estado35 = new EstadoSintatico();
        estado35.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 41)));
        estado35.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 41)));
        estado35.acoes.add(new AcaoSintatica("MAIS", new Acao("reduzir", 41)));
        estado35.acoes.add(new AcaoSintatica("MENOS", new Acao("reduzir", 41)));
        estado35.acoes.add(new AcaoSintatica("VEZES", new Acao("reduzir", 41)));
        estado35.acoes.add(new AcaoSintatica("DIVIDIR", new Acao("reduzir", 41)));
        tabela.estados.add(estado35);

        EstadoSintatico estado36 = new EstadoSintatico();
        estado36.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 38)));
        estado36.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 37)));
        estado36.transicoes.add(new Transicao("OP_AR", 58));
        estado36.transicoes.add(new Transicao("MID", 35));
        estado36.transicoes.add(new Transicao("INF", 36));
        tabela.estados.add(estado36);

        // 38
        EstadoSintatico estado37 = new EstadoSintatico();
        estado37.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 43)));
        estado37.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 43)));
        estado37.acoes.add(new AcaoSintatica("MAIS", new Acao("reduzir", 43)));
        estado37.acoes.add(new AcaoSintatica("MENOS", new Acao("reduzir", 43)));
        estado37.acoes.add(new AcaoSintatica("VEZES", new Acao("reduzir", 43)));
        estado37.acoes.add(new AcaoSintatica("DIVIDIR", new Acao("reduzir", 43)));
        tabela.estados.add(estado37);

        EstadoSintatico estado38 = new EstadoSintatico();
        estado38.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilhar", 59)));
        estado38.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("empilhar", 60)));
        estado38.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("empilhar", 61)));
        tabela.estados.add(estado38);

        EstadoSintatico estado39 = new EstadoSintatico();
        estado39.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 20)));
        estado39.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("reduzir", 20)));
        estado39.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("reduzir", 20)));
        tabela.estados.add(estado39);

        EstadoSintatico estado40 = new EstadoSintatico();
        estado40.acoes.add(new AcaoSintatica("ABRE_NOT", new Acao("empilhar", 62)));
        tabela.estados.add(estado40);

        EstadoSintatico estado41 = new EstadoSintatico();
        estado41.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 22)));
        estado41.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("reduzir", 22)));
        estado41.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("reduzir", 22)));
        tabela.estados.add(estado41);

        EstadoSintatico estado42 = new EstadoSintatico();
        estado42.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 24)));
        estado42.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("reduzir", 24)));
        estado42.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("reduzir", 24)));
        tabela.estados.add(estado42);

        EstadoSintatico estado43 = new EstadoSintatico();
        estado43.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 29)));
        estado43.acoes.add(new AcaoSintatica("FECHA_NOT", new Acao("reduzir", 29)));
        estado43.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("reduzir", 29)));
        estado43.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("reduzir", 29)));
        tabela.estados.add(estado43);

        EstadoSintatico estado44 = new EstadoSintatico();
        estado44.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 30)));
        estado44.acoes.add(new AcaoSintatica("FECHA_NOT", new Acao("reduzir", 30)));
        estado44.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("reduzir", 30)));
        estado44.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("reduzir", 30)));
        tabela.estados.add(estado44);

        EstadoSintatico estado45 = new EstadoSintatico();
        estado45.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilhar", 63)));
        estado45.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("empilhar", 60)));
        estado45.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("empilhar", 61)));
        tabela.estados.add(estado45);

        EstadoSintatico estado46 = new EstadoSintatico();
        estado46.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 64)));
        tabela.estados.add(estado46);

        EstadoSintatico estado47 = new EstadoSintatico();
        estado47.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("empilhar", 65)));
        tabela.estados.add(estado47);

        EstadoSintatico estado48 = new EstadoSintatico();
        estado48.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilhar", 66)));
        tabela.estados.add(estado48);

        EstadoSintatico estado49 = new EstadoSintatico();
        estado49.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilhar", 67)));
        tabela.estados.add(estado49);

        EstadoSintatico estado50 = new EstadoSintatico();
        estado50.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilhar", 68)));
        tabela.estados.add(estado50);

        EstadoSintatico estado51 = new EstadoSintatico();
        estado51.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("empilhar", 69)));
        tabela.estados.add(estado51);

        EstadoSintatico estado52 = new EstadoSintatico();
        estado52.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("empilhar", 70)));
        tabela.estados.add(estado52);

        EstadoSintatico estado53 = new EstadoSintatico();
        estado53.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 38)));
        estado53.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 37)));
        estado53.transicoes.add(new Transicao("MID", 71));
        estado53.transicoes.add(new Transicao("INF", 36));
        tabela.estados.add(estado53);

        EstadoSintatico estado54 = new EstadoSintatico();
        estado54.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 38)));
        estado54.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 37)));
        estado54.transicoes.add(new Transicao("MID", 72));
        estado54.transicoes.add(new Transicao("INF", 36));
        tabela.estados.add(estado54);

        EstadoSintatico estado55 = new EstadoSintatico();
        estado55.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 38)));
        estado55.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 37)));
        estado55.transicoes.add(new Transicao("INF", 73));
        tabela.estados.add(estado55);

        EstadoSintatico estado56 = new EstadoSintatico();
        estado56.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 38)));
        estado56.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 37)));
        estado56.transicoes.add(new Transicao("INF", 74));
        tabela.estados.add(estado56);

        EstadoSintatico estado57 = new EstadoSintatico();
        estado57.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilhar", 75)));
        estado57.acoes.add(new AcaoSintatica("MAIS", new Acao("empilhar", 54)));
        estado57.acoes.add(new AcaoSintatica("MENOS", new Acao("empilhar", 55)));
        tabela.estados.add(estado57);

        EstadoSintatico estado58 = new EstadoSintatico();
        estado58.acoes.add(new AcaoSintatica("ABRE_CHAVE", new Acao("empilhar", 25)));
        estado58.transicoes.add(new Transicao("BK", 76));
        tabela.estados.add(estado58);

        EstadoSintatico estado59 = new EstadoSintatico();
        estado59.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 77)));
        tabela.estados.add(estado59);

        EstadoSintatico estado60 = new EstadoSintatico();
        estado60.acoes.add(new AcaoSintatica("ABRE_PARENTESE", new Acao("empilhar", 78)));
        tabela.estados.add(estado60);

        EstadoSintatico estado61 = new EstadoSintatico();
        estado61.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 81)));
        estado61.acoes.add(new AcaoSintatica("VALOR_BOOLEANO", new Acao("empilhar", 79)));
        estado61.acoes.add(new AcaoSintatica("NOT", new Acao("empilhar", 41)));
        estado61.transicoes.add(new Transicao("BOOL_S", 82));
        estado61.transicoes.add(new Transicao("OP", 80));
        estado61.transicoes.add(new Transicao("OP_REL", 44));
        estado61.transicoes.add(new Transicao("OP_LO", 45));
        tabela.estados.add(estado61);

        EstadoSintatico estado62 = new EstadoSintatico();
        estado62.acoes.add(new AcaoSintatica("ABRE_CHAVE", new Acao("empilhar", 25)));
        estado62.transicoes.add(new Transicao("BK", 83));
        tabela.estados.add(estado62);

        EstadoSintatico estado63 = new EstadoSintatico();
        estado63.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 43)));
        estado63.acoes.add(new AcaoSintatica("VALOR_BOOLEANO", new Acao("empilhar", 40)));
        estado63.acoes.add(new AcaoSintatica("NOT", new Acao("empilhar", 41)));
        estado63.transicoes.add(new Transicao("BOOL_S", 84));
        estado63.transicoes.add(new Transicao("OP", 42));
        estado63.transicoes.add(new Transicao("OP_REL", 44));
        estado63.transicoes.add(new Transicao("OP_LO", 45));
        tabela.estados.add(estado63);

        EstadoSintatico estado64 = new EstadoSintatico();
        estado64.acoes.add(new AcaoSintatica("TIPO", new Acao("reduzir", 26)));
        estado64.acoes.add(new AcaoSintatica("ID", new Acao("reduzir", 26)));
        estado64.acoes.add(new AcaoSintatica("IF", new Acao("reduzir", 26)));
        estado64.acoes.add(new AcaoSintatica("ELSE", new Acao("reduzir", 26)));
        estado64.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 26)));
        estado64.acoes.add(new AcaoSintatica("WHILE", new Acao("reduzir", 26)));
        estado64.acoes.add(new AcaoSintatica("DO", new Acao("reduzir", 26)));
        estado64.acoes.add(new AcaoSintatica("READ", new Acao("reduzir", 26)));
        estado64.acoes.add(new AcaoSintatica("WRITE", new Acao("reduzir", 26)));
        estado64.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 26)));
        tabela.estados.add(estado64);

        EstadoSintatico estado65 = new EstadoSintatico();
        estado65.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("empilhar", 85)));
        tabela.estados.add(estado65);

        EstadoSintatico estado66 = new EstadoSintatico();
        estado66.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("empilhar", 86)));
        tabela.estados.add(estado66);

        EstadoSintatico estado67 = new EstadoSintatico();
        estado67.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("empilhar", 87)));
        tabela.estados.add(estado67);

        EstadoSintatico estado68 = new EstadoSintatico();
        estado68.acoes.add(new AcaoSintatica("TIPO", new Acao("reduzir", 12)));
        estado68.acoes.add(new AcaoSintatica("ID", new Acao("reduzir", 12)));
        estado68.acoes.add(new AcaoSintatica("IF", new Acao("reduzir", 12)));
        // estado68.acoes.add(new AcaoSintatica("ELSE", new Acao("reduzir", 12)));
        estado68.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 12)));
        estado68.acoes.add(new AcaoSintatica("WHILE", new Acao("reduzir", 12)));
        estado68.acoes.add(new AcaoSintatica("DO", new Acao("reduzir", 12)));
        estado68.acoes.add(new AcaoSintatica("READ", new Acao("reduzir", 12)));
        estado68.acoes.add(new AcaoSintatica("WRITE", new Acao("reduzir", 12)));
        estado68.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 12)));
        tabela.estados.add(estado68);

        EstadoSintatico estado69 = new EstadoSintatico();
        estado69.acoes.add(new AcaoSintatica("TIPO", new Acao("reduzir", 13)));
        estado69.acoes.add(new AcaoSintatica("ID", new Acao("reduzir", 13)));
        estado69.acoes.add(new AcaoSintatica("IF", new Acao("reduzir", 13)));
        // estado69.acoes.add(new AcaoSintatica("ELSE", new Acao("reduzir", 13)));
        estado69.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 13)));
        estado69.acoes.add(new AcaoSintatica("WHILE", new Acao("reduzir", 13)));
        estado69.acoes.add(new AcaoSintatica("DO", new Acao("reduzir", 13)));
        estado69.acoes.add(new AcaoSintatica("READ", new Acao("reduzir", 13)));
        estado69.acoes.add(new AcaoSintatica("WRITE", new Acao("reduzir", 13)));
        estado69.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 13)));
        tabela.estados.add(estado69);

        EstadoSintatico estado70 = new EstadoSintatico();
        estado70.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 36)));
        estado70.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 36)));
        estado70.acoes.add(new AcaoSintatica("MAIS", new Acao("reduzir", 36)));
        estado70.acoes.add(new AcaoSintatica("MENOS", new Acao("reduzir", 36)));
        estado70.acoes.add(new AcaoSintatica("VEZES", new Acao("empilhar", 56)));
        estado70.acoes.add(new AcaoSintatica("DIVIDIR", new Acao("empilhar", 57)));
        tabela.estados.add(estado70);

        EstadoSintatico estado71 = new EstadoSintatico();
        estado71.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 37)));
        estado71.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 37)));
        estado71.acoes.add(new AcaoSintatica("MAIS", new Acao("reduzir", 37)));
        estado71.acoes.add(new AcaoSintatica("MENOS", new Acao("reduzir", 37)));
        estado71.acoes.add(new AcaoSintatica("VEZES", new Acao("empilhar", 56)));
        estado71.acoes.add(new AcaoSintatica("DIVIDIR", new Acao("empilhar", 57)));
        tabela.estados.add(estado71);

        EstadoSintatico estado72 = new EstadoSintatico();
        estado72.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 39)));
        estado72.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 39)));
        estado72.acoes.add(new AcaoSintatica("MAIS", new Acao("reduzir", 39)));
        estado72.acoes.add(new AcaoSintatica("MENOS", new Acao("reduzir", 39)));
        estado72.acoes.add(new AcaoSintatica("VEZES", new Acao("reduzir", 39)));
        estado72.acoes.add(new AcaoSintatica("DIVIDIR", new Acao("reduzir", 39)));
        tabela.estados.add(estado72);

        EstadoSintatico estado73 = new EstadoSintatico();
        estado73.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 40)));
        estado73.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 40)));
        estado73.acoes.add(new AcaoSintatica("MAIS", new Acao("reduzir", 40)));
        estado73.acoes.add(new AcaoSintatica("MENOS", new Acao("reduzir", 40)));
        estado73.acoes.add(new AcaoSintatica("VEZES", new Acao("reduzir", 40)));
        estado73.acoes.add(new AcaoSintatica("DIVIDIR", new Acao("reduzir", 40)));
        tabela.estados.add(estado73);

        EstadoSintatico estado74 = new EstadoSintatico();
        estado74.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("reduzir", 42)));
        estado74.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 42)));
        estado74.acoes.add(new AcaoSintatica("MAIS", new Acao("reduzir", 42)));
        estado74.acoes.add(new AcaoSintatica("MENOS", new Acao("reduzir", 42)));
        estado74.acoes.add(new AcaoSintatica("VEZES", new Acao("reduzir", 42)));
        estado74.acoes.add(new AcaoSintatica("DIVIDIR", new Acao("reduzir", 42)));
        tabela.estados.add(estado74);

        EstadoSintatico estado75 = new EstadoSintatico();
        estado75.acoes.add(new AcaoSintatica("TIPO", new Acao("reduzir", 18)));
        estado75.acoes.add(new AcaoSintatica("ID", new Acao("reduzir", 18)));
        estado75.acoes.add(new AcaoSintatica("IF", new Acao("reduzir", 18)));
        estado75.acoes.add(new AcaoSintatica("ELSE", new Acao("empilhar", 88)));
        estado75.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 18)));
        estado75.acoes.add(new AcaoSintatica("WHILE", new Acao("reduzir", 18)));
        estado75.acoes.add(new AcaoSintatica("DO", new Acao("reduzir", 18)));
        estado75.acoes.add(new AcaoSintatica("READ", new Acao("reduzir", 18)));
        estado75.acoes.add(new AcaoSintatica("WRITE", new Acao("reduzir", 18)));
        estado75.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 18)));
        tabela.estados.add(estado75);

        EstadoSintatico estado76 = new EstadoSintatico();
        estado76.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 43)));
        estado76.acoes.add(new AcaoSintatica("VALOR_BOOLEANO", new Acao("empilhar", 40)));
        estado76.acoes.add(new AcaoSintatica("NOT", new Acao("empilhar", 41)));
        estado76.transicoes.add(new Transicao("BOOL_S", 89));
        estado76.transicoes.add(new Transicao("OP", 42));
        estado76.transicoes.add(new Transicao("OP_REL", 44));
        estado76.transicoes.add(new Transicao("OP_LO", 45));
        tabela.estados.add(estado76);

        EstadoSintatico estado77 = new EstadoSintatico();
        estado77.acoes.add(new AcaoSintatica("ID", new Acao("empilhar", 43)));
        estado77.acoes.add(new AcaoSintatica("VALOR_BOOLEANO", new Acao("empilhar", 40)));
        estado77.acoes.add(new AcaoSintatica("NOT", new Acao("empilhar", 41)));
        estado77.transicoes.add(new Transicao("BOOL_S", 90));
        estado77.transicoes.add(new Transicao("OP", 42));
        estado77.transicoes.add(new Transicao("OP_REL", 44));
        estado77.transicoes.add(new Transicao("OP_LO", 45));
        tabela.estados.add(estado77);

        EstadoSintatico estado78 = new EstadoSintatico();
        estado78.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 20)));
        estado78.acoes.add(new AcaoSintatica("FECHA_NOT", new Acao("empilhar", 91)));
        estado78.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("reduzir", 20)));
        estado78.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("reduzir", 20)));
        tabela.estados.add(estado78);

        EstadoSintatico estado79 = new EstadoSintatico();
        estado79.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 22)));
        estado79.acoes.add(new AcaoSintatica("FECHA_NOT", new Acao("empilhar", 92)));
        estado79.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("reduzir", 22)));
        estado79.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("reduzir", 22)));
        tabela.estados.add(estado79);

        EstadoSintatico estado80 = new EstadoSintatico();
        estado80.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 24)));
        estado80.acoes.add(new AcaoSintatica("FECHA_NOT", new Acao("empilhar", 93)));
        estado80.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("reduzir", 24)));
        estado80.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("reduzir", 24)));
        tabela.estados.add(estado80);

        EstadoSintatico estado81 = new EstadoSintatico();
        estado81.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("empilhar", 60)));
        estado81.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("empilhar", 61)));
        tabela.estados.add(estado81);

        EstadoSintatico estado82 = new EstadoSintatico();
        estado82.acoes.add(new AcaoSintatica("TIPO", new Acao("reduzir", 27)));
        estado82.acoes.add(new AcaoSintatica("ID", new Acao("reduzir", 27)));
        estado82.acoes.add(new AcaoSintatica("IF", new Acao("reduzir", 27)));
        // estado82.acoes.add(new AcaoSintatica("ELSE", new Acao("reduzir", 27)));
        estado82.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 27)));
        estado82.acoes.add(new AcaoSintatica("WHILE", new Acao("reduzir", 27)));
        estado82.acoes.add(new AcaoSintatica("DO", new Acao("reduzir", 27)));
        estado82.acoes.add(new AcaoSintatica("READ", new Acao("reduzir", 27)));
        estado82.acoes.add(new AcaoSintatica("WRITE", new Acao("reduzir", 27)));
        estado82.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 27)));
        tabela.estados.add(estado82);

        EstadoSintatico estado83 = new EstadoSintatico();
        estado83.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilhar", 94)));
        estado83.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("empilhar", 60)));
        estado83.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("empilhar", 61)));
        tabela.estados.add(estado83);

        EstadoSintatico estado84 = new EstadoSintatico();
        estado84.acoes.add(new AcaoSintatica("TIPO", new Acao("reduzir", 33)));
        estado84.acoes.add(new AcaoSintatica("ID", new Acao("reduzir", 33)));
        estado84.acoes.add(new AcaoSintatica("IF", new Acao("reduzir", 33)));
        // estado84.acoes.add(new AcaoSintatica("ELSE", new Acao("reduzir", 33)));
        estado84.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 33)));
        estado84.acoes.add(new AcaoSintatica("WHILE", new Acao("reduzir", 33)));
        estado84.acoes.add(new AcaoSintatica("DO", new Acao("reduzir", 33)));
        estado84.acoes.add(new AcaoSintatica("READ", new Acao("reduzir", 33)));
        estado84.acoes.add(new AcaoSintatica("WRITE", new Acao("reduzir", 33)));
        estado84.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 33)));
        tabela.estados.add(estado84);

        EstadoSintatico estado85 = new EstadoSintatico();
        estado85.acoes.add(new AcaoSintatica("TIPO", new Acao("reduzir", 34)));
        estado85.acoes.add(new AcaoSintatica("ID", new Acao("reduzir", 34)));
        estado85.acoes.add(new AcaoSintatica("IF", new Acao("reduzir", 34)));
        // estado85.acoes.add(new AcaoSintatica("ELSE", new Acao("reduzir", 34)));
        estado85.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 34)));
        estado85.acoes.add(new AcaoSintatica("WHILE", new Acao("reduzir", 34)));
        estado85.acoes.add(new AcaoSintatica("DO", new Acao("reduzir", 34)));
        estado85.acoes.add(new AcaoSintatica("READ", new Acao("reduzir", 34)));
        estado85.acoes.add(new AcaoSintatica("WRITE", new Acao("reduzir", 34)));
        estado85.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 34)));
        tabela.estados.add(estado85);

        EstadoSintatico estado86 = new EstadoSintatico();
        estado86.acoes.add(new AcaoSintatica("TIPO", new Acao("reduzir", 35)));
        estado86.acoes.add(new AcaoSintatica("ID", new Acao("reduzir", 35)));
        estado86.acoes.add(new AcaoSintatica("IF", new Acao("reduzir", 35)));
        // estado86.acoes.add(new AcaoSintatica("ELSE", new Acao("reduzir", 35)));
        estado86.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 35)));
        estado86.acoes.add(new AcaoSintatica("WHILE", new Acao("reduzir", 35)));
        estado86.acoes.add(new AcaoSintatica("DO", new Acao("reduzir", 35)));
        estado86.acoes.add(new AcaoSintatica("READ", new Acao("reduzir", 35)));
        estado86.acoes.add(new AcaoSintatica("WRITE", new Acao("reduzir", 35)));
        estado86.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 35)));
        tabela.estados.add(estado86);

        EstadoSintatico estado87 = new EstadoSintatico();
        estado87.acoes.add(new AcaoSintatica("ABRE_CHAVE", new Acao("empilhar", 25)));
        estado87.transicoes.add(new Transicao("BK", 95));
        tabela.estados.add(estado87);

        EstadoSintatico estado88 = new EstadoSintatico();
        estado88.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilhar", 96)));
        estado88.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("empilhar", 60)));
        estado88.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("empilhar", 61)));
        tabela.estados.add(estado88);

        EstadoSintatico estado89 = new EstadoSintatico();
        estado89.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("empilhar", 97)));
        estado89.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("empilhar", 60)));
        estado89.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("empilhar", 61)));
        tabela.estados.add(estado89);

        EstadoSintatico estado90 = new EstadoSintatico();
        estado90.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 21)));
        estado90.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("reduzir", 21)));
        estado90.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("reduzir", 21)));
        tabela.estados.add(estado90);

        EstadoSintatico estado91 = new EstadoSintatico();
        estado91.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 23)));
        estado91.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("reduzir", 23)));
        estado91.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("reduzir", 23)));
        tabela.estados.add(estado91);

        EstadoSintatico estado92 = new EstadoSintatico();
        estado92.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 25)));
        estado92.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("reduzir", 25)));
        estado92.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("reduzir", 25)));
        tabela.estados.add(estado92);

        EstadoSintatico estado93 = new EstadoSintatico();
        estado93.acoes.add(new AcaoSintatica("PONTO_VIRGULA", new Acao("empilhar", 98)));
        tabela.estados.add(estado93);

        EstadoSintatico estado94 = new EstadoSintatico();
        estado94.acoes.add(new AcaoSintatica("TIPO", new Acao("reduzir", 19)));
        estado94.acoes.add(new AcaoSintatica("ID", new Acao("reduzir", 19)));
        estado94.acoes.add(new AcaoSintatica("IF", new Acao("reduzir", 19)));
        // estado94.acoes.add(new AcaoSintatica("ELSE", new Acao("reduzir", 19)));
        estado94.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 19)));
        estado94.acoes.add(new AcaoSintatica("WHILE", new Acao("reduzir", 19)));
        estado94.acoes.add(new AcaoSintatica("DO", new Acao("reduzir", 19)));
        estado94.acoes.add(new AcaoSintatica("READ", new Acao("reduzir", 19)));
        estado94.acoes.add(new AcaoSintatica("WRITE", new Acao("reduzir", 19)));
        estado94.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 19)));
        tabela.estados.add(estado94);

        EstadoSintatico estado95 = new EstadoSintatico();
        estado95.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 31)));
        estado95.acoes.add(new AcaoSintatica("FECHA_NOT", new Acao("reduzir", 31)));
        estado95.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("reduzir", 31)));
        estado95.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("reduzir", 31)));
        tabela.estados.add(estado95);

        EstadoSintatico estado96 = new EstadoSintatico();
        estado96.acoes.add(new AcaoSintatica("FECHA_PARENTESE", new Acao("reduzir", 32)));
        estado96.acoes.add(new AcaoSintatica("FECHA_NOT", new Acao("reduzir", 32)));
        estado96.acoes.add(new AcaoSintatica("SIGN_REL", new Acao("reduzir", 32)));
        estado96.acoes.add(new AcaoSintatica("SIGN_LO", new Acao("reduzir", 32)));
        tabela.estados.add(estado96);

        EstadoSintatico estado97 = new EstadoSintatico();
        estado97.acoes.add(new AcaoSintatica("TIPO", new Acao("reduzir", 28)));
        estado97.acoes.add(new AcaoSintatica("ID", new Acao("reduzir", 28)));
        estado97.acoes.add(new AcaoSintatica("IF", new Acao("reduzir", 28)));
        // estado97.acoes.add(new AcaoSintatica("ELSE", new Acao("reduzir", 28)));
        estado97.acoes.add(new AcaoSintatica("FECHA_CHAVE", new Acao("reduzir", 28)));
        estado97.acoes.add(new AcaoSintatica("WHILE", new Acao("reduzir", 28)));
        estado97.acoes.add(new AcaoSintatica("DO", new Acao("reduzir", 28)));
        estado97.acoes.add(new AcaoSintatica("READ", new Acao("reduzir", 28)));
        estado97.acoes.add(new AcaoSintatica("WRITE", new Acao("reduzir", 28)));
        estado97.acoes.add(new AcaoSintatica("$", new Acao("reduzir", 28)));
        tabela.estados.add(estado97);

    }

    public static void gerarReducoes(Tabela tabela) {
        Reducao reducao0 = new Reducao("S");
        reducao0.transformacoes.add("EXPR");
        tabela.reducoes.add(reducao0);

        Reducao reducao1 = new Reducao("EXPR");
        reducao1.transformacoes.add("DV");
        tabela.reducoes.add(reducao1);

        Reducao reducao2 = new Reducao("EXPR");
        reducao2.transformacoes.add("DV");
        reducao2.transformacoes.add("EXPR");
        tabela.reducoes.add(reducao2);

        Reducao reducao3 = new Reducao("EXPR");
        reducao3.transformacoes.add("ASS");
        tabela.reducoes.add(reducao3);

        Reducao reducao4 = new Reducao("EXPR");
        reducao4.transformacoes.add("ASS");
        reducao4.transformacoes.add("EXPR");
        tabela.reducoes.add(reducao4);

        Reducao reducao5 = new Reducao("EXPR");
        reducao5.transformacoes.add("DE");
        tabela.reducoes.add(reducao5);

        Reducao reducao6 = new Reducao("EXPR");
        reducao6.transformacoes.add("DE");
        reducao6.transformacoes.add("EXPR");
        tabela.reducoes.add(reducao6);

        Reducao reducao7 = new Reducao("EXPR");
        reducao7.transformacoes.add("ER");
        tabela.reducoes.add(reducao7);

        Reducao reducao8 = new Reducao("EXPR");
        reducao8.transformacoes.add("ER");
        reducao8.transformacoes.add("EXPR");
        tabela.reducoes.add(reducao8);

        Reducao reducao9 = new Reducao("EXPR");
        reducao9.transformacoes.add("PROC");
        tabela.reducoes.add(reducao9);

        Reducao reducao10 = new Reducao("EXPR");
        reducao10.transformacoes.add("PROC");
        reducao10.transformacoes.add("EXPR");
        tabela.reducoes.add(reducao10);

        Reducao reducao11 = new Reducao("DV");
        reducao11.transformacoes.add("TIPO");
        reducao11.transformacoes.add("ID");
        reducao11.transformacoes.add("EV");
        tabela.reducoes.add(reducao11);

        Reducao reducao12 = new Reducao("EV");
        reducao12.transformacoes.add("ATRIBUICAO");
        reducao12.transformacoes.add("VALOR");
        reducao12.transformacoes.add("PONTO_VIRGULA");
        tabela.reducoes.add(reducao12);

        Reducao reducao13 = new Reducao("EV");
        reducao13.transformacoes.add("ATRIBUICAO");
        reducao13.transformacoes.add("VALOR_BOOLEANO");
        reducao13.transformacoes.add("PONTO_VIRGULA");
        tabela.reducoes.add(reducao13);

        Reducao reducao14 = new Reducao("EV");
        reducao14.transformacoes.add("PONTO_VIRGULA");
        tabela.reducoes.add(reducao14);

        Reducao reducao15 = new Reducao("ATR");
        reducao15.transformacoes.add("ATRIBUICAO");
        reducao15.transformacoes.add("VALOR");
        tabela.reducoes.add(reducao15);

        Reducao reducao16 = new Reducao("ATR");
        reducao16.transformacoes.add("ATRIBUICAO");
        reducao16.transformacoes.add("OP_AR");
        tabela.reducoes.add(reducao16);

        Reducao reducao17 = new Reducao("ASS");
        reducao17.transformacoes.add("ID");
        reducao17.transformacoes.add("ATR");
        reducao17.transformacoes.add("PONTO_VIRGULA");
        tabela.reducoes.add(reducao17);

        Reducao reducao18 = new Reducao("DE");
        reducao18.transformacoes.add("IF");
        reducao18.transformacoes.add("ABRE_PARENTESE");
        reducao18.transformacoes.add("BOOL_S");
        reducao18.transformacoes.add("FECHA_PARENTESE");
        reducao18.transformacoes.add("BK");
        tabela.reducoes.add(reducao18);

        Reducao reducao19 = new Reducao("DE");
        reducao19.transformacoes.add("IF");
        reducao19.transformacoes.add("ABRE_PARENTESE");
        reducao19.transformacoes.add("BOOL_S");
        reducao19.transformacoes.add("FECHA_PARENTESE");
        reducao19.transformacoes.add("BK");
        reducao19.transformacoes.add("ELSE");
        reducao19.transformacoes.add("BK");
        tabela.reducoes.add(reducao19);

        Reducao reducao20 = new Reducao("BOOL_S");
        reducao20.transformacoes.add("VALOR_BOOLEANO");
        tabela.reducoes.add(reducao20);

        Reducao reducao21 = new Reducao("BOOL_S");
        reducao21.transformacoes.add("NOT");
        reducao21.transformacoes.add("ABRE_NOT");
        reducao21.transformacoes.add("VALOR_BOOLEANO");
        reducao21.transformacoes.add("FECHA_NOT");
        tabela.reducoes.add(reducao21);

        Reducao reducao22 = new Reducao("BOOL_S");
        reducao22.transformacoes.add("OP");
        tabela.reducoes.add(reducao22);

        Reducao reducao23 = new Reducao("BOOL_S");
        reducao23.transformacoes.add("NOT");
        reducao23.transformacoes.add("ABRE_NOT");
        reducao23.transformacoes.add("OP");
        reducao23.transformacoes.add("FECHA_NOT");
        tabela.reducoes.add(reducao23);

        Reducao reducao24 = new Reducao("BOOL_S");
        reducao24.transformacoes.add("ID");
        tabela.reducoes.add(reducao24);

        Reducao reducao25 = new Reducao("BOOL_S");
        reducao25.transformacoes.add("NOT");
        reducao25.transformacoes.add("ABRE_NOT");
        reducao25.transformacoes.add("ID");
        reducao25.transformacoes.add("FECHA_NOT");
        tabela.reducoes.add(reducao25);

        Reducao reducao26 = new Reducao("BK");
        reducao26.transformacoes.add("ABRE_CHAVE");
        reducao26.transformacoes.add("EXPR");
        reducao26.transformacoes.add("FECHA_CHAVE");
        tabela.reducoes.add(reducao26);

        Reducao reducao27 = new Reducao("ER");
        reducao27.transformacoes.add("WHILE");
        reducao27.transformacoes.add("ABRE_PARENTESE");
        reducao27.transformacoes.add("BOOL_S");
        reducao27.transformacoes.add("FECHA_PARENTESE");
        reducao27.transformacoes.add("BK");
        tabela.reducoes.add(reducao27);

        Reducao reducao28 = new Reducao("ER");
        reducao28.transformacoes.add("DO");
        reducao28.transformacoes.add("BK");
        reducao28.transformacoes.add("WHILE");
        reducao28.transformacoes.add("ABRE_PARENTESE");
        reducao28.transformacoes.add("BOOL_S");
        reducao28.transformacoes.add("FECHA_PARENTESE");
        reducao28.transformacoes.add("PONTO_VIRGULA");
        tabela.reducoes.add(reducao28);

        Reducao reducao29 = new Reducao("OP");
        reducao29.transformacoes.add("OP_REL");
        tabela.reducoes.add(reducao29);

        Reducao reducao30 = new Reducao("OP");
        reducao30.transformacoes.add("OP_LO");
        tabela.reducoes.add(reducao30);

        Reducao reducao31 = new Reducao("OP_REL");
        reducao31.transformacoes.add("BOOL_S");
        reducao31.transformacoes.add("SIGNL_REL");
        reducao31.transformacoes.add("ABRE_PARENTESE");
        reducao31.transformacoes.add("BOOL_S");
        reducao31.transformacoes.add("FECHA_PARENTESE");
        tabela.reducoes.add(reducao31);

        Reducao reducao32 = new Reducao("OP_REL");
        reducao32.transformacoes.add("BOOL_S");
        reducao32.transformacoes.add("SIGNL_LO");
        reducao32.transformacoes.add("ABRE_PARENTESE");
        reducao32.transformacoes.add("BOOL_S");
        reducao32.transformacoes.add("FECHA_PARENTESE");
        tabela.reducoes.add(reducao32);

        Reducao reducao33 = new Reducao("PROC");
        reducao33.transformacoes.add("READ");
        reducao33.transformacoes.add("ABRE_PARENTESE");
        reducao33.transformacoes.add("ID");
        reducao33.transformacoes.add("FECHA_PARENTESE");
        reducao33.transformacoes.add("PONTO_VIRGULA");
        tabela.reducoes.add(reducao33);

        Reducao reducao34 = new Reducao("PROC");
        reducao34.transformacoes.add("WRITE");
        reducao34.transformacoes.add("ABRE_PARENTESE");
        reducao34.transformacoes.add("ID");
        reducao34.transformacoes.add("FECHA_PARENTESE");
        reducao34.transformacoes.add("PONTO_VIRGULA");
        tabela.reducoes.add(reducao34);

        Reducao reducao35 = new Reducao("PROC");
        reducao35.transformacoes.add("WRITE");
        reducao35.transformacoes.add("ABRE_PARENTESE");
        reducao35.transformacoes.add("VALOR");
        reducao35.transformacoes.add("FECHA_PARENTESE");
        reducao35.transformacoes.add("PONTO_VIRGULA");
        tabela.reducoes.add(reducao35);

        Reducao reducao36 = new Reducao("OP_AR");
        reducao36.transformacoes.add("OP_AR");
        reducao36.transformacoes.add("MAIS");
        reducao36.transformacoes.add("MID");
        tabela.reducoes.add(reducao36);

        Reducao reducao37 = new Reducao("OP_AR");
        reducao37.transformacoes.add("OP_AR");
        reducao37.transformacoes.add("MENOS");
        reducao37.transformacoes.add("MID");
        tabela.reducoes.add(reducao37);

        Reducao reducao38 = new Reducao("OP_AR");
        reducao38.transformacoes.add("MID");
        tabela.reducoes.add(reducao38);

        Reducao reducao39 = new Reducao("MID");
        reducao39.transformacoes.add("MID");
        reducao39.transformacoes.add("VEZES");
        reducao39.transformacoes.add("INF");
        tabela.reducoes.add(reducao39);

        Reducao reducao40 = new Reducao("MID");
        reducao40.transformacoes.add("MID");
        reducao40.transformacoes.add("DIVIDIR");
        reducao40.transformacoes.add("INF");
        tabela.reducoes.add(reducao40);

        Reducao reducao41 = new Reducao("MID");
        reducao41.transformacoes.add("INF");
        tabela.reducoes.add(reducao41);

        Reducao reducao42 = new Reducao("INF");
        reducao42.transformacoes.add("ABRE_PARENTESE");
        reducao42.transformacoes.add("OP_AR");
        reducao42.transformacoes.add("FECHA_PARENTESE");
        tabela.reducoes.add(reducao42);

        Reducao reducao43 = new Reducao("INF");
        reducao43.transformacoes.add("ID");
        tabela.reducoes.add(reducao43);

        Reducao reducao44 = new Reducao("ATR");
        reducao44.transformacoes.add("ATRIBUICAO");
        reducao44.transformacoes.add("VALOR_BOOLEANO");
        tabela.reducoes.add(reducao44);

    }
}