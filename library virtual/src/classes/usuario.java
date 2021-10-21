/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Vitor
 */
@Entity
@Table(name = "usuario", catalog = "lb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.usuarioPK.idusuario = :idusuario"),
    @NamedQuery(name = "Usuario.findByIddepartamento", query = "SELECT u FROM Usuario u WHERE u.usuarioPK.iddepartamento = :iddepartamento"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuario.findByPerfil", query = "SELECT u FROM Usuario u WHERE u.perfil = :perfil"),
    @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email"),
    @NamedQuery(name = "Usuario.findByLogin", query = "SELECT u FROM Usuario u WHERE u.login = :login"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuario.findByDica", query = "SELECT u FROM Usuario u WHERE u.dica = :dica")})
public class Usuario implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuarioPK usuarioPK;
    @Column(name = "nome")
    private String nome;
    @Column(name = "perfil")
    private Integer perfil;
    @Column(name = "email")
    private String email;
    @Column(name = "login")
    private String login;
    @Column(name = "senha")
    private String senha;
    @Column(name = "dica")
    private String dica;

    public Usuario() {
    }

    public Usuario(UsuarioPK usuarioPK) {
        this.usuarioPK = usuarioPK;
    }

    public Usuario(int idusuario, int iddepartamento) {
        this.usuarioPK = new UsuarioPK(idusuario, iddepartamento);
    }

    public UsuarioPK getUsuarioPK() {
        return usuarioPK;
    }

    public void setUsuarioPK(UsuarioPK usuarioPK) {
        this.usuarioPK = usuarioPK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public Integer getPerfil() {
        return perfil;
    }

    public void setPerfil(Integer perfil) {
        Integer oldPerfil = this.perfil;
        this.perfil = perfil;
        changeSupport.firePropertyChange("perfil", oldPerfil, perfil);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        String oldLogin = this.login;
        this.login = login;
        changeSupport.firePropertyChange("login", oldLogin, login);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        String oldDica = this.dica;
        this.dica = dica;
        changeSupport.firePropertyChange("dica", oldDica, dica);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioPK != null ? usuarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuarioPK == null && other.usuarioPK != null) || (this.usuarioPK != null && !this.usuarioPK.equals(other.usuarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Usuario[ usuarioPK=" + usuarioPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
