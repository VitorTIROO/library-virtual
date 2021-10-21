/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Vitor
 */
@Embeddable
public class UsuarioPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idusuario")
    private int idusuario;
    @Basic(optional = false)
    @Column(name = "iddepartamento")
    private int iddepartamento;

    public UsuarioPK() {
    }

    public UsuarioPK(int idusuario, int iddepartamento) {
        this.idusuario = idusuario;
        this.iddepartamento = iddepartamento;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idusuario;
        hash += (int) iddepartamento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        if (this.idusuario != other.idusuario) {
            return false;
        }
        if (this.iddepartamento != other.iddepartamento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.UsuarioPK[ idusuario=" + idusuario + ", iddepartamento=" + iddepartamento + " ]";
    }
    
}
