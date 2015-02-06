/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author sonja
 */
@Entity
@Table(name = "tbl_comic", catalog = "ComicDB", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblComic.findAll", query = "SELECT t FROM TblComic t"),
    @NamedQuery(name = "TblComic.findById", query = "SELECT t FROM TblComic t WHERE t.id = :id"),
    @NamedQuery(name = "TblComic.findByUitgever", query = "SELECT t FROM TblComic t WHERE t.uitgever = :uitgever"),
    @NamedQuery(name = "TblComic.findByTitel", query = "SELECT t FROM TblComic t WHERE t.titel = :titel"),
    @NamedQuery(name = "TblComic.findByPrijs", query = "SELECT t FROM TblComic t WHERE t.prijs = :prijs"),
    @NamedQuery(name = "TblComic.findByIsbn", query = "SELECT t FROM TblComic t WHERE t.isbn = :isbn")})
public class TblComic implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Uitgever")
    private String uitgever;
    @Basic(optional = false)
    @Column(name = "Titel")
    private String titel;
    @Basic(optional = false)
    @Column(name = "Prijs")
    private double prijs;
    @Basic(optional = false)
    @Column(name = "ISBN")
    private String isbn;

    public TblComic() {        
    }

    public TblComic(Integer id) {
        this.id = id;
    }

    public TblComic(Integer id, String uitgever, String titel, double prijs, String isbn) {
        this.id = id;
        this.uitgever = uitgever;
        this.titel = titel;
        this.prijs = prijs;
        this.isbn = isbn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getUitgever() {
        return uitgever;
    }

    public void setUitgever(String uitgever) {
        String oldUitgever = this.uitgever;
        this.uitgever = uitgever;
        changeSupport.firePropertyChange("uitgever", oldUitgever, uitgever);
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        String oldTitel = this.titel;
        this.titel = titel;
        changeSupport.firePropertyChange("titel", oldTitel, titel);
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        double oldPrijs = this.prijs;
        this.prijs = prijs;
        changeSupport.firePropertyChange("prijs", oldPrijs, prijs);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        String oldIsbn = this.isbn;
        this.isbn = isbn;
        changeSupport.firePropertyChange("isbn", oldIsbn, isbn);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblComic)) {
            return false;
        }
        TblComic other = (TblComic) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.TblComic[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
