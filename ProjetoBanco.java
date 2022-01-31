
package projetobanco;


public class ProjetoBanco {

    
    public static void main(String[] args) {
        ContaBanco02 ps1 = new ContaBanco02();
        ps1.abrirConta("CP");
        ps1.setNumConta(1308);
        ps1.setDono("Lucas Dias");
        
        //ps1.fecharConta();
        
        ps1.estadoAtual();
        
        
        
        
        
       /* ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Luiza Carvalho");
        p1.abrirConta("CL");
        p1.depositar(100);
        p1.sacar(24);
        
        
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Lucas Dias");
        p2.abrirConta("CP");
        p2.depositar(250);
        
        p1.sacar(48.43f);
        p2.sacar(231.23f);
        
        p1.estadoAtual();
        p2.estadoAtual();*/
    } 
    
}
