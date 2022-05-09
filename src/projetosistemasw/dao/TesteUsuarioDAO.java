package projetosistemasw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import projetosistemasw.Conexao;
import projetosistemasw.model.TesteUsuario;
import java.sql.ResultSet;
import projetosistemasw.view.TelaRelatorio;
import projetosistemasw.view.TelaLogin;
/**
 *
 * @author danie
 */
public class TesteUsuarioDAO {
    private Connection c;
    public boolean confirmacaoNomeCPF;
    public boolean confirmacaoLoginSenha;
    

    public TesteUsuarioDAO() {
        this.c = new Conexao().getConnection();
        
        
    }

    public void salvar(TesteUsuario tu) {
        try {
            PreparedStatement st = c.prepareStatement("INSERT INTO usuarios (Nome, Email, Telefone, Celular, Sexo, Endereco, Numero, Complemento, Bairro, Cep, Cidade, Estados, RG, CPF, Usuario, Nascimento, Senha, Imagem) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            st.setString(1, tu.getNome());
            st.setString(2, tu.getEmail());
            st.setString(3, tu.getTelefone());
            st.setString(4, tu.getCelular());
            st.setString(5, tu.getSexo());
            st.setString(6, tu.getEndereco());
            st.setString(7, tu.getNumero());
            st.setString(8, tu.getComplemento());
            st.setString(9, tu.getBairro());
            st.setString(10, tu.getCep());
            st.setString(11, tu.getCidade());
            st.setString(12, tu.getEstados());
            st.setString(13, tu.getRG());
            st.setString(14, tu.getCPF());
            st.setString(15, tu.getUsuario());
            st.setString(16, tu.getNascimento());
            st.setString(17, tu.getSenha());
            st.setString(18, tu.getImagem());
            st.execute();
            st.close();
            

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void logar(TelaLogin tl) {
       
        try {
            ResultSet rs;
            PreparedStatement st = c.prepareStatement("SELECT * FROM usuarios WHERE usuario=? AND Senha=?");
            st.setString(1, tl.txtUsuario.getText());
            st.setString(2, tl.pswSenha.getText());
            rs = st.executeQuery();
            if (rs.next()) { // Se encontrou o usuário na tabela
                //manda a confirmação para a TelaLogin para confirmar o login do usuario
                confirmacaoLoginSenha = true;
            } else { //Senão encontrou o usuário
                confirmacaoLoginSenha = false; 
            }
            st.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void Puxar(TelaLogin tl, TelaRelatorio tr) {
       
        try {
            ResultSet rs;
            PreparedStatement st = c.prepareStatement("SELECT * FROM usuarios WHERE Nome=? AND CPF=?");
            st.setString(1, tr.txtRNome.getText());
            st.setString(2, tr.txtRCPF.getText());
            rs = st.executeQuery();
            if (rs.next()) { // Se encontrou o usuário na tabela
                confirmacaoNomeCPF = true;
            } else { //Senão encontrou o usuário
                confirmacaoNomeCPF = false;
            }
            st.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    
    
    
    /*
    public void Delete(Cliente cliente) {
        try {
            PreparedStatement st = connection.prepareStatement("DELETE FROM usuarios WHERE id=?");
            st.setInt(1, cliente.getId());
            st.execute();
            JOptionPane.showMessageDialog(null, "Cliente Deletado com Sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     */

}}
