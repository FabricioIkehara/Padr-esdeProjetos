package Dio.Test;

import Dio.Facade.Facade;
import Dio.Singleton.SingletonEager;
import Dio.Singleton.SingletonLazy;
import Dio.Singleton.SingletonLazyHolder;
import Dio.Strategy.*;

public class Test {
    //Testes relacionados ao design pattern em singleton:
    public static void  main (String[] args){
        SingletonLazy lazy = SingletonLazy .getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);

        //strategy

        Comportamento Defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento Agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(Defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(Agressivo);
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Renilton","04156000");



    }
}


