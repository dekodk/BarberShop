package Controller;

import Controller.Helper.AgendaHelper;
import Model.Dao.AgendamentoDAO;
import Model.Dao.ClienteDAO;
import Model.Dao.ServicoDAO;
import View.Agenda;
import entidade.Agendamento;
import entidade.Cliente;
import entidade.Servico;
import java.util.ArrayList;

public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        helper.preencherTabela(agendamentos);
    }
    
    public void atualizaCliente(){
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        helper.preencherClientes(clientes);
    }
    
    public void atualizaServico(){
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        helper.preencherServicos(servicos);
    }
    
    public void atualizaValor(){
        Servico servico =  helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    
    public void agendar(){
        
    }
}
