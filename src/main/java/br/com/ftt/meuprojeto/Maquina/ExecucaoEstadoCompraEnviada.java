package br.com.ftt.meuprojeto.Maquina;
import br.com.ftt.meuprojeto.EstadosCompra;
import br.com.ftt.meuprojeto.Entidades.Compra;

public class ExecucaoEstadoCompraEnviada extends MaquinaEstadoConsole {
    private Compra compra;

    @Override
    public Compra executa() {
        System.out.println("A compra foi separada?");
        String decisao = System.console().readLine().toUpperCase();
        if (decisao.equals("Y")){
            compra.setEstado(EstadosCompra.ENTREGA);
        }
        return compra;
    }

    @Override
    public void  setCompra(Compra compra) {
        this.compra = compra;
    }
    
    
}
