package br.com.fiap.datetime_server;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.Stateless;

import java.text.SimpleDateFormat;
import java.util.Calendar;


@Stateless
public class BeanDataHora {

    public BeanDataHora() {
        System.out.println("Usou o contrutor do beanDataHora");
    }

    public String getDataHoraDoServidor() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:sss");
        return simpleDateFormat.format(Calendar.getInstance().getTime());
    }

    @PostConstruct
    public void iniciar() {
        System.out.println("Usou o método iniciar do beanDataHora");
    }

    @PreDestroy
    public void destruir() {
        System.out.println("Usou o método destruir do beanDataHora");
    }
}
