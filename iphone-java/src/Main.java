public class Main {
    public static void main(String[] args) throws Exception {
        var iphone = new Iphone();
        iphone.call("1234567890");
        iphone.hangUp();
        iphone.startVoiceMail();
        
        System.out.println("===========");
        
        iphone.showPage("www.google.com");
        iphone.addNewTab();
        iphone.refreshPage();
        
        System.out.println("===========");
    
        iphone.playMusic();
        iphone.pauseMusic();
        iphone.selectMusic("Resenha do Arrocha.mp3");
    }
}
