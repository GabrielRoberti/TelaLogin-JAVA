package org.example;

public class Conexao {

    private JdbcTemplate conexaoDoBanco;

    public Conexao() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:file:./teste_banco");
        dataSource.setUsername("sa");
        dataSource.setPassword("");

        conexaoDoBanco = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexaoDoBanco(){
        return conexaoDoBanco;
    }
}
