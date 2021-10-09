#Author: lukynk2001@gmail.com

Feature: cadastro do usuario
  eu como usuario desejo realizar o cadastro do usuario 

  Scenario: cadastro do usuario 
    Given que eu esteja "http://automationpractice.com/index.php?controller=authentication&back=my-account"
    
    When eu preencher todas as informacoe para o  cadastro 
   
    Then as informacao soa validas 
   

  