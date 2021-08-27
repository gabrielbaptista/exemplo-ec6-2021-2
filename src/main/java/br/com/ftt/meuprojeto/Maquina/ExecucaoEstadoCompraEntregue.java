package br.com.ftt.meuprojeto.Maquina;

import br.com.ftt.meuprojeto.EstadosCompra;
import br.com.ftt.meuprojeto.Entidades.Compra;

public class ExecucaoEstadoCompraEntregue extends MaquinaEstadoConsole {
    private Compra compra;

    @Override
    public Compra executa() {
        System.out.println("A compra foi entregue?");
        String decisao = System.console().readLine().toUpperCase();
        if (decisao.equals("Y")){
            compra.setCompraConcluida(true);
        }
        return compra;
    }

    @Override
    public void  setCompra(Compra compra) {
        this.compra = compra;
    }
    
    
}
