package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.dao.MovimentacaoDao;

public class TestaMovimentacoesFiltradasPorDataCriteria {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		MovimentacaoDao movimentacaoDao = new MovimentacaoDao(em);
		List<Movimentacao> MovimentacoesFiltradasPorData =  movimentacaoDao.getMovimentacoesFiltradasPorData(null, null, 2020);
		
		for (Movimentacao movimentacao : MovimentacoesFiltradasPorData) {
			System.out.println("Descição -> " + movimentacao.getDescricao());
			System.out.println("Valor -> " + movimentacao.getValor());
			System.out.println("-----------------------------------");
		}
		
		
	}

}
