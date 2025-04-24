public class Iphone implements MusicPlayer, Navigator, Telephone {
    @Override
    public void call(String number) {
        System.out.println("Ligando " + number);
    }

    @Override
    public void hangUp() {
        System.out.println("Atendendo a ligação");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Começando o correio de voz");
    }

    @Override
    public void showPage(String pageName) {
        System.out.println("Mostrando página: " + pageName);
    }

    @Override
    public void addNewTab() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando página");
    }

    @Override
    public void playMusic() {
        System.out.println("Tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando música");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selecionando a música: " + music);
    }
}
