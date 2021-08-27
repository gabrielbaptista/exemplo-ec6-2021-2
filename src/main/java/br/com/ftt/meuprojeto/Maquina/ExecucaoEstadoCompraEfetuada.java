package br.com.ftt.meuprojeto.Maquina;

import br.com.ftt.meuprojeto.EstadosCompra;
import br.com.ftt.meuprojeto.Entidades.Compra;

public class ExecucaoEstadoCompraEfetuada extends MaquinaEstadoConsole {

    private Compra compra;


    @Override
    public Compra executa() {
        System.out.println("A sua compra " +compra.getId() + " - "+ compra.getDescricao()+ "foi efetuada.");
        System.out.println("Deseja encaminhar para o processo de aprovação?");
        String decisao = System.console().readLine().toUpperCase();
        if (decisao.equals("Y")){
            compra.setEstado(EstadosCompra.APROVACAO);
        }
        return compra;
    }

    
    @Override
    public void  setCompra(Compra compra) {
        this.compra = compra;
    }
    
}
