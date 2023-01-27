package com.example.producto2.model;

import javax.persistence.*;
import java.lang.reflect.Array;

@Entity
@Table(name = "Pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long NPedido;
    private long idMenu;

    public Pedido(Long NPedido,long idMenu) {
        this.NPedido = NPedido;
        this.idMenu = idMenu;
    }

    public Pedido() {

    }

    public void setNPedido(Long id) {
        this.NPedido = id;
    }

    public Long getNPEdido() {
        return NPedido;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public Long getIdMenu() {
        return idMenu;
    }

}
