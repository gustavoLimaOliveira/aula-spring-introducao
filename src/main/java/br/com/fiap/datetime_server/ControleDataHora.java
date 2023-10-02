package br.com.fiap.datetime_server;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;


@Named(value = "controleDataHora")
@RequestScoped
public class ControleDataHora {

    @EJB
    private BeanDataHora beanDataHora;

    public ControleDataHora() {}


    public BeanDataHora getBeanDataHora() {
        return beanDataHora;
    }

    public void setBeanDataHora(BeanDataHora beanDataHora) {
        this.beanDataHora = beanDataHora;
    }
}
