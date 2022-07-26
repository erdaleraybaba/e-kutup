package com.kutuphhane.yeni.model;


import javax.persistence.*;
import com.kutuphhane.yeni.model.Uye;

@Entity
@Table(name = "Siparisler")
public class Siparis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "uye_id")
    private Uye uye;

    //private List<String> KitapList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }

//    public List<String> getKitapList() {
//        return KitapList;
//    }
//
//    public void setKitapList(List<String> kitapList) {
//        KitapList = kitapList;
//    }

    public Uye getUye() {
        return uye;
    }

    public void setUye(Uye uye) {
        this.uye = uye;
    }
}
