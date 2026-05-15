
package col.com.mr.sga.datos;

import col.com.mr.domain.Usuario;
import java.util.List;

public interface UsuarioDAO {
    public List<Usuario> findAllUsuarios();
    
    public Usuario findUsuarioById(Usuario usuario);
    
    public void insertUsuario(Usuario usuario);
    
    public void updateUsuario(Usuario usuario);
    
    public void deleteUsuario(Usuario usuario);
}
