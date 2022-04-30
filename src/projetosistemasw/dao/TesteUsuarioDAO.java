
package projetosistemasw.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import projetosistemasw.Conexao;
import projetosistemasw.modelo.TesteUsuario;

/**
 *
 * @author danie
 */
public class TesteUsuarioDAO {
    private Connection c;
    public TesteUsuarioDAO(){
        this.c = new Conexao().getConnection();
    }
    public void salvar(TesteUsuario tu){
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
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }      
    }
    /*
    public void Update(Cliente cliente) {
        try {
            PreparedStatement st = connection.prepareStatement("UPDATE usuarios SET Nome=?, Email=?, Telefone=?, Celular=?, Sexo=?, Endereco=?, Numero=?, Complemeto=?, Bairro=?, Cep=?, Cidade=?, Estados=?, RG=?, CPF=?, Usuario=?, Nascimento=?, Senha=?, Imagem=? WHERE Id=?");
            st.setString(1, "Nome");
            st.setString(2, "Email");
            st.setString(3, "Telefone");
            st.setString(4, "Celular");
            st.setString(5, "Sexo");
            st.setString(6, "Endereco");
            st.setString(7, "Numero");
            st.setString(8, "Complemento");
            st.setString(9, "Bairro");
            st.setString(10, "Cep");
            st.setString(11, "Cidade");
            st.setString(12, "Estados");
            st.setString(13, "RG");
            st.setString(14, "CPF");
            st.setString(15, "Usuario");
            st.setString(16, "Nascimento");
            st.setString(17, "Senha");
            st.setString(18, "Imagem");
            st.setInt(19, cliente.getId());
            st.execute();
            JOptionPane.showMessageDialog(null, "Update feito com Sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void saveOrUpdate(Cliente cliente){
        if(cliente.getId() == 0){
            save(cliente);
        }else{
            Update(cliente);
        }
            
    }
    
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
    
}