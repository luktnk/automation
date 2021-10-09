package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Steps {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja {string}")
	public void que_eu_esteja(String appUrl) {
		metodos.abrirNavegador(appUrl);
	}

	@When("eu preencher todas as informacoe para o  cadastro")
	public void eu_preencher_todas_as_informacoe_para_o_cadastro() {
		metodos.escrever("giovannaantonellanunes__giovannaantonellanunes@hydropowermc.com.br", el.getPesquisar());
		metodos.submit(el.getPesquisar());

		metodos.aguardarElemento(el.getNome());
		metodos.escrever("Giovanna", el.getNome());
		
		metodos.aguardarElemento(el.getSobrenome());
		metodos.escrever("Antonella Nunes", el.getSobrenome());
		metodos.submit(el.getSobrenome());
		metodos.pausa(3000);
		
		metodos.aguardarElemento(el.getSenha());
		metodos.escrever("i2ZiakrsqZ", el.getSenha());
		metodos.submit(el.getSenha());
		metodos.pausa(3000);
		
		metodos.aguardarElemento(el.getNome1());
		metodos.escrever("Livia", el.getNome1());
		metodos.submit(el.getNome1());
		metodos.pausa(3000);
		
		metodos.escrever("Vitoria Jesus", el.getSobrenome2());
		metodos.submit(el.getSobrenome2());
		metodos.pausa(3000);
		
		metodos.aguardarElemento(el.getEndereco());
		metodos.escrever("Rua Paulino C. de Souza", el.getEndereco());
		metodos.submit(el.getEndereco());
		metodos.pausa(3000);
		
		metodos.escrever("Gravataí", el.getCidade());
		metodos.submit(el.getCidade());
		metodos.pausa(3000);
		
		metodos.escrever("brasil", el.getPais());
		metodos.submit(el.getPais());
		metodos.pausa(3000);
		
		metodos.escrever("Centro", el.getEndereco2());
		metodos.submit(el.getEndereco2());
		metodos.pausa(3000);
		metodos.click(el.getRegister());

	}

	@Then("as informacao soa validas")
	public void as_informacao_soa_validas() throws IOException {
		metodos.screnShot("cadastro realizado com sucesso");
		metodos.fecharNavegador();

	}

}
