package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {
	WebDriver driver;
	WebElement elemento;

	public void abrirNavegador(String appUrl) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
	}

	public void click(By elemento) {
		driver.findElement(elemento).click();
	}

	public void escrever(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void validarTexto(String textoEsperado, By elemento) {

		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);

	}
	public void submit(By elemento) {
	driver.findElement(elemento).submit();	
	}
	
	

	public void clicarPorTexto(String tag, String texto, String passo) {
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//" + tag + "[text()=\"" + texto + "\"]")).click();
		} catch (Exception e) {
			System.err.println("------- Error ao clicar por texto no passo" + passo + " " + e.getMessage());
		}

	}

	public void aguardarElemento(By elemento) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.elementToBeClickable(elemento));
		} catch (Exception e) {
			System.out.println("------------error elemento não visível" + e.getStackTrace());

		}

	}
	public void screnShot(String nome) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(scrFile, destFile);
	}
	public void pausa(int tempo) {

		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.out.println(" ----- erro ao pausar o elemento ----- " + e.getMessage());
		}
	}

	

	

}
