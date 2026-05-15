
package col.com.mr.sga.servicio;

import col.com.mr.domain.Usuario;
import col.com.mr.sga.datos.UsuarioDAO;
import java.util.List;
import javax.inject.Inject;

public class UsuarioServiceImpl implements UsuarioService {
    
    @Inject
    private UsuarioDAO usuarioDao;
    
    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDao.findAllUsuarios();
    }

    @Override
    public Usuario encontrarUsuarioPorId(Usuario usuario) {
        return usuarioDao.findUsuarioById(usuario);
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarioDao.insertUsuario(usuario);
    }

    @Override
    public void modificarUsuario(Usuario Usuario) {
        usuarioDao.updateUsuario(Usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioDao.deleteUsuario(usuario);
    }
    
}
