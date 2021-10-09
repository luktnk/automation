package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By pesquisar = By.xpath("//*[@id=\"email_create\"]");
	private By Nome = By.xpath("//*[@id=\"customer_firstname\"]");
	private By sobrenome = By.xpath("//*[@id=\"customer_lastname\"]");
	private By senha = By.xpath("//*[@id=\"passwd\"]");
	private By nome1 = By.xpath("//*[@id=\"firstname\"]");
	private By sobrenome2 = By.xpath("//*[@id=\"account-creation_form\"]/div[2]/p[2]");
	private By endereco = By.xpath("//*[@id=\"address1\"]");
	private By cidade = By.xpath("//*[@id=\"account-creation_form\"]/div[2]/p[6]");
	private By pais = By.xpath("//*[@id=\"account-creation_form\"]/div[2]/p[9]");
	private By endereco2 = By.xpath("//*[@id=\"account-creation_form\"]/div[2]/p[13]");
	private By register = By.xpath("//*[@id=\"submitAccount\"]");

	public By getPesquisar() {
		return pesquisar;
	}

	public By getSobrenome() {
		return sobrenome;
	}

	public By getSenha() {
		return senha;
	}

	public By getNome1() {
		return nome1;
	}

	public By getSobrenome2() {
		return sobrenome2;
	}

	public By getEndereco() {
		return endereco;
	}

	public By getCidade() {
		return cidade;
	}

	public By getPais() {
		return pais;
	}

	public By getEndereco2() {
		return endereco2;
	}

	public By getNome() {
		return Nome;
	}

	public By getRegister() {
		return register;
	}

	

}
